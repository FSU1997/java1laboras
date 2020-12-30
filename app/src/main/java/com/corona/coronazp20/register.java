package com.corona.coronazp20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class register extends AppCompatActivity {
    private EditText textInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText username = findViewById(R.id.username);

        final EditText password = findViewById(R.id.password);

        final EditText email = findViewById(R.id.email);

        Button login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Toast.makeText(register.this,
                        username.getText().toString(),
                        Toast.LENGTH_SHORT).show();

                username.setError(null);
                if(Validation.isValidUsername(username.getText().toString())) {
                    Intent goToLoginActivity = new Intent(register.this, LoginActivity.class);
                    startActivity(goToLoginActivity);
                } else {
                    username.setError("Error! Wrong username");
                    username.requestFocus();
                }
                password.setError(null);
                if(Validation.isValidPassword(password.getText().toString())) {
                    Intent goToLoginActivity = new Intent(register.this, LoginActivity.class);
                    startActivity(goToLoginActivity);
                } else {
                    password.setError("Error! Invalid password");
                    password.requestFocus();
                }
                email.setError(null);
                if (Validation.isValidEmail(email.getText().toString())) {
                    Intent goToLoginActivity = new Intent (register.this, LoginActivity.class);
                    startActivity(goToLoginActivity);
                } else {
                    email.setError("invalid email. Sorry try again. Game over. Sorrryyy");
                    email.requestFocus();
                }


            }
        });
    }
}
