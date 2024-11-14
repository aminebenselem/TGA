package com.example.tga;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WorkspaceAdapter extends RecyclerView.Adapter<WorkspaceAdapter.WorkspaceViewHolder> {

    private final List<String> workspaceNames; // List of workspace names (can be extended to more complex objects)

    public WorkspaceAdapter(List<String> workspaceNames) {
        this.workspaceNames = workspaceNames;
    }

    @NonNull
    @Override
    public WorkspaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout for each workspace item (you can change this layout as needed)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.workspace_item, parent, false);
        return new WorkspaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkspaceViewHolder holder, int position) {
        // Set workspace name
        holder.workspaceName.setText(workspaceNames.get(position));

        // Optionally, you can set an image or any other data here
        holder.itemView.setOnClickListener(v -> {
            // Handle item click (e.g., navigate to a workspace detail screen or something else)
        });
    }

    @Override
    public int getItemCount() {
        return workspaceNames.size();
    }

    static class WorkspaceViewHolder extends RecyclerView.ViewHolder {
        ImageView workspaceImage; // ImageView for workspace item (optional)
        TextView workspaceName; // TextView for the workspace name

        public WorkspaceViewHolder(@NonNull View itemView) {
            super(itemView);
            workspaceImage = itemView.findViewById(R.id.workspaceImage); // Make sure you have this in your layout
            workspaceName = itemView.findViewById(R.id.workspaceName);
        }
    }
}
