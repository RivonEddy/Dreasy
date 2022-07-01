package com.creditline.Dreasy.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.creditline.Dreasy.MainActivity;
import com.creditline.Dreasy.Models.HomeDriverModel;
import com.creditline.Dreasy.R;

import java.util.List;

public class HomeDriverAdapter extends RecyclerView.Adapter<HomeDriverAdapter.MyViewHolder> {

    Context context;
    List<HomeDriverModel> mData;

    public HomeDriverAdapter(Context context, List<HomeDriverModel> mData){
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.recycler_home_driver, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i){

        myViewHolder.recruiter_pic.setImageResource(mData.get(i).getRecruiter_pic());
        myViewHolder.recruiter_name.setText(mData.get(i).getRecruiter_name());
        myViewHolder.trans_status_txt.setText(mData.get(i).getTransaction_status());
        myViewHolder.status_img.setImageResource(mData.get(i).getStatus_pic());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

//        private CircleImageView
        private ImageView recruiter_pic;
        private TextView recruiter_name;
        private TextView trans_status_txt;
        private ImageView status_img;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            recruiter_pic = (ImageView) itemView.findViewById(R.id.recruiter_pic);
            recruiter_name = (TextView) itemView.findViewById(R.id.recruiter_name);
            trans_status_txt = (TextView) itemView.findViewById(R.id.transaction_status);
            status_img = (ImageView) itemView.findViewById(R.id.img_status);
        }
    }

}


