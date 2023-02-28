package org.example;

class Subtraction extends CalculatorOperation{
    Subtraction(double x,double y){
        super(x,y);
    }
    @Override
    double calculate(){
        result=result-num1;
        return result;
    }
}