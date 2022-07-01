package com.creditline.Dreasy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.Calendar;
import java.util.Objects;

public class Register extends AppCompatActivity {

    ImageView imgview;
    Button butt;
    TextView txtv;
    Intent intent;
    DatePickerDialog picker;
    TextInputEditText edt, userName;
    RadioButton radioButton, radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        imgview = (ImageView) findViewById(R.id.back_btn_reg);
        butt = (Button) findViewById(R.id.reg_btn);
        txtv = (TextView) findViewById(R.id.login_text);
        edt = (TextInputEditText) findViewById(R.id.edit_text_dob);
        edt.setInputType(InputType.TYPE_NULL);
        userName = (TextInputEditText) findViewById(R.id.reg_uname);
        radioButton = (RadioButton) findViewById(R.id.radio_driver);
        radioButton2 = (RadioButton) findViewById(R.id.radio_recruiter);

        PushDownAnim.setPushDownAnimTo(imgview)
                .setScale(PushDownAnim.MODE_STATIC_DP, 5)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_RELEASE_DURATION)
                .setInterpolatorPush(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setInterpolatorRelease(PushDownAnim.DEFAULT_INTERPOLATOR)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent = new Intent(Register.this, Intro.class);
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
                        if (radioButton.isChecked()){
                            intent = new Intent(Register.this, MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                        } else
                        if (radioButton2.isChecked()){
                            intent = new Intent(Register.this, MainActivity2.class);
                            startActivity(intent);
                            Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Register.this, "You have to select one instance", Toast.LENGTH_SHORT).show();
                        }

//                        Objects.requireNonNull(getSupportActionBar()).setTitle("Hello " + userName.getText());
                    }
                });

        txtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });

        edt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(Register.this ,
                        new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                     edt.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                    }
                }, year, month, day);
                picker.show();
            }
        });
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        // Check the button is clicked
        switch(view.getId()){
            case R.id.radio_driver:
                if (checked)
                    break;
            case R.id.radio_recruiter:
                if (checked)
                    break;
        }
    }
}