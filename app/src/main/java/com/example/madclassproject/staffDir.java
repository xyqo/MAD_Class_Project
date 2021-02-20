package com.example.madclassproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class staffDir extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView sklStaff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_dir);

        sklStaff = findViewById(R.id.staff_List);

        String [] students = getResources().getStringArray(R.array.staff_dir);
        sklStaff.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, students));
        sklStaff.setOnItemClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){

    }


}