package org.example;

abstract class CalculatorOperation{
    protected double result;
    protected double num1;
    CalculatorOperation(double x,double y){
        result=x;
        num1=y;
    }
    abstract double calculate();
}