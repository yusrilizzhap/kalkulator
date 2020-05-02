package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button tombol1, tombol2, tombol3, tombol4, tombol5, tombol6, tombol7, tombol8, tombol9, tombol0, tomboltik, tombolC, tombolplus, tombolmin, tombolx, tombolbagi, tombolhasil;
    boolean doTambah, doKurang, doKali, doBagi;
    TextView teksTampil;
    Float nilaiSatu, nilaiDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tombol0 = (Button) findViewById(R.id.tombol0);
        tombol1 = (Button) findViewById(R.id.tombol1);
        tombol2 = (Button) findViewById(R.id.tombol2);
        tombol3 = (Button) findViewById(R.id.tombol3);
        tombol4 = (Button) findViewById(R.id.tombol4);
        tombol5 = (Button) findViewById(R.id.tombol5);
        tombol6 = (Button) findViewById(R.id.tombol6);
        tombol7 = (Button) findViewById(R.id.tombol7);
        tombol8 = (Button) findViewById(R.id.tombol8);
        tombol9 = (Button) findViewById(R.id.tombol9);
        tomboltik = (Button) findViewById(R.id.tomboltik);
        tombolC = (Button) findViewById(R.id.tombolC);
        tombolplus = (Button) findViewById(R.id.tombolplus);
        tombolmin = (Button) findViewById(R.id.tombolmin);
        tombolx = (Button) findViewById(R.id.tombolx);
        tombolbagi = (Button) findViewById(R.id.tombolbagi);
        tombolhasil = (Button) findViewById(R.id.tombolhasil);
        teksTampil = (TextView) findViewById(R.id.hasil);

        tombol0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText() + "0");
            }
        });

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText() + "1");
            }
        });


        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText() + "2");
            }
        });

        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText() + "3");
            }
        });
        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText() + "4");
            }
        });
        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText() + "5");
            }
        });
        tombol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText() + "6");
            }
        });
        tombol7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText() + "7");
            }
        });
        tombol8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText() + "8");
            }
        });
        tombol9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText() + "9");
            }
        });
        tomboltik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText() + ".");
            }
        });
        tombolC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu = null;
                nilaiDua = null;
                teksTampil.setText(null);
            }
        });
        tombolplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (teksTampil == null) {
                    teksTampil.setText("");
                } else {
                    nilaiSatu = Float.parseFloat(teksTampil.getText() + "");
                   doTambah = true;
                    teksTampil.setText(null);
                }
            }
        });

        tombolmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu = Float.parseFloat(teksTampil.getText() + "");
                doKurang = true;
                teksTampil.setText(null);
            }
        });

        tombolx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               nilaiSatu = Float.parseFloat(teksTampil.getText() + "");
               doKali = true;
                teksTampil.setText(null);
            }
        });

        tombolbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu = Float.parseFloat(teksTampil.getText() + "");
                doBagi = true;
                teksTampil.setText(null);
            }
        });

        tombolhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiDua = Float.parseFloat(teksTampil.getText() + "");

                if (doTambah== true) {
                    teksTampil.setText(nilaiSatu + nilaiDua + "");
                   doTambah = false;
                }

                if (doKurang == true) {
                    teksTampil.setText(nilaiSatu - nilaiDua + "");
                    doKurang = false;
                }

                if (doKali == true) {
                    teksTampil.setText(nilaiSatu * nilaiDua + "");
                    doKali = false;
                }

                if (doBagi == true) {
                    teksTampil.setText(nilaiSatu /nilaiDua + "");
                    doBagi = false;
                }
            }
        });

    }
}


