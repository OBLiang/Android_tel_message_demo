package com.example.db.teldemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tel_layout);
        Button buttoncall= (Button) findViewById(R.id.buttontel);
        buttoncall.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:10010"));
                        startActivity(intent);
                    }
                }
        );
        Button buttonmess= (Button) findViewById(R.id.buttonmessage);
        buttonmess.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("smsto:10010"));
                        intent.putExtra("sms_body","Hello world!");
                        startActivity(intent);

                    }
                }
        );
        Button buttonnull= (Button) findViewById(R.id.buttonnull);
        buttonnull.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(TelActivity.this, "该按钮没有任何作用", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
