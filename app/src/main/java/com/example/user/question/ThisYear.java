package com.example.user.question;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThisYear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_this_year);
        EditText ansThis = (EditText) findViewById(R.id.ansT);
    }
    public void okT(View view){

    }
}
