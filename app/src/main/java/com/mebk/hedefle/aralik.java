package com.mebk.hedefle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class aralik extends AppCompatActivity {
    EditText ara;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aralik);
        ara= findViewById(R.id.editTextsnc);
        sharedPreferences = this.getSharedPreferences("com.mebk.hedefle", Context.MODE_PRIVATE);
        String storedText = sharedPreferences.getString("storedText12", "");
        ara.setText(storedText);
    }
    public void geri(View view){
        Intent intent = new Intent(aralik.this,MainActivity2.class);
        startActivity(intent);
    }
    public void sonuc(View view){
        Intent intent = new Intent(aralik.this,aralikSonuc.class);
        startActivity(intent);
    }   public void kaydet(View view) {
        String userText = ara.getText().toString();
        ara.setHint(userText);
        sharedPreferences.edit().putString("storedText12", userText).apply();

    }

}