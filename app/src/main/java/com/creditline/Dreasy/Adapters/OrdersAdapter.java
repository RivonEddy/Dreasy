package com.creditline.Dreasy.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.creditline.Dreasy.Models.OrdersModel;
import com.creditline.Dreasy.R;

import org.w3c.dom.Text;

import java.util.List;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.MyViewHolder> {

    Context context;
    List<OrdersModel> mData;

    public OrdersAdapter(Context context, List<OrdersModel> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.recyler_orders, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.order_driver_pic.setImageResource(mData.get(position).getOrder_driver_pic());
        holder.order_driver_name.setText(mData.get(position).getOrder_driver_name());
        holder.order_status.setText(mData.get(position).getOrder_status());
        holder.order_duration.setText(mData.get(position).getOrder_duration());
        holder.order_rating1.setImageResource(mData.get(position).getOrder_rating1());
        holder.order_rating2.setText(mData.get(position).getOrder_rating2());
        holder.order_status_pic.setImageResource(mData.get(position).getOrder_status_pic());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView order_driver_pic;
        private TextView order_driver_name;
        private TextView order_status;
        private TextView order_duration;
        private ImageView order_rating1;
        private TextView order_rating2;
        private ImageView order_status_pic;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            order_driver_pic = (ImageView) itemView.findViewById(R.id.order_driver_pic);
            order_driver_name = (TextView) itemView.findViewById(R.id.order_driver_name);
            order_status = (TextView) itemView.findViewById(R.id.order_status);
            order_duration = (TextView) itemView.findViewById(R.id.order_duration);
            order_rating1 = (ImageView) itemView.findViewById(R.id.order_rating1);
            order_rating2 = (TextView) itemView.findViewById(R.id.order_rating2);
            order_status_pic = (ImageView) itemView.findViewById(R.id.order_staus_pic);
        }
    }
}
