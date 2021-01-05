package com.akexorcist.dashlinerecyclerview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.annotation.ColorInt
import kotlin.math.roundToInt

class DotLineView : View {
    @ColorInt
    private var dotColor = Color.WHITE
        set(value) {
            field = value
            invalidate()
        }
    private var dotCount = 5
        set(value) {
            field = value
            invalidate()
        }
    private var isMirror = false
        set(value) {
            field = value
            invalidate()
        }

    private val paint = Paint()

    constructor(context: Context?, attrs: AttributeSet) : super(context, attrs) {
        setup(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        setup(attrs)
    }

    @Suppress("unused")
    constructor(context: Context?, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        setup(attrs)
    }

    private fun setup(attrs: AttributeSet) {
        setupStyleable(attrs)
        setupCanvasComponent()
    }

    private fun setupStyleable(attrs: AttributeSet) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.DotLineView)
        dotColor = typedArray.getColor(R.styleable.DotLineView_dlv_dotColor, Color.WHITE)
        dotCount = typedArray.getInt(R.styleable.DotLineView_dlv_dotCount, 5)
        isMirror = typedArray.getBoolean(R.styleable.DotLineView_dlv_isMirror, false)
        typedArray.recycle()
    }

    private fun setupCanvasComponent() {
        paint.color = dotColor
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val width = width.toFloat()
        val height = height.toFloat()
        val dotSpacing = (height * 2 - width * dotCount) / (dotCount + 1)
        val dotCount = (dotCount.toFloat() / 2).roundToInt()
        for (index in 0 until dotCount) {
            val cx = width / 2f
            val cy: Float = if (isMirror) {
                height - width * index - dotSpacing * (index + 1) - width / 2
            } else {
                width * index + dotSpacing * (index + 1) + width / 2
            }
            val radius = width / 2f
            canvas.drawCircle(cx, cy, radius, paint)
        }
    }
}
