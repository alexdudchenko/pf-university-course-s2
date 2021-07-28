package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Calculator calculator = (a, b, c, d) -> 2 * Math.sqrt(Math.tan(Math.abs(a+c))) + Math.log(b) / Math.pow(c, d);

	    System.out.println(calculator.calculate(120, 120, 0, 0));

        QuadraticEquation qe1 = new QuadraticEquation(1, 2, 3);
        QuadraticEquation qe2 = new QuadraticEquation(2, 4, 7);
        QuadraticEquation qe3 = new QuadraticEquation(-1, 7, 8);
        QuadraticEquation qe4 = new QuadraticEquation(-100, 1, 1);
        QuadraticEquation qe5 = new QuadraticEquation(1, 3, 7);

        QuadraticEquation[] quadraticEquations = {qe5, qe2, qe3, qe4, qe1};

        Arrays.asList(quadraticEquations).forEach(System.out::println);
    }
}
