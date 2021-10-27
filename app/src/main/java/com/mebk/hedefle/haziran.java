package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class haziran extends AppCompatActivity {
    EditText hzrn;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haziran);
        hzrn = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText6", "");
        hzrn.setText(storedText);
    }
    public void geri(View view){
        Intent intent = new Intent(haziran.this,MainActivity2.class);
        startActivity(intent);
    }
    public void sonuc(View view){
        Intent intent = new Intent(haziran.this,haziranSonuc.class);
        startActivity(intent);
    }
    public void kaydet(View view) {
        String userText = hzrn.getText().toString();
        hzrn.setHint(userText);
        sharedPreferences.edit().putString("storedText6", userText).apply();

    }
}