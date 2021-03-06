package com.example.omedoanate.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.omedoanate.Model.Recycler_model_profile;
import com.example.omedoanate.R;

import java.util.List;

public class Recycler_Adapter_profile extends RecyclerView.Adapter<Recycler_Adapter_profile.ViewHolder> {

    private Context context;
    private List<Recycler_model_profile> list;

    public Recycler_Adapter_profile(Context context, List<Recycler_model_profile> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_profile , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Recycler_model_profile rp = list.get(position);
        holder.txt_cost.setText(rp.getCost());
        holder.txt_name.setText(rp.getName());
        holder.txt_message.setText(rp.getMessage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_cost , txt_name , txt_message;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_cost = itemView.findViewById(R.id.txt_cost_id);
            txt_name = itemView.findViewById(R.id.txt_name);
            txt_message = itemView.findViewById(R.id.txt_mess);
        }
    }
}
