package com.corona.coronazp20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button button;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login);

                button = (Button) findViewById(R.id.register);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openRegister();
                    }
                });

                final EditText username = findViewById(R.id.username);

                final EditText password = findViewById(R.id.password);

                Button login = findViewById(R.id.login);

                login.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                // čia bus vykdomas kodas, kai paspaudžiamas mygtukas
                Toast.makeText(LoginActivity.this,
                        username.getText().toString(),
                        Toast.LENGTH_SHORT).show();

                username.setError(null);
                if(Validation.isValidUsername(username.getText().toString())) {
                    Intent goToSearchActivity = new Intent(LoginActivity.this, SearchActivity.class);
                    startActivity(goToSearchActivity);
                } else { // jeigu username neteisingas
                    username.setError("Error! Wrong username");
                    username.requestFocus();
                }

            }
        });

    }
    public void openRegister (){
        Intent intent = new Intent(LoginActivity.this, register.class);
        startActivity(intent);
    }
}
