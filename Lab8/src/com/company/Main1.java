package com.company;

public class Main1 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
    }
}

class Outer {
    class Inner {

    }
}