package com.example.omedoanate.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.omedoanate.Model.Recycler_model_items;
import com.example.omedoanate.R;

import java.util.List;

public class Recycler_Adapter_Items extends RecyclerView.Adapter<Recycler_Adapter_Items.ViewHolder> {
    private Context context;
    private List<Recycler_model_items> models;

    public Recycler_Adapter_Items(Context context, List<Recycler_model_items> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_items_donated_simple , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Recycler_model_items ri = models.get(position);
        holder.txt_donated.setText(ri.getDonate());
        holder.txt_name.setText(ri.getName());
        holder.txt_date.setText(ri.getDate());
        holder.txt_message.setText(ri.getText());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_name , txt_donated , txt_date , txt_message;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.card_items_id);
            txt_name = itemView.findViewById(R.id.txt_name_id);
            txt_donated = itemView.findViewById(R.id.txt_donated_id);
            txt_date = itemView.findViewById(R.id.txt_date_id);
            txt_message = itemView.findViewById(R.id.txt_message_id);
        }
    }
}
