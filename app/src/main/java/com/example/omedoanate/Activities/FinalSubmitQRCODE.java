package com.example.omedoanate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.omedoanate.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.zxing.WriterException;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class FinalSubmitQRCODE extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView imgQR;
    private Button button_createQR , btn_reteurnmain;
    String inputValue;
    Bitmap bitmap;
    QRGEncoder qrgEncoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_submit_qrcode);

        imgQR = findViewById(R.id.img_qrcode_id);
        button_createQR = findViewById(R.id.btn_generateqr_id);
        toolbar = findViewById(R.id.toolbar_final_id);
        btn_reteurnmain = findViewById(R.id.btn_backtomain_id);

        toolbar.setTitle("نمایش کد");
        setSupportActionBar(toolbar);

        button_createQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateQRCode(v);
            }
        });

        btn_reteurnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinalSubmitQRCODE.this , MainActivity.class));
            }
        });
    }

    private void generateQRCode(View view) {
        inputValue = getIntent().getStringExtra("sheba");
        if (inputValue.length() > 0 ){
            WindowManager manager = (WindowManager) getSystemService(WINDOW_SERVICE);
            Display display = manager.getDefaultDisplay();
            Point point = new Point();
            display.getSize(point);
            int width = point.x;
            int height = point.y;
            int smallerDimension = width < height ? width : height;
            smallerDimension = smallerDimension * 3 / 4;

            qrgEncoder = new QRGEncoder(inputValue , null , QRGContents.Type.TEXT , smallerDimension);

            try {
                bitmap = qrgEncoder.encodeAsBitmap();
                imgQR.setImageBitmap(bitmap);
            } catch (WriterException e) {
                e.printStackTrace();
            }
        }else {
            Snackbar.make(view , "شماره شبا اشتباه است !", Snackbar.LENGTH_SHORT).show();
        }
    }
}
