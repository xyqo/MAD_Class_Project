//Adrian-Leigh Gilman 20173414
//Lori-Ann Gordon 20172284
package com.example.madclassproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public final static String ID_EXTRA=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button browser = findViewById(R.id.staffDirectory);
            browser.setOnClickListener(new View.OnClickListener() {
               @Override
              public void onClick(View v) {
          Intent intent = new Intent(MainActivity.this, staffDir.class);
                    startActivity(intent);
                 }
          });
        Button events = findViewById(R.id.events_bt);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, events.class);
                startActivity(intent);
            }
        });
        Button courses = findViewById(R.id.courses);
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, courses.class);
                startActivity(intent);
            }
        });
        Button admit = findViewById(R.id.admissions);
        admit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, admissions.class);
                startActivity(intent);
            }
        });

        Button sched = findViewById(R.id.schedule);
        sched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, schedule.class);
                startActivity(intent);
            }
        });



    }
}