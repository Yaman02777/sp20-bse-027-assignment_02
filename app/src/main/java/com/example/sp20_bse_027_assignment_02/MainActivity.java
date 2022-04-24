package com.example.sp20_bse_027_assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,back,open;
    TextView textView;
    int cnt =0;  int ps= 9876;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0=findViewById(R.id.bt0);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        bt5=findViewById(R.id.bt5);
        bt6=findViewById(R.id.bt6);
        bt7=findViewById(R.id.bt7);
        bt8=findViewById(R.id.bt8);
        bt9=findViewById(R.id.bt9);
        back=findViewById(R.id.btBack);
        open=findViewById(R.id.btOopen);
        textView=findViewById(R.id.txt);
        ;
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dig= textView.getText().toString();
                textView.setText(dig+"0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dig= textView.getText().toString();
                textView.setText(dig+"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dig= textView.getText().toString();
                textView.setText(dig+"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String dig= textView.getText().toString();
                textView.setText(dig+"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dig= textView.getText().toString();
                textView.setText(dig+"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dig= textView.getText().toString();
                textView.setText(dig+"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dig= textView.getText().toString();
                textView.setText(dig+"6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num= textView.getText().toString();
                textView.setText(num+"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num= textView.getText().toString();
                textView.setText(num+"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num= textView.getText().toString();
                textView.setText(num+"9");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String entr= textView.getText().toString();
                entr = entr.substring(0, entr.length() - 1);
                textView.setText(entr);
            }
        });
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num= Integer.parseInt(textView.getText().toString());
                if(num==ps)
                {
                    Intent intent = new Intent(MainActivity.this, accessed.class);
                    finish();
                    startActivity(intent);
                }
                else
                {
                    cnt++;
                    if (cnt==3) {
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Wrong Key!",Toast.LENGTH_SHORT).show();
                        textView.setText("");
                    }
                }
            }
        });
    }
}