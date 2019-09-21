package com.example.omedoanate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.omedoanate.Adapters.Recycler_Adapter_Items;
import com.example.omedoanate.Model.Recycler_model_items;
import com.example.omedoanate.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ShowItems extends AppCompatActivity {

    private Toolbar toolbar;
    private CircleImageView imgprof;
    private Button btn_donate;
    private TextView txt_title , txt_goal , txt_donated , txt_donate_content;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private ArrayList<Recycler_model_items> items = new ArrayList<>();
    private Recycler_Adapter_Items adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_items);

        imgprof = findViewById(R.id.img_profile_id);
        btn_donate = findViewById(R.id.btn_donate_id);
        toolbar = findViewById(R.id.toolbar_items_id);
        txt_title = findViewById(R.id.txt_title_id);
        recyclerView = findViewById(R.id.reycler_items_donated_id);

        btn_donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , Donate.class);
                intent.putExtra("nameH" , txt_title.getText().toString());
                startActivity(intent);
            }
        });

        txt_title.setText(getIntent().getStringExtra("title"));

        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new Recycler_Adapter_Items(getApplicationContext() , items);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false);
        recyclerView.setLayoutManager(linearLayoutManager);
        setUpItems();
        recyclerView.setAdapter(adapter);

    }

    public void setUpItems(){
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
        items.add(new Recycler_model_items("+12,000 تومان","دیروز","علی","با آرزوی سربلندی برای شما"));
    }
}
