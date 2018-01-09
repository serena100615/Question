package com.example.user.question;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public final static int REQUEST_THIS= 6;
    public final static int REQUEST_LAST= 55;
    public final static int REQUEST_NEXT= 46;
    private String[] ques;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView questions = (ListView) findViewById(R.id.questions);
        ques = new String[]{"this year?","last year?","next year"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ques);
        questions.setAdapter(adapter);
        questions.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int postion, long l) {
        if(postion==0){
            Intent intent = new Intent(this,ThisYear.class);
            startActivityForResult(intent ,REQUEST_THIS);
        }
        if(postion==1){
            Intent intent = new Intent(this,LastYear.class);
            startActivityForResult(intent ,REQUEST_LAST);
        }
        if (postion==2){
            Intent intent = new Intent(this,NextYear.class);
            startActivityForResult(intent ,REQUEST_NEXT);
        }
    }
}
