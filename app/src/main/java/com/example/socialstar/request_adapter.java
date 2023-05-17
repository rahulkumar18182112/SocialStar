package com.example.socialstar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class request_adapter extends RecyclerView.Adapter<request_adapter.ViewHolder> {
   Context context;
    ArrayList<request_str> model_R;

    public request_adapter(Context context, ArrayList<request_str> model_R) {
        this.context = context;
        this.model_R = model_R;
    }



    @Override
    public request_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.request_desing,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull request_adapter.ViewHolder holder, int position) {

        holder.profile_img.setImageResource(model_R.get(position).profile_img);
        holder.username.setText(model_R.get(position).username);
        holder.msg.setText(model_R.get(position).msg);
        holder.time.setText(model_R.get(position).time);
    }

    @Override
    public int getItemCount() {
        return model_R.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profile_img;
        TextView username;
        TextView msg;
        TextView time;
        Button accept,decline;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profile_img=itemView.findViewById(R.id.profile_img);
            username=itemView.findViewById(R.id.username);
            msg=itemView.findViewById(R.id.msg);
            time=itemView.findViewById(R.id.time);
            accept=itemView.findViewById(R.id.accept);
            decline=itemView.findViewById(R.id.decline);
        }
    }
}
