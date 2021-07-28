package com.company;

import java.util.Comparator;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static class QeComparator implements Comparator<QuadraticEquation> {

        @Override
        public int compare(QuadraticEquation o1, QuadraticEquation o2) {
            if (o1.a > o2.a) {
                return 1;
            } else if (o1.a == o2.a){
                return 0;
            } else {
                return -1;
            }
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "a="+a+" b="+b+" c="+c;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
