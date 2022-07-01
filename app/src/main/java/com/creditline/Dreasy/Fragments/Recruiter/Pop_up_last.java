package com.creditline.Dreasy.Fragments.Recruiter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.creditline.Dreasy.MainActivity2;
import com.creditline.Dreasy.R;

public class Pop_up_last extends Activity {

    private Button btn1;
    private Intent intent1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_order);

        btn1 = (Button) findViewById(R.id.okay_btn);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.8));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent1 = new Intent(Pop_up_last.this, MainActivity2.class);
                startActivity(intent1);
                Toast.makeText(Pop_up_last.this, "Done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
