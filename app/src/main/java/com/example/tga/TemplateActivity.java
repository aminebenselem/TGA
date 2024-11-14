package com.example.tga;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TemplateActivity extends AppCompatActivity {

    private RecyclerView templateRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);

        // Set up toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Start with a Template"); // Custom title

        templateRecyclerView = findViewById(R.id.templateRecyclerView);
        templateRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        // Sample data for templates
        List<String> templateNames = Arrays.asList("Business Template", "BusinessTemplate");
        TemplateAdapter adapter = new TemplateAdapter(templateNames);
        templateRecyclerView.setAdapter(adapter);
    }
}