package org.example;

class Multiplication extends CalculatorOperation{
    Multiplication(double x,double y){
        super(x,y);
    }
    @Override
    double calculate(){
        result=result*num1;
        return result;
    }
}