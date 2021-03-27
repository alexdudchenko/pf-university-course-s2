package com.example.Lab3;

public class BusinessLogic {

     public static double evaluate(double a, double b, double c, double d) {
        return 2 * Math.sqrt(Math.tan(Math.abs(a+c))) + Math.log(b) / Math.pow(c, d);
    }
}
