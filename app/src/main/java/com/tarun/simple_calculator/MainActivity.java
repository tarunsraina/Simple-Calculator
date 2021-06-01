package com.tarun.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonSub;
    Button buttonDiv;
    Button buttonMul;
    Button buttonAns;
    Button buttonClear;
    Button buttonDeci;
    Button button0;
    TextView result;
    TextView info;
    final char ADDITION ='+';
    final char SUBTRACTION='-';
    final char MULTIPLICATION='*';
    final char DIVISION='/';
    int value1;
    int value2;
    char ACTION;
    final char EQU=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupView();
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(result.getText().toString()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(result.getText().toString()+"1");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(result.getText().toString()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(result.getText().toString()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(result.getText().toString()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(result.getText().toString()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(result.getText().toString()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(result.getText().toString()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(result.getText().toString()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(result.getText().toString()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(result.getText().toString()+"9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ACTION=ADDITION;
                compute();
                result.setText(String.valueOf(value1)+"+");
                info.setText(null);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=SUBTRACTION;
                result.setText(String.valueOf(value1)+"-");
                info.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=MULTIPLICATION;
                result.setText(String.valueOf(value1)+"*");
                info.setText(null);
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=DIVISION;
                result.setText(String.valueOf(value1)+"/");
                info.setText(null);
            }
        });

        buttonAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION=EQU;

                result.setText(result.getText().toString()+String.valueOf(value2)+"="+String.valueOf(value1));
                info.setText(null);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(null);
                result.setText(null);
            }
        });

    }

    public void setupView() {
        setContentView(R.layout.activity_main);
        buttonClear=(Button)findViewById(R.id.buttonClear);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonAns = (Button) findViewById(R.id.buttonAns);
        result = (TextView) findViewById(R.id.result);
        info=(TextView)findViewById(R.id.info);
    }
    public void compute()
    {
        if(!Double.isNaN(value1))
        {
            String str= (String) info.getText();
            char ch=str.charAt(str.length()-1);
            String str1=ch+"";
            value2=Integer.parseInt(str1.toString());
            switch(ACTION)
            {
                case ADDITION:
                    value1=value1+value2;
                    break;
                case SUBTRACTION:
                    value1=value1-value2;
                    break;
                case MULTIPLICATION:
                    value1=value1*value2;
                    break;
                case DIVISION:
                    value1=value1/value2;
                    break;
                case EQU:
                    break;
            }

        }
        else
        {
            value1=Integer.parseInt(info.getText().toString());

        }
    }
}