package com.example.ekta.giftworld;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
TextView tv_login,tv_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
      /*  ActionBar a=getSupportActionBar();
        a.setTitle("Profile");*/
        SpannableString s = new SpannableString("Profile");
        s.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        getSupportActionBar().setTitle(s);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        tv_login=(TextView)findViewById(R.id.login);
        tv_register=(TextView)findViewById(R.id.register);
        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Profile.this,Login.class);
                startActivity(i);
            }
        });

        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Profile.this,Rregister.class);
                startActivity(i1);
            }
        });

    }
}
