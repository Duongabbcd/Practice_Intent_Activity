package com.example.practice_intent_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tv ,tvStudent ;
    private ImageView img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=findViewById(R.id.tvResult);
        tvStudent = findViewById(R.id.tvStudent) ;
        img =findViewById(R.id.img) ;
        Intent intent = getIntent();
        String name = intent.getStringExtra("name") ;
        int age = intent.getIntExtra("age",20);
        String st= "Name :" +name+"\n age :" +age ;
        Student s= (Student) intent.getSerializableExtra("student") ;
        img.setImageResource(s.getSourceImg());
        tvStudent.setText("Ho va ten : "+s.getName()+" Diem :"+s.getMark());
        tv.setText(st);
    }
}