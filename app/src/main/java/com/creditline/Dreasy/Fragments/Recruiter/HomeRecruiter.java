package com.creditline.Dreasy.Fragments.Recruiter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.creditline.Dreasy.Adapters.HomeRecruiterAdapter;
import com.creditline.Dreasy.Fragments.Home;
import com.creditline.Dreasy.MainActivity;
import com.creditline.Dreasy.Models.HomeRecruiterModel;
import com.creditline.Dreasy.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class HomeRecruiter extends Fragment {

    private RecyclerView recyclerView;
    private List<HomeRecruiterModel> homeRecruiterModelList;
    private Context context;
    FloatingActionButton fab;
    private ImageView imageView;
    private Intent intent;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    public static HomeRecruiter newInstance(){
        HomeRecruiter frag = new HomeRecruiter();
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        homeRecruiterModelList = new ArrayList<>();
        homeRecruiterModelList.add(new HomeRecruiterModel(R.drawable.img_11,
                "John Doe",
                "Online"));


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_recruiter, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_home_recruiter);
        HomeRecruiterAdapter homeRecruiterAdapter = new HomeRecruiterAdapter(getContext(), homeRecruiterModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(homeRecruiterAdapter);

        imageView = (ImageView) view.findViewById(R.id.recruit_driver);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(context, Pop.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
