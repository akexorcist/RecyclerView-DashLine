package com.akexorcist.dashlinerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Akexorcist on 11/5/2016 AD.
 */

public class SomethingAdapter extends RecyclerView.Adapter<SomethingViewHolder> {
    private List<SomethingData> somethingList;

    public SomethingAdapter(List<SomethingData> somethingList) {
        this.somethingList = somethingList;
    }

    @Override
    public SomethingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_something_card, parent, false);
        return new SomethingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SomethingViewHolder holder, int position) {
        SomethingData something = somethingList.get(position);
        holder.tvTitle.setText(something.getTitle());
        holder.tvContent.setText(something.getContent());
        holder.tvReleaseDate.setText(something.getReleaseDate());
        holder.dlvHeader.setVisibility(position == 0 ? View.INVISIBLE : View.VISIBLE);
        holder.dlvFooter.setVisibility(position == getItemCount() - 1 ? View.INVISIBLE : View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return somethingList.size();
    }
}
