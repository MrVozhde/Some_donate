package com.example.omedoanate.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.omedoanate.Model.Recycler_model_porbazdid;
import com.example.omedoanate.R;

import java.util.List;

public class Recycler_Adapter_porbazdid extends RecyclerView.Adapter<Recycler_Adapter_porbazdid.ViewHolder>{

    private Context context;
    private List<Recycler_model_porbazdid> model;

    public Recycler_Adapter_porbazdid(Context context, List<Recycler_model_porbazdid> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_porbazdid_simple , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Recycler_model_porbazdid rb = model.get(position);
        holder.title.setText(rb.getTitle());
        holder.image.setImageResource(rb.getImage());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.txt_item_name_recycler_id);
            image = (ImageView) itemView.findViewById(R.id.img_item_pic_recycler_id);
        }
    }
}
