package com.project.cekberatbadan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnHitung;
    //extend merupakan inheritance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btnHitung = (Button)findViewById(R.id.btn_hitung);

        //cara pertama
        /*btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/


    }

    public void hitung(View view) {
        Intent hitungIntent = new Intent ( MainActivity.this, HitungActivity.class );
        startActivity ( hitungIntent );
    }

    //method onclick, View view sebagai paramater
    public void tentang(View view) {
        Intent i = new Intent(MainActivity.this,TentangActivity.class);
        startActivity(i);
        //Toast.makeText(MainActivity.this,"Ini Layout Tentang",Toast.LENGTH_SHORT).show();
    }


    }
