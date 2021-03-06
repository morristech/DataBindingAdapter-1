package com.example.jiudeng009.databindingadapter.adapter;

import android.util.Log;
import android.view.View;


import com.example.jiudeng009.databindingadapter.R;
import com.example.jiudeng009.databindingadapter.databinding.ItemText2Binding;
import com.example.jiudeng009.databindingadapter.databinding.ItemTextBinding;
import com.example.jiudeng009.databindingadapter.model.TextData;
import com.wang.baseadapter.BaseRecyclerViewAdapter;
import com.wang.baseadapter.BaseViewHolder;
import com.wang.baseadapter.model.RecyclerViewItemArray;

/**
 * Created on 2016/6/6.
 * Author: wang
 */

public class TextAdapter extends BaseRecyclerViewAdapter {

    public static final int TYPE_TEXT_1 = 1;
    public static final int TYPE_TEXT_2 = 2;

    public TextAdapter(RecyclerViewItemArray itemArray) {
        super(itemArray);
        addItemType(TYPE_TEXT_1, R.layout.item_text);
        addItemType(TYPE_TEXT_2, R.layout.item_text_2);
    }

    @Override
    protected void onBindDefViewHolder(BaseViewHolder holder, RecyclerViewItemArray itemArray, int position, int viewType) {
        if (viewType == TYPE_TEXT_1){
            ItemTextBinding binding = (ItemTextBinding) holder.binding;
            binding.setData((TextData) itemArray.get(position).getData());
        }
        else if (viewType == TYPE_TEXT_2){
            ItemText2Binding binding = (ItemText2Binding) holder.binding;
            binding.setData((TextData) itemArray.get(position).getData());
        }
    }

    @Override
    protected void initItemListener(final BaseViewHolder vh, int viewType) {
        super.initItemListener(vh, viewType);
        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TextAdapter", vh.getAdapterPosition() + "");
            }
        });
    }

}
