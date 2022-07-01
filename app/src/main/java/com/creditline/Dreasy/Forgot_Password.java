package com.creditline.Dreasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.thekhaeng.pushdownanim.PushDownAnim;

public class Forgot_Password extends AppCompatActivity {

    Button butt;
    TextInputEditText textInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getSupportActionBar().setTitle("Forgot Password");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        butt = (Button) findViewById(R.id.fp_btn);
        textInputEditText = (TextInputEditText) findViewById(R.id.login_email);

        PushDownAnim.setPushDownAnimTo(butt)
                .setScale(PushDownAnim.MODE_STATIC_DP, 20)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_RELEASE_DURATION)
                .setInterpolatorPush(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setInterpolatorRelease(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textInputEditText.getText().equals(" ")){
                            Toast.makeText(Forgot_Password.this, "Input email please", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Forgot_Password.this, "Verified", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}