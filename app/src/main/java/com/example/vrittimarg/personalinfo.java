package com.example.vrittimarg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class personalinfo extends AppCompatActivity {

    String user;
    EditText name;
    EditText dob;
    EditText email;
    EditText gender;
    MaterialButton saveinfobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalinfo);
        name = findViewById(R.id.name);
        dob = findViewById(R.id.dob);
        email = findViewById(R.id.mail);
        gender = findViewById(R.id.gender);
        saveinfobtn = findViewById(R.id.submitbtn);

        saveinfobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getname = name.getText().toString();
                String getdob = dob.getText().toString();
                String getemail = email.getText().toString();
                String getgender = gender.getText().toString();



            }
        });
    }
}