package com.creditline.Dreasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.thekhaeng.pushdownanim.PushDownAnim;

public class Login extends AppCompatActivity {

    ImageView imgv;
    Button butt;
    TextView txtv, txtv2;
    Intent intent;
    TextInputEditText textInputEditText, textInputEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        imgv = (ImageView) findViewById(R.id.back_to_intro);
        butt = (Button) findViewById(R.id.login_btn);
        txtv = (TextView) findViewById(R.id.reg_text);
        txtv2 = (TextView) findViewById(R.id.login_forgot_passwd);
        textInputEditText = (TextInputEditText) findViewById(R.id.login_email);
        textInputEditText2 = (TextInputEditText) findViewById(R.id.login_passwd);

        PushDownAnim.setPushDownAnimTo(imgv)
                .setScale(PushDownAnim.MODE_STATIC_DP, 5)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_RELEASE_DURATION)
                .setInterpolatorPush(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setInterpolatorRelease(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent = new Intent(Login.this, Intro.class);
                        startActivity(intent);
                    }
                });

        PushDownAnim.setPushDownAnimTo(butt)
                .setScale(PushDownAnim.MODE_STATIC_DP, 20)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_RELEASE_DURATION)
                .setInterpolatorPush(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setInterpolatorRelease(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(textInputEditText.getText().toString().contains("erivona@gmail.com")) {
                        intent = new Intent(Login.this, MainActivity.class);
                        startActivity(intent);
                        Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        } else if(textInputEditText.getText().toString().contains("eniola@gmail.com") && textInputEditText2.getText().toString().contains("password")){
                            intent = new Intent(Login.this, MainActivity2.class);
                            startActivity(intent);
                            Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        } else if(textInputEditText.getText().toString().isEmpty() && textInputEditText2.getText().toString().isEmpty()){
                            Toast.makeText(Login.this, "Details do not match records", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

        txtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });

        txtv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Login.this, Forgot_Password.class);
                startActivity(intent);
            }
        });

    }
}