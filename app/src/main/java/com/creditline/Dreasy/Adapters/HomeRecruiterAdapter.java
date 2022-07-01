package com.creditline.Dreasy.Adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.creditline.Dreasy.Models.HomeRecruiterModel;
import com.creditline.Dreasy.R;

import java.util.List;

public class HomeRecruiterAdapter extends RecyclerView.Adapter<HomeRecruiterAdapter.MyViewHolder> {

    Context context;
    List<HomeRecruiterModel> mData;

    public HomeRecruiterAdapter(Context context, List<HomeRecruiterModel> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.recycler_home, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.driver_pic.setImageResource(mData.get(position).getDriver_pic());
        holder.driver_name.setText(mData.get(position).getDriver_name());
        holder.driver_status.setText(mData.get(position).getDriver_status());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView driver_pic;
        private TextView driver_name;
        private TextView driver_status;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            driver_pic = (ImageView) itemView.findViewById(R.id.driver_pic);
            driver_name = (TextView) itemView.findViewById(R.id.driver_name);
            driver_status = (TextView) itemView.findViewById(R.id.driver_status);

        }

    }

}
