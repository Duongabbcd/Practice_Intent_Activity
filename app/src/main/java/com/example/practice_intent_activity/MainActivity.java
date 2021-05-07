package com.example.practice_intent_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btOpen ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btOpen= findViewById(R.id.button) ;

        btOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                String n = "Luu Huu Duong";
                intent.putExtra("name",n) ;
                intent.putExtra("age","22");
                Student s = new Student(R.drawable.ic_launcher_background,"Luu Huu Duong",9);
                intent.putExtra("student",s);
                startActivity(intent);
            }
        });
    }
}