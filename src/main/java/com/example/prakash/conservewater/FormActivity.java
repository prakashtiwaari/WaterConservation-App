package com.example.prakash.conservewater;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {
    TextView tv;
    Button btn;
    EditText et;
    String feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        tv = (TextView) findViewById(R.id.ideatextv);
        btn = (Button) findViewById(R.id.sbbutton);
        et = (EditText) findViewById(R.id.messagetext);

           feedback=et.getText().toString();

    }





    public void openWhatsApp(View view) {
        try {
            String text = feedback;// Replace with your message.

            String toNumber = "9471439511"; // Replace with mobile phone number without +Sign or leading zeros.


            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=" + toNumber + "&text=" + text));
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


