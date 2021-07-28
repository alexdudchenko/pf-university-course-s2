package com.example.Lab3.model;

public class BusinessLogic implements IBusinessLogic {

     public double evaluate(double a, double b, double c, double d) {
        return 2 * Math.sqrt(Math.tan(Math.abs(a+c))) + Math.log(b) / Math.pow(c, d);
    }
}
