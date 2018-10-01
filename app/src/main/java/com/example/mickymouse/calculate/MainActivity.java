package com.example.mickymouse.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button div;
    private Button mult;
    private Button Equal;
    private Button Clear;
    private TextView Input;
    private TextView Output;
    private final char Addition= '+';
    private final char Subtraction= '-';
    private final char Division= '/';
    private final char Multiplication = '*';
    private final char EQUAL= 0;
    private double value1=Double.NaN;
    private double value2;
    private char ACTION;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUIView();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString()+ 0);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString()+ 1);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString()+ 2);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString()+ 3);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString()+ 4);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString()+ 5);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString()+ 6);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString()+ 7);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString()+ 8);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString()+ 9);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=Addition;
                Output.setText(String.valueOf(value1)+ "+");
                Input.setText(null);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=Subtraction;
                Output.setText(String.valueOf(value1)+ "-");
                Input.setText(null);

            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION= Multiplication;
                Output.setText(String.valueOf(value1)+ "*");
                Input.setText(null);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=Division;
                Output.setText(String.valueOf(value1)+ "/");
                Input.setText(null);

            }
        });

        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=EQUAL;
                Output.setText(Output.getText().toString() + String.valueOf(value2) + "=" + String.valueOf(value1));
                Input.setText(null);
            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Input.getText().length()>0){

                    CharSequence name = Input.getText().toString();
                    Input.setText(name.subSequence(0,name.length()-1));
                }
                else {
                    value1=Double.NaN;
                    value2=Double.NaN;
                    Input.setText(null);
                    Output.setText(null);
                }
            }

        });

    }

    private void  setUpUIView() {
        zero= (Button)findViewById(R.id.button10);
        one= (Button)findViewById(R.id.button1);
        two=  (Button)findViewById(R.id.button2);
        three=  (Button)findViewById(R.id.button3);
        four= (Button)findViewById(R.id.button4);
        five=  (Button)findViewById(R.id.button5);
        six=  (Button)findViewById(R.id.button6);
        seven= (Button)findViewById(R.id.button7);
        eight= (Button)findViewById(R.id.button8);
        nine= (Button)findViewById(R.id.button9);
        add= (Button)findViewById(R.id.btnAdd);
        sub= (Button)findViewById(R.id.btnSub);
        div= (Button)findViewById(R.id.btnDiv);
        mult= (Button)findViewById(R.id.btnmult);
        Equal= (Button)findViewById(R.id.btnEqual);
        Clear= (Button)findViewById(R.id.btnClear);
        Input= (TextView)findViewById(R.id.Entry);
        Output= (TextView)findViewById(R.id.Output);

    }

    private void  compute(){

        if(!Double.isNaN(value1)){

            value2=Double.parseDouble(Input.getText().toString());

            switch (ACTION){

                case Addition:
                    value1=value1 + value2;
                    break;

                case Subtraction:
                    value1=value1 - value2;
                    break;

                case Division:
                    value1= value1 / value2;
                    break;

                case Multiplication:
                    value1=value1 * value2;
                    break;

                case EQUAL:
                    break;
            }
        }
            else{

                value1=Double.parseDouble(Input.getText().toString());
        }

    }
}



