package com.example.ekta.giftworld;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    EditText ed_email,ed_pwd;
    Button b_login;
    TextView tv_forgotpwd,tv_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SpannableString s = new SpannableString("Login");
        s.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        getSupportActionBar().setTitle(s);

    }
    public void init()
    {
        ed_email=(EditText)findViewById(R.id.login_email);
        ed_pwd=(EditText)findViewById(R.id.login_password);

        b_login=(Button) findViewById(R.id.loginbutton);
        tv_forgotpwd=(TextView)findViewById(R.id.forgotpassword);
        tv_register=(TextView)findViewById(R.id.login_register);

    }
}
