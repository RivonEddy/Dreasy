package com.creditline.Dreasy.Fragments.Recruiter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.creditline.Dreasy.MainActivity2;
import com.creditline.Dreasy.R;

public class Pop extends Activity {

    private Button btn;
    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_up_order);

        btn = (Button) findViewById(R.id.submit_btn);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.8));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Pop.this, Pop_up_last.class);
                startActivity(intent);
                Toast.makeText(Pop.this, "Driver successfully recruited", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
