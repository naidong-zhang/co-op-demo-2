package com.rrc.coopdemo2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.ItemViewHolder> {

    private static final String TAG = "CommentsAdapter";
    private Comment[] mDataset;

    public CommentsAdapter(Comment[] dataset) {
        mDataset = dataset;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder called");
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rcl_row_item, parent, false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Log.d(TAG, "Bind Element " + position);
        holder.updateView(mDataset[position], position);
    }

    @Override
    public int getItemCount() {
//        Log.d(TAG, "getItemCount called");
        return mDataset.length;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView lblUsername;
        private TextView lblComment;
        private View itemLayout;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            lblUsername = itemView.findViewById(R.id.lblUserName);
            lblComment = itemView.findViewById(R.id.lblComment);
            itemLayout = itemView.findViewById(R.id.itemLayout);
        }

        public void updateView(Comment comment, int position) {
            lblUsername.setText(comment.getUserName());
            lblComment.setText(comment.getComment());
            if (position % 2 == 1) {
                itemLayout.setBackgroundResource(R.color.bg_grey2);
            } else {
                itemLayout.setBackgroundResource(R.color.bg_grey1);
            }

        }
    }
}
