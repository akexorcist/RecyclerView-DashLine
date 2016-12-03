package com.akexorcist.dashlinerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Akexorcist on 11/5/2016 AD.
 */

public class SomethingViewHolder extends RecyclerView.ViewHolder {
    public TextView tvTitle;
    public TextView tvContent;
    public TextView tvReleaseDate;
    public DotLineView dlvHeader;
    public DotLineView dlvFooter;

    public SomethingViewHolder(View itemView) {
        super(itemView);
        tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
        tvContent = (TextView) itemView.findViewById(R.id.tv_content);
        tvReleaseDate = (TextView) itemView.findViewById(R.id.tv_release_date);
        dlvHeader = (DotLineView) itemView.findViewById(R.id.dlv_header);
        dlvFooter = (DotLineView) itemView.findViewById(R.id.dlv_footer);
    }
}
