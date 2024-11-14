package com.example.tga;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TemplateAdapter extends RecyclerView.Adapter<TemplateAdapter.TemplateViewHolder> {

    private final List<String> templateNames;

    public TemplateAdapter(List<String> templateNames) {
        this.templateNames = templateNames;
    }

    @NonNull
    @Override
    public TemplateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_item, parent, false);
        return new TemplateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TemplateViewHolder holder, int position) {
        holder.templateName.setText(templateNames.get(position));
        holder.itemView.setOnClickListener(v -> {
            // Add code here to handle item click and navigate to next screen
        });
    }

    @Override
    public int getItemCount() {
        return templateNames.size();
    }

    static class TemplateViewHolder extends RecyclerView.ViewHolder {
        ImageView templateImage;
        TextView templateName;

        public TemplateViewHolder(@NonNull View itemView) {
            super(itemView);
            templateImage = itemView.findViewById(R.id.templateImage);
            templateName = itemView.findViewById(R.id.templateName);
        }
    }
}
