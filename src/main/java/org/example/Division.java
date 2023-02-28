package org.example;


class Division extends CalculatorOperation{
    Division(double x,double y){
        super(x,y);
    }
    @Override
    double calculate(){
        result = result / num1;
        return result;
    }
}