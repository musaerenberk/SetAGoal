package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ekim extends AppCompatActivity {
    EditText ek;
    SharedPreferences sharedPreferences;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekim);
        ek= findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText10", "");
        ek.setText(storedText);

    }
    public void geri(View view){
        Intent intent = new Intent(ekim.this,MainActivity2.class);
        startActivity(intent);
    }
    public void sonuc(View view){
        Intent intent = new Intent(ekim.this, ekimSonuc.class);
        startActivity(intent);
    }
    public void kaydet(View view) {
        String userText = ek.getText().toString();
        ek.setHint(userText);
        sharedPreferences.edit().putString("storedText10", userText).apply();

    }
}