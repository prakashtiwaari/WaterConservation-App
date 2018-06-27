package com.example.prakash.conservewater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CompaignActivity extends AppCompatActivity implements View.OnClickListener {
    Button seecomp,heldcomp,mustread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compaign);
        seecomp=(Button)findViewById(R.id.compaignid);
        heldcomp=(Button)findViewById(R.id.heldcopmaignid);
        mustread=(Button)findViewById(R.id.termsid);
        seecomp.setOnClickListener(this);
        heldcomp.setOnClickListener(this);
        mustread.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==seecomp)
        {
            Intent i1= new Intent(CompaignActivity.this,WatchcompaignActivity.class);
            startActivity(i1);
        }
        else if(v==heldcomp)
        {
            Intent i2=new Intent(CompaignActivity.this,HeldCompaignActivity.class);
            startActivity(i2);
        }
        else if(v==mustread)
        {
            Intent i3= new Intent(CompaignActivity.this,TermsActivity.class);
            startActivity(i3);
        }
    }
}
