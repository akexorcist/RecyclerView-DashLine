package com.akexorcist.dashlinerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akexorcist.dashlinerecyclerview.databinding.ViewAndroidInfoBinding

class AndroidInfoAdapter(
    private val infoList: List<AndroidInfo>
) : RecyclerView.Adapter<AndroidInfoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = AndroidInfoViewHolder(
        ViewAndroidInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: AndroidInfoViewHolder, position: Int) {
        infoList.getOrNull(position)?.let { info ->
            holder.bind(info, position, itemCount)
        }
    }

    override fun getItemCount(): Int = infoList.size
}
