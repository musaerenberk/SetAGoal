package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class agustos extends AppCompatActivity {
    EditText ag;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agustos);
        ag= findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText8", "");
        ag.setText(storedText);
    }
    public void geri(View view){
        Intent intent = new Intent(agustos.this,MainActivity2.class);
        startActivity(intent);
    }
    public void sonuc(View view){
        Intent intent = new Intent(agustos.this,agustosSonuc.class);
        startActivity(intent);
    }
    public void kaydet(View view) {
        String userText = ag.getText().toString();
        ag.setHint(userText);
        sharedPreferences.edit().putString("storedText8", userText).apply();

    }
}