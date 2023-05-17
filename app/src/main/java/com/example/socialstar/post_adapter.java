package com.example.socialstar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class post_adapter extends RecyclerView.Adapter<post_adapter.ViewHolder> {
    Context context;
    ArrayList<post_str_class> model_post;
    public post_adapter( Context context,
    ArrayList<post_str_class> model_post){
        this.context=context;
        this.model_post=model_post;

    }
    @Override
    public post_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.post_design,parent,false);
       ViewHolder viewHolder=new ViewHolder(view);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull post_adapter.ViewHolder holder, int position) {
holder.caption.setText(model_post.get(position).caption);
holder.post.setImageResource(model_post.get(position).post);
    }

    @Override
    public int getItemCount() {
        return model_post.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView post;
        TextView caption;
        ImageView menu_dots_post;
        ImageView like;
        ImageView comment;
        ImageView share;
        TextView like_count;
        TextView comment_count;
        TextView share_count;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            post=itemView.findViewById(R.id.post);
            caption=itemView.findViewById(R.id.caption);
            menu_dots_post=itemView.findViewById(R.id.menu_dot_post);
            like=itemView.findViewById(R.id.like);
            comment=itemView.findViewById(R.id.comment);
            share=itemView.findViewById(R.id.share);
            like_count=itemView.findViewById(R.id.like_count);
            comment_count=itemView.findViewById(R.id.comment_count);
            share_count=itemView.findViewById(R.id.share_count);
        }
    }
}
