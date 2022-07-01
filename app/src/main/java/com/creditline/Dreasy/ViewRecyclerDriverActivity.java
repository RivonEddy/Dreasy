package com.creditline.Dreasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ViewRecyclerDriverActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recycler_driver);
        getSupportActionBar().setTitle("Your Recruiters");

        button = (Button) findViewById(R.id.recruit_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ViewRecyclerDriverActivity.this, "Not Specified", Toast.LENGTH_SHORT).show();
            }
        });

    }
}