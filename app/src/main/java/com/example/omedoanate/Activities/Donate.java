package com.example.omedoanate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.omedoanate.R;

public class Donate extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView txt_hemayat_name;
    private Button btn_dargah;
    private EditText txt_mablagh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        toolbar = findViewById(R.id.toolbaar_donate_id);
        txt_hemayat_name = findViewById(R.id.txt_hemayat_name_id);
        btn_dargah = findViewById(R.id.btn_connect_to_dargah_id);
        txt_mablagh = findViewById(R.id.txt_donate_field_id);

        btn_dargah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Donate.this, "درگاه پرداخت", Toast.LENGTH_SHORT).show();
            }
        });

        txt_hemayat_name.setText(getIntent().getStringExtra("nameH"));

        toolbar.setTitle("حمایت مالی");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
