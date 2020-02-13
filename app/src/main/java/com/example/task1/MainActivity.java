package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      TextInputLayout signUpUsername = findViewById(R.id.sign_up_user_name_edit_text);

      String usernameInput = signUpUsername.getEditText().getText().toString().trim();
      if(usernameInput.isEmpty())
      {
          signUpUsername.setError("Field can't be empty");
      } else if (usernameInput.length()> 20)
      {

          signUpUsername.setError("username too long");
      }

      else {
          signUpUsername.setError(" ");
      }

      TextView signIn = findViewById(R.id.sign_in);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Sign_in.class);
                startActivity(intent);

            }
        });





    }
}
