package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToIntBiFunction;

public class Main {
    public static void main(String[] args) {
        ToIntBiFunction<Double, Double> func = Double::compareTo;
        Comparator<QuadraticEquation> comparator = (o1, o2) -> func.applyAsInt(o1.getA(), o2.getA());
        Comparator<QuadraticEquation> thenComparator = (o1, o2) -> func.applyAsInt(o1.getB(), o2.getB());

        QuadraticEquation qe1 = new QuadraticEquation(1, 2, 3);
        QuadraticEquation qe2 = new QuadraticEquation(2, 4, 7);
        QuadraticEquation qe3 = new QuadraticEquation(-1, 7, 8);
        QuadraticEquation qe4 = new QuadraticEquation(-100, 1, 1);
        QuadraticEquation qe5 = new QuadraticEquation(1, 3, 7);

        QuadraticEquation[] quadraticEquations = {qe5, qe2, qe3, qe4, qe1};

        Arrays.sort(quadraticEquations, comparator);
        Arrays.stream(quadraticEquations).forEach(System.out::println);

        System.out.println();

        Arrays.sort(quadraticEquations, comparator.reversed());
        Arrays.stream(quadraticEquations).forEach(System.out::println);

        System.out.println();

        Arrays.sort(quadraticEquations, comparator.thenComparing(thenComparator));
        Arrays.stream(quadraticEquations).forEach(System.out::println);

        System.out.println();

        QuadraticEquation[] quadraticEquationsWithNull = {qe5, qe2, qe3, null, qe4, qe1, null};
        Arrays.sort(quadraticEquationsWithNull, Comparator.nullsFirst(comparator).thenComparing(thenComparator));
        Arrays.stream(quadraticEquationsWithNull).forEach(System.out::println);
    }
}
