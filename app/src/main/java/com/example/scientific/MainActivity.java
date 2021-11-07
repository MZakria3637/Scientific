package com.example.scientific;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {
    Button one, two, three, four, five, six, seven, eight, nine, zero, dot, equal, plus, subtract;
    Button  multiply, divide, mod, square, cube, xpoweryY;
    Button root, xrootY, backspace, CE, tan, tanh, cos, cosh, sin, sinh, leftBracket, rightBracket;
    Button  pi, factorial, eOfx, log, ln, R0, R2;
    TextView result;
    public static final String KEY_TEXT_VALUE="";
    public static  String operator="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);
        if (savedInstanceState != null) {
            CharSequence savedText = savedInstanceState.getCharSequence(KEY_TEXT_VALUE);
            result.setText(savedText);
        }
        else {
            result.setText("0");
        }
        one = (Button) findViewById(R.id.one);
        if(one!=null) {
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
        }
        two = (Button) findViewById(R.id.two);
        if(two!=null) {
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
        }
        three = (Button) findViewById(R.id.three);
        if(three!=null) {
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
        }
        four = (Button) findViewById(R.id.four);
        if(four!=null) {
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
        }
        five = (Button) findViewById(R.id.five);
        if(five!=null) {
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
        }
        six = (Button) findViewById(R.id.six);
        if(six!=null) {
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
        }
        seven = (Button) findViewById(R.id.seven);
        if(seven!=null) {
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
        }
        eight = (Button) findViewById(R.id.eight);
        if(eight!=null) {
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
        }
        nine = (Button) findViewById(R.id.nine);
        if(nine!=null) {
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
        }
        zero = (Button) findViewById(R.id.zero);
        if(zero!=null) {
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
        }
        plus = (Button) findViewById(R.id.plus);
        if(plus!=null) {
            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(operator.equals("sqrt")||operator.equals("log")||operator.equals("exp")||operator.equals("cos")||operator.equals("sin")||operator.equals("tan"))
                    {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("0" + "+");
                    } else {
                        result.append("+");
                    }
                    operator="plus";
                }
            });
        }
        subtract = (Button) findViewById(R.id.subtract);
        if(subtract!=null) {
            subtract.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(operator.equals("sqrt")||operator.equals("log")||operator.equals("exp")||operator.equals("cos")||operator.equals("sin")||operator.equals("tan"))
                    {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("0" + "-");
                    } else {
                        result.append("-");
                    }
                    operator="subtract";
                }
            });
        }
        multiply = (Button) findViewById(R.id.multiply);
        if(multiply!=null) {
            multiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(operator.equals("sqrt")||operator.equals("log")||operator.equals("exp")||operator.equals("cos")||operator.equals("sin")||operator.equals("tan"))
                    {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("0" + "*");
                    } else {
                        result.append("*");
                    }
                    operator="multiply";
                }
            });
        }
        divide = (Button) findViewById(R.id.divide);
        if(divide!=null) {
            divide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(operator.equals("sqrt")||operator.equals("log")||operator.equals("exp")||operator.equals("cos")||operator.equals("sin")||operator.equals("tan"))
                    {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("0" + "/");
                    } else {
                        result.append("/");
                    }
                    operator="divide";
                }
            });
        }
        mod = (Button) findViewById(R.id.mod);
        if(mod!=null) {
            mod.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(operator.equals("sqrt")||operator.equals("log")||operator.equals("exp")||operator.equals("cos")||operator.equals("sin")||operator.equals("tan"))
                    {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("#");
                    } else {
                        result.append("#");
                    }
                    operator="mod";
                }
            });
        }
        dot = (Button) findViewById(R.id.dot);
        if(dot!=null){
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
        }

        pi = (Button) findViewById(R.id.pi);
        if(pi!=null) {
            pi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("pi");
                    } else {
                        result.append("pi");
                    }
                }
            });
        }
        root = (Button) findViewById(R.id.root);
        if(root!=null) {
            root.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(operator.equals("cos")||operator.equals("sin")||operator.equals("tan"))
                    {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("sqrt(");
                    } else {
                        result.append("sqrt(");
                    }
                    operator="sqrt";
                }
            });
        }
        square = (Button) findViewById(R.id.square);
        if(square!=null) {
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
        }

        backspace = (Button) findViewById(R.id.backspace);
        if(backspace!=null)
        {
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (!rslt.equals("0") ) {
                    if(rslt.length()!=0) {
                        rslt = rslt.substring(0, rslt.length() - 1);
                        result.setText(rslt);
                    }
                    else if(rslt.length()<=3&&rslt.length()>=0)
                    {
                        operator="";
                    }
                    
                }
            }
        });
        }
        CE = (Button) findViewById(R.id.ce);
        if(CE!=null) {
            CE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String rslt = result.getText().toString();
                    if (!rslt.equals("0")) {

                        result.setText("0");

                    }
                    operator="";
                }
            });
        }

        equal = (Button) findViewById(R.id.equal);
        if(equal!=null) {
            equal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(operator.equals("sqrt")||operator.equals("log")||operator.equals("exp")||operator.equals("cos")||operator.equals("sin")||operator.equals("tan"))
                    {
                        result.append(")");
                    }
                    String rslt = result.getText().toString();
                    if (rslt.length() == 0) {
                        Toast.makeText(getApplicationContext(), "Please Enter Expression", Toast.LENGTH_LONG).show();
                    } else {
                        Expression e = new Expression(rslt);
                        rslt = String.valueOf(e.calculate());
                        result.setText(rslt);
                    }
                    operator="";
                }

            });
        }
        cube=findViewById(R.id.cube);
        if(cube!=null) {
        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rslt = result.getText().toString();
                if (rslt.equals("0")) {
                    result.setText("0" + "^3");
                } else {
                    result.append("^3");
                }
            }
        });
        }
        xpoweryY=findViewById(R.id.powerXy);
        if(xpoweryY!=null) {
            xpoweryY.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("0" + "^");
                    } else {
                        result.append("^");
                    }
                }
            });
        }
        R0=findViewById(R.id.r0);
        if(R0!=null) {
            R0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String rslt = result.getText().toString();
                    try{
                    if (rslt.equals("0")||result.equals("")) {
                        result.setText("0");
                    } else {
                        double a=Double.parseDouble(rslt);
                       Expression e=new Expression("round("+rslt+",0)");
                        result.setText(String.valueOf(e.calculate()));
                    }
                }catch(NumberFormatException ex)
                    {
                        Toast.makeText(getApplicationContext(),"Number Must Be Float Type For Rounding",Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
        R2=findViewById(R.id.r2);
        if(R2!=null) {
            R2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String rslt = result.getText().toString();
                    try{
                        if (rslt.equals("0")||result.equals("")) {
                            result.setText("0");
                        } else {
                            double a=Double.parseDouble(rslt);
                            Expression e=new Expression("round("+rslt+",2)");
                            result.setText(String.valueOf(e.calculate()));
                        }
                    }catch(NumberFormatException ex)
                    {
                        Toast.makeText(getApplicationContext(),"Number Must Be Float Type For Rounding",Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
        cos = (Button) findViewById(R.id.cos);
        if (cos != null) {
            cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (operator.equals("log") || operator.equals("exp") || operator.equals("sqrt")
                            || operator.equals("cos") || operator.equals("sin") || operator.equals("tan")) {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("cos(");
                    } else {
                        result.append("cos(");
                    }
                    operator = "cos";
                }
            });
        }
        cosh = (Button) findViewById(R.id.cosh);
        if (cosh != null) {
            cosh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (operator.equals("log") || operator.equals("exp") || operator.equals("sqrt")
                            || operator.equals("cos") || operator.equals("sin") || operator.equals("tan")) {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("cosh(");
                    } else {
                        result.append("cosh(");
                    }
                    operator = "cos";
                }
            });
        }
        sin = (Button) findViewById(R.id.sin);
        if (sin != null) {
            sin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (operator.equals("log") || operator.equals("exp") || operator.equals("sqrt")
                            || operator.equals("cos") || operator.equals("sin") || operator.equals("tan")) {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("sin(");
                    } else {
                        result.append("sin(");
                    }
                    operator = "sin";
                }
            });
        }
        sinh = (Button) findViewById(R.id.sinh);
        if (sinh != null) {
            sinh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (operator.equals("log") || operator.equals("exp") || operator.equals("sqrt")
                            || operator.equals("cos") || operator.equals("sin") || operator.equals("tan")) {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("sinh(");
                    } else {
                        result.append("sinh(");
                    }
                    operator = "sin";
                }
            });
        }
        tan = (Button) findViewById(R.id.tan);
        if (tan != null) {
            tan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (operator.equals("log") || operator.equals("exp") || operator.equals("sqrt")
                            || operator.equals("cos") || operator.equals("sin") || operator.equals("tan")){
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("tan(");
                    } else {
                        result.append("tan(");
                    }
                    operator = "tan";
                }
            });
        }
        tanh = (Button) findViewById(R.id.tanh);
        if (tanh != null) {
            tanh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (operator.equals("log")||operator.equals("exp") || operator.equals("sqrt") || operator.equals("cos")|| operator.equals("sin")
                            || operator.equals("tan")) {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("tanh(");
                    } else {
                        result.append("tanh(");
                    }
                    operator = "tan";
                }
            });
        }
        log = (Button) findViewById(R.id.log);
        if (log != null) {
            log.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (operator.equals("log")||operator.equals("exp") || operator.equals("sqrt") || operator.equals("cos")|| operator.equals("sin") || operator.equals("tan")) {
                   result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("log10(");
                    } else {
                        result.append("log10(");
                    }
                    operator = "log";
                }
            });
        }
        ln = (Button) findViewById(R.id.ln);
        if (ln != null) {
            ln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (operator.equals("log")||operator.equals("exp") || operator.equals("sqrt") || operator.equals("cos")
                            || operator.equals("sin") || operator.equals("tan")) {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("ln(");
                    } else {
                        result.append("ln(");
                    }
                    operator = "log";
                }
            });
        }
        rightBracket = (Button) findViewById(R.id.rbracket);
        if (rightBracket != null) {
            rightBracket.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText(")");
                    } else {
                        result.append(")");
                    }
                    operator = "";
                }
            });
        }
        leftBracket = (Button) findViewById(R.id.lbracket);
        if (leftBracket != null) {
            leftBracket.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("(");
                    } else {
                        result.append("(");
                    }
                    operator = "";
                }
            });
        }
        factorial = (Button) findViewById(R.id.factorial);
        if (factorial != null) {
            factorial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("0!");
                    } else {
                        result.append("!");
                    }
                    operator = "";
                }
            });
        }
        eOfx = (Button) findViewById(R.id.powerex);
        if (eOfx != null) {
            eOfx.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (operator.equals("log")||operator.equals("exp") || operator.equals("sqrt") || operator.equals("cos")
                            || operator.equals("sin") || operator.equals("tan")) {
                        result.append(")");

                    }
                    String rslt = result.getText().toString();
                    if (rslt.equals("0")) {
                        result.setText("exp(");
                    } else {
                        result.append("exp(");
                    }
                    operator = "log";
                }
            });
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putCharSequence(KEY_TEXT_VALUE,result.getText());
    }
}