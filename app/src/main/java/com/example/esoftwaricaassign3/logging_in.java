package com.example.esoftwaricaassign3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class logging_in extends AppCompatActivity {
    EditText userPassword, userID;
    Button loginBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging_in);

        userID = findViewById(R.id.userID);
        userPassword = findViewById(R.id.userPassword);
        loginBTN = findViewById(R.id.loginBTN);

        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(userID.getText().toString(), userPassword.getText().toString());
            }
        });

    }

    private void validate(String uID, String uPassword){
        if ((uID.equals("softwarica") ) && (uPassword.equals("coventry"))){
            Intent intent = new Intent(logging_in.this, MainActivity.class);
            startActivity(intent);
        }

    }
}
