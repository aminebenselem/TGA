package com.example.tga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText usernameEditText, passwordEditText;
    Button loginButton;
    TextView errorMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize the views
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginbutton);
        errorMessageTextView = findViewById(R.id.forgotPassword);

        // Set the click listener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text from the EditText fields
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Simple validation
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please fill in both fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Here, you would check the username and password (for example, with a network request)
                    // For now, we will just use a simple hardcoded check
                    if (username.equals("user") && password.equals("password")) {
                        // Successful login
                        Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

                        // Proceed to MainActivity
                        Intent intent = new Intent(LoginActivity.this, WorkspaceActivity.class);
                        startActivity(intent);
                        finish(); // Close LoginActivity
                    } else {
                        // Display error message
                        errorMessageTextView.setVisibility(View.VISIBLE);
                        errorMessageTextView.setText("Invalid username or password");
                    }
                }
            }
        });
    }
}
