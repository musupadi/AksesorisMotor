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
import com.destiny.motoraksesoris.SharedPreferance.User;

public class RegisterActivity extends AppCompatActivity {
    EditText Email,Password,Nama;
    Button Register;
    TextView Login;
    private DB_Helper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Register = (Button) findViewById(R.id.btnRegister);
        Email = (EditText)findViewById(R.id.etEmail);
        Password = (EditText)findViewById(R.id.etPassword);
        Nama = (EditText)findViewById(R.id.etNama);
        Login = (TextView) findViewById(R.id.tvLogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper = new DB_Helper(RegisterActivity.this);
                Cursor cursor = dbHelper.checkUser(Email.getText().toString());
                if (cursor.getCount()>0){
                    Toast.makeText(RegisterActivity.this, "Email Sudah Digunakan", Toast.LENGTH_SHORT).show();
                }else{
                    User user = new User(Email.getText().toString(),Password.getText().toString(),Nama.getText().toString());
                    dbHelper.saveUser(user);
                }
            }
        });
    }
}