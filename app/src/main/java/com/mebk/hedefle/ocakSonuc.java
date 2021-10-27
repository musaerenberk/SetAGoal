package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ocakSonuc extends AppCompatActivity {
    EditText editTextOcakSonuc;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocak_sonuc);

        editTextOcakSonuc = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedTextOcakSonuc", "");
        editTextOcakSonuc.setText(storedText);
    }
    public void kaydet(View view) {
        String userText = editTextOcakSonuc.getText().toString();
        editTextOcakSonuc.setHint(userText);
        sharedPreferences.edit().putString("storedTextOcakSonuc", userText).apply();

    }
}