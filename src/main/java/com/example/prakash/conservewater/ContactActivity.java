package com.example.prakash.conservewater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ContactActivity extends AppCompatActivity implements View.OnClickListener {
    Button  fac,insta,twit,formbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        fac=(Button)findViewById(R.id.button);
        insta=(Button)findViewById(R.id.button2);
        twit=(Button)findViewById(R.id.button3);
        formbtn=(Button)findViewById(R.id.button4);

        fac.setOnClickListener(this);
        insta.setOnClickListener(this);
        twit.setOnClickListener(this);
        formbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==fac)
        {
            Intent i1= new Intent(ContactActivity.this,FacebookActivity.class);
            startActivity(i1);
        }
        else if(v==insta)
        {
          Intent i2=new Intent(ContactActivity.this,InstaActivity.class);
            startActivity(i2);
        }
        else if(v==twit)
        {
           Intent i3= new Intent(ContactActivity.this,TwitterActivity.class);
            startActivity(i3);
        }
        else if(v==formbtn)
        {
            Intent i4= new Intent(ContactActivity.this,GoogleFormActivity.class);
            startActivity(i4);
        }
    }
}
