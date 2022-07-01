package com.creditline.Dreasy.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.creditline.Dreasy.R;

public class Bio extends Fragment {

    private RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    private Context context;

    public static Bio newInstance(){
        Bio frag = new Bio();
        return frag;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bio_fragment, container, false);

        radioButton1 = (RadioButton) v.findViewById(R.id.rad_btn1);
        radioButton2 = (RadioButton) v.findViewById(R.id.rad_btn2);
        radioButton3 = (RadioButton) v.findViewById(R.id.rad_btn3);
        radioButton4 = (RadioButton) v.findViewById(R.id.rad_btn4);

//        radioButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(radioButton2.isChecked()){
//                    Toast.makeText(context, "Status Availability Changed", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

                return v;
    }
}
