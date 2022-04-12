package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button validate = (Button) findViewById(R.id.btnv);
        EditText username=(EditText) findViewById(R.id.user);
        EditText password=(EditText) findViewById(R.id.pas);
        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().matches("[a-zA-Z]+") && password.getText().toString().matches("[0-9]+")  && password.getText().toString().length()==4){
                    Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_LONG).show();

                }
                else if (! username.getText().toString().matches("[a-zA-Z]+")){
                    Toast.makeText(getApplicationContext(), "Invalid username", Toast.LENGTH_SHORT).show();
                }
                else if (! password.getText().toString().matches("[0-9]+")&& password.getText().toString().length()!=4){
                    Toast.makeText(getApplicationContext(), "Invalid password", Toast.LENGTH_SHORT).show();


                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_SHORT).show();
                }

                }
        });

    }
}