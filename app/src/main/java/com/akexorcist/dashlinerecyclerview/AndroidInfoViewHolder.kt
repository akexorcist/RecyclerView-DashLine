package com.akexorcist.dashlinerecyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.akexorcist.dashlinerecyclerview.databinding.ViewAndroidInfoBinding

class AndroidInfoViewHolder(
    val binding: ViewAndroidInfoBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(
        info: AndroidInfo,
        position: Int,
        total: Int
    ) {
        binding.tvTitle.text = info.title
        binding.tvContent.text = info.content
        binding.tvReleaseDate.text = info.releaseDate
        binding.dlvHeader.visibility = if (position == 0) View.INVISIBLE else View.VISIBLE
        binding.dlvFooter.visibility = if (position == total - 1) View.INVISIBLE else View.VISIBLE
    }
}
