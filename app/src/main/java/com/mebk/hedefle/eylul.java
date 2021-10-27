package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class eylul extends AppCompatActivity {
    EditText ey;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eylul);
       ey = findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText9", "");
        ey.setText(storedText);
    }
    public void geri(View view){
        Intent intent = new Intent(eylul.this,MainActivity2.class);
        startActivity(intent);
    }
    public void sonuc(View view){
        Intent intent = new Intent(eylul.this,eylulSonuc.class);
        startActivity(intent);
    }
    public void kaydet(View view) {
        String userText = ey.getText().toString();
        ey.setHint(userText);
        sharedPreferences.edit().putString("storedText9", userText).apply();

    }
}