package com.example.calc0627;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,
            btn_minus,btn_sin,btn_cos,btn_radical,btn_dot,btn_sum,btn_sub,btn_mult,btn_div,btn_clr,btn_equ;
    private TextView cal_result;
    private boolean isClickequ = false;
    private boolean flag = false;
    private boolean sign = false;
    private String strnum1,strnum2 = "";
    private double num1,num2 = 0.0;
    private String op = "";
    BigDecimal p3;

    private double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal_result = findViewById(R.id.result);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_dot = findViewById(R.id.btn_dot);
        btn_sum = findViewById(R.id.btn_sum);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mult = findViewById(R.id.btn_mult);
        btn_div = findViewById(R.id.btn_div);
        btn_clr = findViewById(R.id.btn_c);
        btn_equ = findViewById(R.id.btn_equ);
        btn_sin = findViewById(R.id.btn_sin);
        btn_cos = findViewById(R.id.btn_cos);
        btn_radical = findViewById(R.id.btn_radical);
        btn_minus = findViewById(R.id.btn_minus);


        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_sum.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_mult.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_clr.setOnClickListener(this);
        btn_equ.setOnClickListener(this);
        btn_sin.setOnClickListener(this);
        btn_cos.setOnClickListener(this);
        btn_radical.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        int id = view.getId();
        if (id == R.id.btn_0) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText().toString() + "0");
        } else if (id == R.id.btn_1) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText().toString() + "1");
        } else if (id == R.id.btn_2) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText().toString() + "2");
        } else if (id == R.id.btn_3) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText().toString() + "3");
        } else if (id == R.id.btn_4) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText().toString() + "4");
        } else if (id == R.id.btn_5) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText().toString() + "5");
        } else if (id == R.id.btn_6) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText().toString() + "6");
        } else if (id == R.id.btn_7) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText().toString() + "7");
        } else if (id == R.id.btn_8) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText().toString() + "8");
        } else if (id == R.id.btn_9) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText().toString() + "9");
        } else if (id == R.id.btn_c) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText("");
        } else if (id == R.id.btn_dot) {
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            cal_result.setText(cal_result.getText().toString() + ".");
        } else if (id == R.id.btn_minus) {
            strnum1 = cal_result.getText().toString();
            if (isClickequ) {
                cal_result.setText("");
                isClickequ = false;
            }
            num1 = Double.parseDouble(strnum1);
            num1 = (num1 * (-1));
            isClickequ = false;
            cal_result.setText(num1 + "");
        }
        else if (id == R.id.btn_sum) {
            strnum1 = cal_result.getText().toString();
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            cal_result.setText("");
            op = "+";
            isClickequ = false;
        } else if (id == R.id.btn_sub) {
            strnum1 = cal_result.getText().toString();
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            cal_result.setText("");
            op = "-";
            isClickequ = false;
        } else if (id == R.id.btn_mult) {
            strnum1 = cal_result.getText().toString();
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            cal_result.setText("");
            op = "*";
            isClickequ = false;
        } else if (id == R.id.btn_div) {
            strnum1 = cal_result.getText().toString();
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            cal_result.setText("");
            op = "/";
            isClickequ = false;
        } else if (id == R.id.btn_sin) {
            strnum1 = cal_result.getText().toString();
            op = "sin";
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            num1 = Math.toRadians(num1);
            result = Math.sin(num1);
            cal_result.setText(result + "");
            op = "";
            isClickequ = false;
        } else if (id == R.id.btn_cos) {
            strnum1 = cal_result.getText().toString();
            op = "cos";
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            num1 = Math.toRadians(num1);
            result = Math.cos(num1);
            cal_result.setText(result + "");
            op = "";
            isClickequ = false;
        }
        else if (id == R.id.btn_radical) {
            strnum1 = cal_result.getText().toString();
            op = "radical";
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            if(num1 > 0){
                result = Math.sqrt(num1);
                cal_result.setText(result + "");
            }else{
                Toast.makeText(getApplicationContext(), "表达式错误", Toast.LENGTH_SHORT).show();
            }
            op = "";
            isClickequ = false;
        }
        else if (id == R.id.btn_equ) {
            strnum2 = cal_result.getText().toString();
            if (strnum2.equals("")) {
                return;
            }
            num2 = Double.parseDouble(strnum2);
            cal_result.setText("");
            BigDecimal p1 = new BigDecimal(Double.toString(num1));
            BigDecimal p2 = new BigDecimal(Double.toString(num2));
            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    p3 = p1.multiply(p2);
                    sign = true;
                    break;
                case "/":
                    if (num2 == 0) {
                        flag = true;
                        break;
                    }

                    p3 = p1.divide(p2);
                    sign = true;
                    break;
                default:
                    flag = true;
                    break;
            }
            if(flag){
                cal_result.setText("输入不规范！");
                flag = false;
            }
            else{
                if(sign) {
                    cal_result.setText(p3 + "");
                    sign = false;
                }else{
                    cal_result.setText(result + "");
                }
            }
            op = "";
            isClickequ = true;

        }

    }
}
/*一个使用Java实现的Android简单计算器应用程序
该计算器可以执行基本的四则运算，包括加法、减法、乘法和除法。它还包括一些附加功能，如正弦、余弦和平方根。

以下是代码的详细说明：

1. 导入必要的包和定义主要的`MainActivity`类。
2. 该类实现了`View.OnClickListener`接口，以处理按钮点击事件。
3. 声明了各种按钮和结果显示的TextView作为私有成员变量。
4. 定义了用于处理计算和存储数字的变量和标志。
5. onCreate方法：在该方法中进行了以下操作：
   - 通过findViewById方法获取布局文件中的按钮和TextView对象。
   - 为各个按钮设置点击事件监听器，即`this`（当前Activity）。

6. onClick方法：在该方法中处理按钮的点击事件。根据按钮的id执行不同的操作。
   - 数字按钮（0-9）：将对应的数字添加到显示的表达式中。
   - 清除按钮：清空显示的表达式。
   - 点号按钮：将小数点添加到显示的表达式中。
   - 正负号按钮：将当前数字取负。
   - 加、减、乘、除按钮：记录当前操作符，并清空显示的表达式。
   - 正弦、余弦、平方根按钮：将当前数字进行相应的数学计算并显示结果。
   - 等号按钮：根据记录的操作符，将之前的数字和当前数字进行相应的计算，并显示结果。

*/
