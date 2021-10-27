package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class temmuz extends AppCompatActivity {
    EditText tmmz;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temmuz);
        tmmz= findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText7", "");
        tmmz.setText(storedText);
    }
    public void geri(View view){
        Intent intent = new Intent(temmuz.this,MainActivity2.class);
        startActivity(intent);
    }
    public void sonuc(View view){
        Intent intent = new Intent(temmuz.this,temmuzSonuc.class);
        startActivity(intent);
    }
    public void kaydet(View view) {
        String userText = tmmz.getText().toString();
        tmmz.setHint(userText);
        sharedPreferences.edit().putString("storedText7", userText).apply();

    }
}