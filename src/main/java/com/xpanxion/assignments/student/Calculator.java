package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Calculator {

    ArrayList<String> history = new ArrayList<String>();
    int val;

    Calculator(){
        val = 0;
    }

    public int add(int num1, int num2){
        val = num1 + num2;
        history.add(num1 + " + " + num2 + " = " + val);
        return val;
    }

    public int subtract(int num1, int num2){
        val = num1 - num2;
        history.add(num1 + " - " + num2 + " = " + val);
        return val;
    }

    public int multiply(int num1, int num2){
        val = num1 * num2;
        history.add(num1 + " * " + num2 + " = " + val);
        return val;
    }

    public int divide(int num1, int num2){
        val = num1 / num2;
        history.add(num1 + " / " + num2 + " = " + val);
        return val;
    }
    
    public ArrayList<String> getHistory(){
        return history;
    }

}
