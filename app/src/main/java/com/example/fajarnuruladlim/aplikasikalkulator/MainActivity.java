package com.example.fajarnuruladlim.aplikasikalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputnilai1, inputnilai2, hasil;
    Button nilaikpk, nilaifbp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputnilai1 = (EditText) findViewById(R.id.inputnilai1);
        inputnilai2 = (EditText) findViewById(R.id.inputnilai2);
        hasil = (EditText) findViewById(R.id.hasil);
        nilaifbp = (Button) findViewById(R.id.nilaifpb);
        nilaikpk = (Button) findViewById(R.id.nilaikpk);



        nilaifbp.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int d = 0;
                int a = Integer.parseInt(inputnilai1.getText().toString());
                int b = Integer.parseInt(inputnilai2.getText().toString());
                d = a % b;
                while (d != 0) {
                    a = b;
                    b = d;
                    d = a % b;
                }
                hasil.setText("" + b);
            }
        });

        nilaikpk.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int c = 0;
                int a = Integer.parseInt(inputnilai1.getText().toString());
                int b = Integer.parseInt(inputnilai2.getText().toString());
                for(int x = 1; x <= b; x++) {
                    c = (c + a);
                    if (c % b == 0) {
                        hasil.setText("" + c);
                        break;
                    }
                }
            }
        });
    }
}
//sumber referensi
//http://gallery-kia.blogspot.co.id/2012/12/membuat-program-untuk-mencari-kpk-dan.html