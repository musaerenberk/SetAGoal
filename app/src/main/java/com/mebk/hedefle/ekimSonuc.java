package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ekimSonuc extends AppCompatActivity {
    EditText eks;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekim_sonuc);
       eks = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText10sonuc", "");
        eks.setText(storedText);
    }
    public void kaydet(View view) {
        String userText = eks.getText().toString();
        eks.setHint(userText);
        sharedPreferences.edit().putString("storedText10sonuc", userText).apply();

    }
}