package com.example.recyclerview181924;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.recyclerview181924.Modal.recyclerviewadapter;
import com.example.recyclerview181924.Modal.student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<student> studentList= new ArrayList<>();
    RecyclerView recyclerView;
    recyclerviewadapter recyclerviewadapter;
    EditText edtRoll,edtName;
    Button btnadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
//        student std = new student("Faizaan","181924"); object creation
        btnadd= findViewById(R.id.btn1);
        edtRoll=findViewById(R.id.edtRoll);
        edtName=findViewById(R.id.edtName);
        recyclerView= findViewById(R.id.recycler181924);
//        studentList.add(new student("Faizaan","181924"));
//        studentList.add(new student("jhone","191924"));
//        studentList.add(new student("Kaal","129924"));
//        recyclerviewadapter = new recyclerviewadapter(studentList,MainActivity.this);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setAdapter(recyclerviewadapter);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String N= edtName.getText().toString();
                String R= edtRoll.getText().toString();

                studentList.add(new student(N,R));
                recyclerviewadapter = new recyclerviewadapter(studentList,MainActivity.this);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setHasFixedSize(false);
                recyclerView.setAdapter(recyclerviewadapter);
            }
        });

    }
}