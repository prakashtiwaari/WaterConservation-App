package com.example.prakash.conservewater;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView simpleList;
    String allLists [] = {"INFORMATION AROUND THE GLOBE","INNOVATION AND IDEAS","COMPAIGN AND STEPS TAKEN","CHALLANGES AND PROBLEMS",
            "CONTACTS AND MAILS"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

              simpleList = (ListView)findViewById(R.id.simpleListView);


       // ArrayAdapter<String> arrayAdapter =  new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView,allLists);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_LONG).show();
                int pos = position;
                simpleList.getChildAt(0).setBackgroundColor(Color.BLUE);
                simpleList.getChildAt(1).setBackgroundColor(Color.GREEN);
               simpleList.getChildAt(2).setBackgroundColor(Color.YELLOW);
              simpleList.getChildAt(3).setBackgroundColor(Color.RED);
               simpleList.getChildAt(4).setBackgroundColor(Color.CYAN);
               // simpleList.getChildAt(4).setBackgroundResource(R.drawable.splashscreen);

                if(pos==0)
                {
                    Toast.makeText(getApplicationContext(),"Getting your News Feed",Toast.LENGTH_LONG).show();
                    Intent i1= new Intent(MainActivity.this,NewsActivity.class);
                    startActivity(i1);


                }
                else if( pos == 1)
                {
                    Toast.makeText(getApplicationContext(),"Ideas Clicked",Toast.LENGTH_LONG).show();
                    Intent i2= new Intent(MainActivity.this,IdeasActivity.class);
                    startActivity(i2);


                }
                else if( pos ==2)
                {
                    Toast.makeText(getApplicationContext(),"Compaign clicked",Toast.LENGTH_LONG).show();
                    Intent i3= new Intent(MainActivity.this,CompaignActivity.class);
                    startActivity(i3);


                }
                else if (pos == 3)
                {
                    Toast.makeText(getApplicationContext(),"Problem clicked",Toast.LENGTH_LONG).show();
                    Intent i4= new Intent(MainActivity.this,ProblemsActivity.class);
                    startActivity(i4);


                }
                else if(pos == 4)
                {
                    Toast.makeText(getApplicationContext(),"Contact clicked",Toast.LENGTH_LONG).show();
                    Intent i5= new Intent(MainActivity.this,ContactActivity.class);
                    startActivity(i5);


                }

            }
        });

        ArrayAdapter<String> arrayAdapter =  new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView,allLists);
        simpleList.setAdapter(arrayAdapter);
    }
}
