package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class mart extends AppCompatActivity {
    EditText mrt;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mart);

        mrt = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText3", "");
        mrt.setText(storedText);
    }
    public void geri(View view){
        Intent intent = new Intent(mart.this,MainActivity2.class);
        startActivity(intent);
    }
    public void sonuc(View view){
        Intent intent = new Intent(mart.this,martSonuc.class);
        startActivity(intent);
    }
    public void kaydet(View view) {
        String userText = mrt.getText().toString();
        mrt.setHint(userText);
        sharedPreferences.edit().putString("storedText3", userText).apply();

    }
}