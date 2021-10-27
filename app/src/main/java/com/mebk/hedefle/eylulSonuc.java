package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class eylulSonuc extends AppCompatActivity {
    EditText es;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eylul_sonuc);
       es = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText9sonuc", "");
        es.setText(storedText);
    }
    public void kaydet(View view) {
        String userText = es.getText().toString();
        es.setHint(userText);
        sharedPreferences.edit().putString("storedText9sonuc", userText).apply();

    }
}