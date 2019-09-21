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
import com.example.omedoanate.Model.Recycler_model_showall;
import com.example.omedoanate.R;

import java.util.List;

public class Recycler_Adapter_Showall extends RecyclerView.Adapter<Recycler_Adapter_Showall.ViewHolder> {
    private Context context;
    private List<Recycler_model_showall> model;

    public Recycler_Adapter_Showall(Context context, List<Recycler_model_showall> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_showall_simple , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Recycler_model_showall rs = model.get(position);

        holder.title.setText(rs.getTitle());
        holder.darkhasti.setText(rs.getDarkhasti());
        holder.donateshode.setText(rs.getDonateshode());
        holder.img.setImageResource(rs.getImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , ShowItems.class);
                intent.putExtra("title" , rs.getTitle());
                intent.putExtra("image" , rs.getImage());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView title , darkhasti , donateshode;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.card_showall_id);
            img = (ImageView) itemView.findViewById(R.id.img_item_pic_recycler_showall_id);
            title = (TextView) itemView.findViewById(R.id.txt_title_showall_id);
            darkhasti = (TextView) itemView.findViewById(R.id.txt_darkhasti_showall_id);
            donateshode = (TextView) itemView.findViewById(R.id.txt_donateshode_showall_id);
        }
    }
}
