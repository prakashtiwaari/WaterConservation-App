package com.example.prakash.conservewater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProblemsActivity extends AppCompatActivity implements View.OnClickListener {
    Button challngbtn,prblmbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);
        challngbtn=(Button)findViewById(R.id.worldproblemid);
        prblmbtn=(Button)findViewById(R.id.forumid);

        challngbtn.setOnClickListener(this);
        prblmbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==challngbtn)
        {
            Intent i1= new Intent(ProblemsActivity.this,ProblempageActivity.class);
            startActivity(i1);

        }
        if(v==prblmbtn)
        {
            Intent i2= new Intent(ProblemsActivity.this,ForumActivity.class);
            startActivity(i2);
        }
    }
}
