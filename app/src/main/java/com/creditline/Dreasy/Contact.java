package com.creditline.Dreasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Contact extends AppCompatActivity {

    TextView textView;
    EditText edittext;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        getSupportActionBar().setTitle("Contact");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView = (TextView) findViewById(R.id.textview);
        edittext = (EditText) findViewById(R.id.contact_edittext);
        imageView = (ImageView) findViewById(R.id.contact_imgview);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.VISIBLE);
                textView.setText(edittext.getText());
                edittext.setText("");
                Toast.makeText(Contact.this, "Message has been successfully sent", Toast.LENGTH_SHORT).show();
            }
        });

    }
}