package com.example.calca;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.Logger;

public class Screen {
    private TextView screen;
    private Float currentValue;
    private Float firstOp;
    private String currOperator;


    public Screen(TextView textView) {
        this.screen = textView;
        this.currentValue = 0f;
    }

    final public void setScreen(float display) {
        if (this.currentValue != 0) {
            this.currentValue = this.currentValue * 10 + display;
            this.screen.setText(String.valueOf(this.currentValue));
        } else {
            this.currentValue = display;
            this.screen.setText(String.valueOf(this.currentValue));
        }
    }

    final public void performOp(String oper) {
        this.firstOp = this.currentValue;
        this.currentValue = 0f;
        this.currOperator = oper;
    }

    final public void displayResult() {
        if(this.currentValue % 1 == 0){
            this.screen.setText(String.valueOf(this.currentValue));
        }
        Log.d("calcu 1x", String.valueOf(this.currentValue));
    }

    final public void clearResult(){
        this.currentValue = 0f;
        this.screen.setText(String.valueOf(this.currentValue));
    }

    final public void performEq() {
        Log.d("result", String.valueOf(this.currentValue + this.firstOp));

        switch (this.currOperator) {
            case "+":
                this.currentValue += this.firstOp;
                displayResult();
                break;
            case "-":
                this.currentValue = this.firstOp - this.currentValue;
                displayResult();
                break;
            case "/":
                this.currentValue = this.firstOp / this.currentValue;
                displayResult();
                break;
            case "*":
                this.currentValue *= this.firstOp;
                displayResult();
                break;
        }
    }
}
