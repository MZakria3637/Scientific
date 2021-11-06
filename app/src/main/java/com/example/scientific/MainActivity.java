package com.example.scientific;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button one, two, three, four, five, six, seven, eight, nine, zero, dot, equal, plus, subtract, multiply, divide,
            mod, square, cube, xpoweryY;
    Button root, xrootY, backspace, CE, tan, tanh, cos, cosh, sin, sinh, leftBracket, rightBracket, pi, factorial, eOfx,
            log, ln, R0, R2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);
        result.setText("0");
        one = (Button) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("1");
                } else {
                    result.append("1");
                }
            }
        });
        two = (Button) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("2");
                } else {
                    result.append("2");
                }
            }
        });
        three = (Button) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("3");
                } else {
                    result.append("3");
                }
            }
        });
        four = (Button) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("4");
                } else {
                    result.append("4");
                }
            }
        });
        five = (Button) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("5");
                } else {
                    result.append("5");
                }
            }
        });
        six = (Button) findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("6");
                } else {
                    result.append("6");
                }
            }
        });
        seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("7");
                } else {
                    result.append("7");
                }
            }
        });
        eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("8");
                } else {
                    result.append("8");
                }
            }
        });
        nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("9");
                } else {
                    result.append("9");
                }
            }
        });
        zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("0");
                } else {
                    result.append("0");
                }
            }
        });
        plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("0" + "+");
                } else {
                    result.append("+");
                }
            }
        });
        subtract = (Button) findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("0" + "-");
                } else {
                    result.append("-");
                }
            }
        });
        multiply = (Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("0" + "*");
                } else {
                    result.append("*");
                }
            }
        });
        divide = (Button) findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("0" + "/");
                } else {
                    result.append("/");
                }
            }
        });
        mod = (Button) findViewById(R.id.mod);
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("0" + "%");
                } else {
                    result.append("%");
                }
            }
        });
        dot = (Button) findViewById(R.id.dot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (!rslt.contains(".")) {
                    if (rslt.equals("0")) {
                        result.setText("0" + ".");
                    } else {
                        result.append(".");
                    }
                }
            }
        });

        pi = (Button) findViewById(R.id.pi);
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("π");
                } else {
                    result.append("π");
                }
            }
        });
        root = (Button) findViewById(R.id.root);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("√");
                } else {
                    result.append("√");
                }
            }
        });
        square = (Button) findViewById(R.id.square);
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("0" + "^2");
                } else {
                    result.append("^2");
                }
            }
        });
        backspace = (Button) findViewById(R.id.backspace);
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (!rslt.equals("0") ) {
                    if(rslt.length()!=0) {
                        rslt = rslt.substring(0, rslt.length() - 1);
                        result.setText(rslt);
                    }
                    
                }
            }
        });
        CE = (Button) findViewById(R.id.ce);
        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (!rslt.equals("0")) {
                    
                    result.setText("0");

                }
            }
        });
    

    }
}