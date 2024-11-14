package com.example.tga;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkspaceActivity extends AppCompatActivity {

    private RecyclerView workspaceRecyclerView;
    private WorkspaceAdapter workspaceAdapter;
    private List<String> workspaceNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workspace);

        workspaceRecyclerView = findViewById(R.id.workspaceRecyclerView);
        workspaceRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        workspaceNames = new ArrayList<>();
        workspaceNames.add("Board 1");
        workspaceNames.add("Board 2");
        workspaceNames.add("Board 3");

        workspaceAdapter = new WorkspaceAdapter(workspaceNames);
        workspaceRecyclerView.setAdapter(workspaceAdapter);

        // Find the close button (cross icon) and set a click listener
        findViewById(R.id.crossIcon).setOnClickListener(view -> showCloseDialog());
    }

    // Method to show the dialog when the close button is clicked
    private void showCloseDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_close_board, null);
        builder.setView(dialogView);

        AlertDialog alertDialog = builder.create();

        // Set up the dialog buttons
        TextView closeBoardOption = dialogView.findViewById(R.id.closeBoardOption);
        TextView deleteBoardOption = dialogView.findViewById(R.id.deleteBoardOption);
        TextView shareBoardLinkOption = dialogView.findViewById(R.id.shareBoardLinkOption);

        closeBoardOption.setOnClickListener(v -> {
            // Handle close board action
            alertDialog.dismiss();
        });

        deleteBoardOption.setOnClickListener(v -> {
            // Handle delete board action
            alertDialog.dismiss();
        });

        shareBoardLinkOption.setOnClickListener(v -> {
            // Handle share board link action
            alertDialog.dismiss();
        });

        alertDialog.show();
    }
}
