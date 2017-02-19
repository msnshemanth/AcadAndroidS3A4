package com.example.hemanth.s3assign4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,email,password;
    Button login;
    String fullname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeEditTexts();

        login = (Button)findViewById(R.id.button2);

    }
    public void loginactivity(View v){
        getDataFromForm();
        if (name.length() ==0 || email.length()==0 || password.length()==0) {
            Toast.makeText(this, "Complete correctly", Toast.LENGTH_SHORT).show();
        }else {
            Bundle b = new Bundle();
            b.putString("fullname",fullname);
            Intent in = new Intent(MainActivity.this,Main2Activity.class);
            in.putExtras(b);
            startActivity(in);
        }
    }

    public void initializeEditTexts(){
        name = (EditText)findViewById(R.id.editText7);
        email = (EditText)findViewById(R.id.editText5);
        password =(EditText)findViewById(R.id.editText6);
    }
    public void getDataFromForm(){

        fullname = name.getText().toString();

    }

}
