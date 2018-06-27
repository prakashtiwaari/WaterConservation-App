package com.example.prakash.conservewater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IdeasActivity extends AppCompatActivity implements View.OnClickListener {
    Button submitbtn,seebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideas);
        submitbtn=(Button)findViewById(R.id.submitbutton);
        seebtn=(Button)findViewById(R.id.seeideabutton);
        submitbtn.setOnClickListener(this);
        seebtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v==submitbtn)
        {
            Intent i1= new Intent(IdeasActivity.this,FormActivity.class);
            startActivity(i1);
        }
        else if(v==seebtn)
        {
            Intent i2= new Intent(IdeasActivity.this,AllIdeasActivity.class);
            startActivity(i2);
        }

    }
}
