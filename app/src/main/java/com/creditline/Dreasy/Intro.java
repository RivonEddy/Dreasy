package com.creditline.Dreasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.thekhaeng.pushdownanim.PushDownAnim;

public class Intro extends AppCompatActivity {

    Button butt, butt1;
    Intent intent, intent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);
        getSupportActionBar().hide();

        butt = (Button) findViewById(R.id.intro_log_btn);
        butt1 = (Button) findViewById(R.id.intro_reg_btn);

        PushDownAnim.setPushDownAnimTo(butt)
                .setScale(PushDownAnim.MODE_STATIC_DP, 20)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_RELEASE_DURATION)
                .setInterpolatorPush(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setInterpolatorRelease(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intro.this, Login.class);
                startActivity(intent);
            }
        });

        PushDownAnim.setPushDownAnimTo(butt1)
                .setScale(PushDownAnim.MODE_STATIC_DP, 20)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_RELEASE_DURATION)
                .setInterpolatorPush(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setInterpolatorRelease(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent = new Intent(Intro.this, Register.class);
                        startActivity(intent);
                    }
                });
    }
}