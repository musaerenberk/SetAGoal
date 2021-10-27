package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class subat extends AppCompatActivity {
    EditText subat;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subat);
        subat = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText2", "");
        subat.setText(storedText);
    }
    public void geri(View view){
        Intent intent = new Intent(subat.this,MainActivity2.class);
        startActivity(intent);
    } public void sonuc(View view){
        Intent intent = new Intent(subat.this,subatSonuc.class);
        startActivity(intent);
    }
    public void kaydet(View view) {
        String userText = subat.getText().toString();
        subat.setHint(userText);
        sharedPreferences.edit().putString("storedText2", userText).apply();

    }
}