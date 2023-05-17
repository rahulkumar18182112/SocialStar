package com.example.socialstar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class my_firend_adapter extends RecyclerView.Adapter<my_firend_adapter.ViewHolder>{


    Context context;
    ArrayList<my_friend_str_class> model_my_friend;

    public my_firend_adapter(Context context, ArrayList<my_friend_str_class> model_my_friend) {
        this.context = context;
        this.model_my_friend = model_my_friend;
    }


    @Override
    public my_firend_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.my_friend_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull my_firend_adapter.ViewHolder holder, int position) {
holder.my_friend.setImageResource(model_my_friend.get(position).my_friend);
    }

    @Override
    public int getItemCount() {
        return model_my_friend.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView my_friend;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            my_friend=itemView.findViewById(R.id.my_friend);
        }
    }
}
