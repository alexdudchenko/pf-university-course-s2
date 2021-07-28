package com.example.Lab3.model;

public class ResultDataRow {
    private double a;
    private double b;
    private double c;
    private double d;
    private double result;

    public ResultDataRow(double a, double b, double c, double d, double result) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.result = result;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
