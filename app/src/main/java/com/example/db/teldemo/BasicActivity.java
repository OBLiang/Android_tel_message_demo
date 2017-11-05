package com.example.db.teldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_layout);
        Button buttonjumplist= (Button) findViewById(R.id.buttonjumplist);
        buttonjumplist.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(BasicActivity.this,TelActivity.class);
                        startActivity(intent);
                    }
                }
        );


    }
}
