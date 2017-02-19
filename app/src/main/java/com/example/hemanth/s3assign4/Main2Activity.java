package com.example.hemanth.s3assign4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView showname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initializeViews();
        Intent in = getIntent();
        Bundle b = in.getExtras();
        String nameString = b.getString("fullname");
        showname.setText("Welcome : " + nameString);


    }

    public void initializeViews(){
        showname = (TextView)findViewById(R.id.textView);

    }

}
