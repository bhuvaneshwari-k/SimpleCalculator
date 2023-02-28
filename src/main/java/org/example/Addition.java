package org.example;
class Addition extends CalculatorOperation{
    Addition(double x,double y){
        super(x,y);
    }
    @Override
    double calculate(){
        result=result+num1;
        return result;
    }
}