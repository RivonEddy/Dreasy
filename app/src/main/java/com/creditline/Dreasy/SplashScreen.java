package com.creditline.Dreasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    Handler handler;
    private ImageView imv;
    Animation myAnim;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        imv = (ImageView) findViewById(R.id.app_logo);

        // handle the image animation
        myAnim = AnimationUtils.loadAnimation(this, R.anim.splash_trans);
        imv.startAnimation(myAnim);

        // handle the splash screen effect
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(SplashScreen.this, Intro.class);
                startActivity(intent);
                finish();
            }
        }, 3000);

    }
}