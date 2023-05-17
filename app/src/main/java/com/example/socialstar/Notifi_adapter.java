package com.example.socialstar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Notifi_adapter extends RecyclerView.Adapter<Notifi_adapter.ViewHolder> {


    Context context;
    ArrayList<notify_str_class> model_N;
    public Notifi_adapter(Context context,ArrayList<notify_str_class> model_N){
        this.context=context;
        this.model_N=model_N;

    }

    @Override
    public Notifi_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.notification_design,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull Notifi_adapter.ViewHolder holder, int position) {
        holder.profile_img.setImageResource(model_N.get(position).profile_img);
        holder.username.setText(model_N.get(position).username);
        holder.msg.setText(model_N.get(position).msg);
        holder.time.setText(model_N.get(position).time);

    }

    @Override
    public int getItemCount() {
        return model_N.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profile_img;
        TextView username;
        TextView msg;
        TextView time;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profile_img=itemView.findViewById(R.id.profile_img);
            username=itemView.findViewById(R.id.username);
            msg=itemView.findViewById(R.id.msg);
            time=itemView.findViewById(R.id.time);



        }
    }
}
