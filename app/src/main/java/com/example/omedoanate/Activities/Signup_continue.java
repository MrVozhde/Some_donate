package com.example.omedoanate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.omedoanate.R;
import com.google.android.material.snackbar.Snackbar;

public class Signup_continue extends AppCompatActivity {

    EditText txt_cardnumber;
    Button btn_getsheba , btn_finalsubmit;
    TextView txt_sheba;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_continue);

        toolbar = findViewById(R.id.toolbarcontinue_id);
        txt_cardnumber = findViewById(R.id.txt_accnum_id);
        btn_getsheba = findViewById(R.id.btn_getsheba_id);
        btn_finalsubmit = findViewById(R.id.btn_finalsubmit_id);
        txt_sheba = findViewById(R.id.txt_showsheba_id);

        toolbar.setTitle("دریافت شبا حساب");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_getsheba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_cardnumber.length() < 16){
                    Snackbar.make(v , "شماره کارت نا معتبر است !" , Snackbar.LENGTH_SHORT).show();
                }else {
                    txt_sheba.setText("IR210630462070110677413001");
                }
            }
        });

        btn_finalsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup_continue.this , FinalSubmitQRCODE.class);
                intent.putExtra("sheba" , "IR210630462070110677413001");
                startActivity(intent);
            }
        });


    }
}
