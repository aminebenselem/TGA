package com.example.tga;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class BasicBoardActivity extends AppCompatActivity {

    private Button addToDoButton, addDoingButton, createBoardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_board);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Basic Board"); // Custom title

        // Initialize the buttons
        addToDoButton = findViewById(R.id.addToDoButton);
        addDoingButton = findViewById(R.id.addDoingButton);
        createBoardButton = findViewById(R.id.createBoardButton);

        // Set OnClickListener for Add Task Button (To-Do)
        addToDoButton.setOnClickListener(v -> {
            // Add your task to the To-Do section here
        });

        // Set OnClickListener for Add Task Button (Doing)
        addDoingButton.setOnClickListener(v -> {
            // Add your task to the Doing section here
        });

        // Set OnClickListener for Create Board Button
        createBoardButton.setOnClickListener(v -> {
            // Implement the logic to create a board from a template
        });
    }
}
