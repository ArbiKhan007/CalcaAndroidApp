package com.example.calca;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one, two, three, four, five, six, seven, eight, nine, zero, clear, dot, equals, plus, minus, divide, multiply;
    TextView textView;
    Screen screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.calca_zero);
        one = findViewById(R.id.calca_one);
        two = findViewById(R.id.calca_two);
        three = findViewById(R.id.calca_three);
        four = findViewById(R.id.calca_four);
        five = findViewById(R.id.calca_five);
        six = findViewById(R.id.calca_six);
        seven = findViewById(R.id.calca_seven);
        eight = findViewById(R.id.calca_eight);
        nine = findViewById(R.id.calca_nine);
        textView = findViewById(R.id.calca_screen);
        dot = findViewById(R.id.calca_dot);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        equals = findViewById(R.id.equals);
        clear = findViewById(R.id.calca_c);

        //screen class
        screen = new Screen(textView);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        dot.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        equals.setOnClickListener(this);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calca_one:
                screen.setScreen(1);
                break;
            case R.id.calca_two:
                screen.setScreen(2);
                break;
            case R.id.calca_three:
                screen.setScreen(3);
                break;
            case R.id.calca_four:
                screen.setScreen(4);
                break;
            case R.id.calca_five:
                screen.setScreen(5);
                break;
            case R.id.calca_six:
                screen.setScreen(6);
                break;
            case R.id.calca_seven:
                screen.setScreen(7);
                break;
            case R.id.calca_eight:
                screen.setScreen(8);
                break;
            case R.id.calca_nine:
                screen.setScreen(9);
                break;
            case R.id.calca_zero:
                screen.setScreen(0);
                break;
            case R.id.calca_dot:
                break;
            case R.id.calca_c:
                screen.clearResult();
                break;
            case R.id.plus:
                screen.performOp("+");
                break;
            case R.id.minus:
                screen.performOp("-");
                break;
            case R.id.multiply:
                screen.performOp("*");
                break;
            case R.id.divide:
                screen.performOp("/");
                break;
            case R.id.equals:
                screen.performEq();
                break;

            default:
                break;
        }
    }
}