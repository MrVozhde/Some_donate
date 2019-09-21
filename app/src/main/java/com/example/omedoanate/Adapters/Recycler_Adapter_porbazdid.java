package com.example.omedoanate.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.omedoanate.Activities.ShowItems;
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
        final Recycler_model_porbazdid rb = model.get(position);
        holder.title.setText(rb.getTitle());
        holder.image.setImageResource(rb.getImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , ShowItems.class);
                intent.putExtra("title" , rb.getTitle());
                intent.putExtra("image" , rb.getImage());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView image;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_porbazdid_id);
            title = (TextView) itemView.findViewById(R.id.txt_item_name_recycler_id);
            image = (ImageView) itemView.findViewById(R.id.img_item_pic_recycler_id);
        }
    }
}
