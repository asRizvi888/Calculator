package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonC, buttonPlus, buttonMinus, buttonMul, buttonDivide, buttonEqual, buttonPercentage, buttonPlusMinus, buttonDot;

    TextView textView;

    boolean add, sub, mul, div, per;
    float val1, val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonPercentage = (Button) findViewById(R.id.buttonPercentage);
        buttonPlusMinus = (Button) findViewById(R.id.buttonPlusMinus);

        textView = (TextView) findViewById(R.id.textView);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"9");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+".");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView == null) {
                    textView.setText("");
                } else {
                    val1 = Float.parseFloat(textView.getText() + "");
                    add = true;
                    textView.setText(null);
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView == null) {
                    textView.setText("");
                } else {
                    val1 = Float.parseFloat(textView.getText() + "");
                    sub = true;
                    textView.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView == null) {
                    textView.setText("");
                } else {
                    val1 = Float.parseFloat(textView.getText() + "");
                    mul = true;
                    textView.setText(null);
                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textView == null) {
                    textView.setText("");
                } else {
                    val1 = Float.parseFloat(textView.getText() + "");
                    div = true;
                    textView.setText(null);
                }
            }
        });
        buttonPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView == null) {
                    textView.setText("");
                } else {
                    val1 = Float.parseFloat(textView.getText() + "");
                    per = true;
                    textView.setText(null);
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2 = Float.parseFloat(textView.getText() + "");
                if (add == true) {
                    textView.setText(val1 + val2 + "");
                    add = false;
                }
                if (sub == true) {
                    textView.setText(val1 - val2 + "");
                    sub = false;
                }
                if (mul == true) {
                    textView.setText(val1 * val2 + "");
                    mul = false;
                }
                if (div == true) {
                    try {
                        textView.setText(val1 / val2 + "");
                        div = false;
                    } catch (Exception e) {
                        Log.d("Calc", e.getMessage());
                    }
                }
                if (per == true) {
                    textView.setText(val1 / 100 + "");
                    per = false;
                }
            }
        });
    }
}