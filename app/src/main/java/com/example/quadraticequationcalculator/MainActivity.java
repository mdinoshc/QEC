package com.example.quadraticequationcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    EditText a;
    EditText b;
    EditText c;
    Button cal;
    Button clr;
    TextView txt;
    TextView ans1;
    TextView ans2;
    TextView txthd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(EditText) findViewById(R.id.edit_a);
        a.setTextColor(Color.WHITE);
        b=(EditText) findViewById(R.id.edit_b);
        c=(EditText) findViewById(R.id.edit_c);
        cal=(Button) findViewById(R.id.btn_cal);
        clr=(Button) findViewById(R.id.btn_clr);
        ans1=(TextView) findViewById(R.id.txt_ans1);
        ans1.setTextColor(Color.WHITE);
        ans2=(TextView) findViewById(R.id.txt_ans2);
        txthd=(TextView) findViewById(R.id.txt_head);
        ((TextView) findViewById(R.id.txt_head)).setText(Html.fromHtml("Equation type: ax<sup><small>2</small></sup>+bx+c"));
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double A=Double.parseDouble(a.getText().toString());
                double B=Double.parseDouble(b.getText().toString());
                double C=Double.parseDouble(c.getText().toString());
                double D=(B*B)-(4*A*C);
                double sum1=((-B)+Math.sqrt(D))/2*A;
                double sum2=((-B)-Math.sqrt(D))/2*A;
                ans1.setText(Double.toString(sum1));
                ans2.setText(Double.toString(sum2));
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.getText().clear();
                b.getText().clear();
                c.getText().clear();
                ans1.setText("");
                ans2.setText("");
            }
        });
    }
}