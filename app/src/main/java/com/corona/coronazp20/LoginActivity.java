package com.corona.coronazp20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);

        Button register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this , "Ok",
                        Toast.LENGTH_LONG).show();
                Intent goToRegister = new Intent(LoginActivity.this, RegisterActivity.class);

                startActivity(goToRegister);

                //LoginActivity.this.startActivity(activityChangeIntent);
            }
        });

    }
}