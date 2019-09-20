package com.example.omedoanate.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.omedoanate.MainActivity;
import com.example.omedoanate.R;

public class SignUp extends AppCompatActivity {

    EditText txt_fullname , txt_nationalcode , txt_phone , txt_pass , txt_Rpass ;
    Button btn_continue , btn_submit ;

    String namevalue , codevalue , phonevalue , passvalue , repassvalue ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txt_fullname = findViewById(R.id.txt_fullname_id);
        txt_nationalcode = findViewById(R.id.txt_nationalcode_id);
        txt_phone = findViewById(R.id.txt_phonenumber_id);
        txt_pass = findViewById(R.id.txt_password_id);
        txt_Rpass = findViewById(R.id.txt_re_password_id);
        btn_submit = findViewById(R.id.btn_submit_id);
        btn_continue = findViewById(R.id.btn_continue_id);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namevalue = txt_fullname.getText().toString();
                codevalue = txt_nationalcode.getText().toString();
                phonevalue = txt_phone.getText().toString();
                passvalue = txt_pass.getText().toString();
                repassvalue = txt_Rpass.getText().toString();

                if(namevalue.isEmpty()||codevalue.isEmpty()||phonevalue.isEmpty()||passvalue.isEmpty()||repassvalue.isEmpty()){

                    Toast.makeText(SignUp.this, "فیلدهای خالی را پر کنید", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(passvalue.equals(repassvalue)){
                        Toast.makeText(getApplicationContext(), "ثبت نام اولیه با موفقیت انجام شد", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(SignUp.this , MainActivity.class));
                    }else {
                        Toast.makeText(SignUp.this, "رمز عبور یکسان نیست !", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
