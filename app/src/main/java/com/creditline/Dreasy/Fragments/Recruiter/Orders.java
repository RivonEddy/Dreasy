package com.creditline.Dreasy.Fragments.Recruiter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.creditline.Dreasy.Adapters.OrdersAdapter;
import com.creditline.Dreasy.Fragments.Home;
import com.creditline.Dreasy.Models.OrdersModel;
import com.creditline.Dreasy.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Orders extends Fragment {

    private RecyclerView recyclerView;
    private List<OrdersModel> ordersModelList;
    private Context context;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    public static Orders newInstance(){
        Orders frag = new Orders();
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ordersModelList = new ArrayList<>();
        ordersModelList.add(new OrdersModel(R.drawable.img_1,
                "Sophia Penny",
                "Successful",
                "1 week",
                R.drawable.ic_baseline_star_24,
                "5.0",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        ordersModelList.add(new OrdersModel(R.drawable.img_2,
                "Sophia Penny",
                "Successful",
                "1 week",
                R.drawable.ic_baseline_star_24,
                "4.5",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        ordersModelList.add(new OrdersModel(R.drawable.img_3,
                "Sophia Penny",
                "Successful",
                "1 week",
                R.drawable.ic_baseline_star_24,
                "4.5",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        ordersModelList.add(new OrdersModel(R.drawable.img_4,
                "John Doe",
                "Successful",
                "1 week",
                R.drawable.ic_baseline_star_24,
                "5.0",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        ordersModelList.add(new OrdersModel(R.drawable.img_5,
                "John Doe",
                "Successful",
                "1 day",
                R.drawable.ic_baseline_star_24,
                "4.5",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        ordersModelList.add(new OrdersModel(R.drawable.img_6,
                "John Doe",
                "Failed",
                "1 day",
                R.drawable.ic_baseline_star_24,
                "0.0",
                R.drawable.ic_baseline_sentiment_very_dissatisfied_24));
        ordersModelList.add(new OrdersModel(R.drawable.img_7,
                "Sophia Penny",
                "Failed",
                "1 day",
                R.drawable.ic_baseline_star_24,
                "0.0",
                R.drawable.ic_baseline_sentiment_very_dissatisfied_24));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.orders_fragment, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view_orders);
        OrdersAdapter ordersAdapter = new OrdersAdapter(getContext(), ordersModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(ordersAdapter);

        return v;
    }
}
