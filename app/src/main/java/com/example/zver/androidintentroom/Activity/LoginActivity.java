package com.example.zver.androidintentroom.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.zver.androidintentroom.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputEditText inputEditTextNick;
    private TextInputEditText inputEditTextPassword;
    private Button btnLogin;
    private Button btnSingUp;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputEditTextNick = findViewById(R.id.input_text_nick_login_activity);
        inputEditTextPassword = findViewById(R.id.input_text_password_login_activity);

        btnLogin = findViewById(R.id.btn_login);
        btnSingUp = findViewById(R.id.btn_sing_up);

        btnLogin.setOnClickListener(this);
        btnSingUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                intent = new Intent(LoginActivity.this, MainDrawerNavigationActivity.class);
                this.startActivity(intent);
                break;
            case R.id.btn_sing_up:
                intent = new Intent(LoginActivity.this, RegisterActivity.class);
                this.startActivity(intent);
                break;
        }
    }
}
