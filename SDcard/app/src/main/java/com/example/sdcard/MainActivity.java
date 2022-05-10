package com.example.sdcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MainActivity extends AppCompatActivity {
    TextView File,Student,mark;
    EditText input1,input2,input3;
    Button button1,button2;
    String name,number;
    FileWriter fl;
    FileReader fr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File=(TextView) findViewById(R.id.file);
        Student=(TextView) findViewById(R.id.student);
        mark=(TextView) findViewById(R.id.cg);
        input1=(EditText) findViewById(R.id.Fn);
        input2=(EditText) findViewById(R.id.Sn);
        input3=(EditText) findViewById(R.id.Cp);
        button1=(Button) findViewById(R.id.btn1);
        button2=(Button) findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}