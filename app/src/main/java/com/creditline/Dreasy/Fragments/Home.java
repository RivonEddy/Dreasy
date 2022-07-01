package com.creditline.Dreasy.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.creditline.Dreasy.Adapters.HomeDriverAdapter;
import com.creditline.Dreasy.Models.HomeDriverModel;
import com.creditline.Dreasy.R;
import com.creditline.Dreasy.ViewRecyclerDriverActivity;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {

    private RecyclerView recyclerView;
    private List<HomeDriverModel> homeDriverModelList;
    private Context context;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    public static Home newInstance(){
        Home frag = new Home();
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        homeDriverModelList = new ArrayList<>();
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_1,
                "Sophia Penny",
                "Successful",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_2,
                "Sophia Penny",
                "Successful",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_3,
                "Sophia Penny",
                "Failed",
                R.drawable.ic_baseline_sentiment_very_dissatisfied_24));
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_4,
                "John Doe",
                "Failed",
                R.drawable.ic_baseline_sentiment_very_dissatisfied_24));
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_5,
                "John Doe",
                "Successful",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_6,
                "John Doe",
                "Successful",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_7,
                "Sophia Penny",
                "Successful",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_8,
                "John Doe",
                "Failed",
                R.drawable.ic_baseline_sentiment_very_dissatisfied_24));
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_9,
                "Sophia Penny",
                "Successful",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_10,
                "Sophia Penny",
                "Successful",
                R.drawable.ic_baseline_sentiment_very_satisfied_24));
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_11,
                "John Doe",
                "Failed",
                R.drawable.ic_baseline_sentiment_very_dissatisfied_24));
        homeDriverModelList.add(new HomeDriverModel(R.drawable.img_12,
                "John Doe",
                "Failed",
                R.drawable.ic_baseline_sentiment_very_dissatisfied_24));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_home_driver);
        HomeDriverAdapter homeDriverAdapter = new HomeDriverAdapter(getContext(), homeDriverModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(homeDriverAdapter);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(Home.this, ViewRecyclerDriverActivity.class);
            }
        });

        return view;
    }
}
