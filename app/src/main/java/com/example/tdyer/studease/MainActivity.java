package com.example.tdyer.studease;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set Buttons
        Button courseOne = (Button) findViewById(R.id.course_one);
        Button courseTwo = (Button) findViewById(R.id.course_two);
        Button courseThree = (Button) findViewById(R.id.course_three);
        Button appSettings = (Button) findViewById(R.id.app_settings);



        // ----------------- Button Functions

        // Course 1 onClick
        courseOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sessionOne = new Intent(MainActivity.this, CourseOneActivity.class);
                startActivity(sessionOne);
            }
        });

        // Course 2 onClick
        courseTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sessionTwo = new Intent(MainActivity.this, CourseTwoActivity.class);
                startActivity(sessionTwo);
            }
        });

        // Course 3 onClick
        courseThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sessionThree = new Intent(MainActivity.this, CourseThreeActivity.class);
                startActivity(sessionThree);
            }
        });

        // Settings onClick
        appSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent appSet = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(appSet);
            }
        });

    }
}
