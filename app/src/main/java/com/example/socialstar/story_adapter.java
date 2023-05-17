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

public class story_adapter extends RecyclerView.Adapter<story_adapter.ViewHolder> {
   Context context;
   ArrayList<story_str_class> model_story;
   public story_adapter(Context context,ArrayList<story_str_class> model_story){
       this.context=context;
       this.model_story=model_story;
   }
    @Override
    public story_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.story_design,parent,false);
       ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull story_adapter.ViewHolder holder, int position) {

       holder.profile_img.setImageResource(model_story.get(position).profile_img);
       holder.username.setText(model_story.get(position).username);
    }

    @Override
    public int getItemCount() {
        return model_story.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       ImageView profile_img;
       TextView username;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profile_img=itemView.findViewById(R.id.profile_img);
            username=itemView.findViewById(R.id.username);
        }
    }
}
