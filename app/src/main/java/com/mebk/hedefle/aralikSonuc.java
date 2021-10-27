package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class aralikSonuc extends AppCompatActivity {
    EditText arS;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aralik_sonuc);
        arS= findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText12snc", "");
        arS.setText(storedText);
    }
    public void kaydet(View view) {
        String userText = arS.getText().toString();
        arS.setHint(userText);
        sharedPreferences.edit().putString("storedText12snc", userText).apply();

    }
}