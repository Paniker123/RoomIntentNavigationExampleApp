package com.example.zver.androidintentroom.Activity;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.zver.androidintentroom.DataBase.AppDatabase;
import com.example.zver.androidintentroom.Model.User;
import com.example.zver.androidintentroom.R;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText inputEditTextNick;
    private TextInputEditText inputEditTextPassword;
    private TextInputEditText inputEditTextConfirmPassword;
    private RadioButton radioButtonMen;
    private RadioButton radioButtonWomen;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        inputEditTextNick = findViewById(R.id.input_text_nick_register_activity);
        inputEditTextPassword = findViewById(R.id.input_text_password_register_activity);
        inputEditTextConfirmPassword = findViewById(R.id.input_text_confirm_password_register_activity);
        radioButtonMen = findViewById(R.id.radio_btn_man);
        radioButtonWomen = findViewById(R.id.radio_btn_woman);
        btnRegister = findViewById(R.id.btn_register);
      //  final AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "user").build();
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (inputEditTextPassword.getText().toString() != inputEditTextConfirmPassword.getText().toString()) {
//                    Toast.makeText(RegisterActivity.this,"Passwords are not same",Toast.LENGTH_LONG).show();
//                }else {
//                    User user = new User();
//                    user.setNick(inputEditTextNick.getText().toString());
//                    user.setPassword(inputEditTextPassword.getText().toString());
//                    db.userDao().insertUser(user);
//                    finishActivity(200);
//                }
            }
        });

    }
}
