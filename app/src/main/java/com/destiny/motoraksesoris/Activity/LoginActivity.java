package com.destiny.motoraksesoris.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.destiny.motoraksesoris.R;
import com.destiny.motoraksesoris.SharedPreferance.DB_Helper;

public class LoginActivity extends AppCompatActivity {
    TextView Register;
    EditText Email,Password;
    Button Login;
    private DB_Helper dbHelper;
    String User,Person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Register = (TextView) findViewById(R.id.tvRegister);
        Email = (EditText)findViewById(R.id.etEmail);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper = new DB_Helper(LoginActivity.this);
                Cursor cursor = dbHelper.checkUser(Email.getText().toString(),Password.getText().toString());
                if (cursor.getCount()>0){
                    while (cursor.moveToNext()){
                        User = cursor.getString(0);
                        Person = cursor.getString(1);
                    }
                    Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this, "Username Atau Password Tidak Diketahui", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
