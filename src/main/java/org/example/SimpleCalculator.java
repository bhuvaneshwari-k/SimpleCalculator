package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleCalculator {
    public static void main(String[] args) {
        Logger l = Logger.getLogger("welcome");
        Scanner s = new Scanner(System.in);
        l.info("Enter the number1:");
        double res = s.nextDouble();
        int ch = 0;
        String msg="Enter the number2:";
        String msg1="Result";
        l.info("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        do {
            l.info("Enter your choice:");
            ch = s.nextInt();
            switch (ch) {
                case 1 -> {
                    l.info(msg);
                    double num = s.nextDouble();
                    Addition add = new Addition(res,num);
                    res = add.calculate();
                    double addresult=res;
                    l.log(Level.INFO, () -> msg1 +addresult);
                }
                case 2 -> {
                    l.info(msg);
                    double num = s.nextDouble();
                    Subtraction sub = new Subtraction(res,num);
                    res = sub.calculate();
                    double subresult=res;
                    l.log(Level.INFO, () -> msg1 +subresult);
                }
                case 3 -> {
                    l.info(msg);
                    double num = s.nextDouble();
                    Multiplication mul = new Multiplication(res,num);
                    res = mul.calculate();
                    double mulresult=res;
                    l.log(Level.INFO, () -> msg1 + mulresult);
                }
                case 4 -> {
                    l.info(msg);
                    double num = s.nextDouble();
                    Division div = new Division(res,num);
                    res = div.calculate();
                    double divresult=res;
                    l.log(Level.INFO, () -> msg1 +divresult);
                }
                case 5 -> System.exit(0);
                default -> l.info("Invalid choice!");
            }
        } while (ch != 5);
    }
}