package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        QuadraticEquation qe1 = new QuadraticEquation(1, 2, 3);
        QuadraticEquation qe2 = new QuadraticEquation(2, 4, 7);
        QuadraticEquation qe3 = new QuadraticEquation(-1, 7, 8);
        QuadraticEquation qe4 = new QuadraticEquation(-100, 1, 1);


        QuadraticEquation[] quadraticEquations = {qe1, qe2, qe3, qe4};
        print(quadraticEquations);

        Arrays.sort(quadraticEquations, new QuadraticEquation.QeComparator());
        print(quadraticEquations);

        TreeSet<QuadraticEquation> treeSet = new TreeSet<>(new QuadraticEquation.QeComparator());
        treeSet.add(qe1);
        treeSet.add(qe2);
        treeSet.add(qe3);
        treeSet.add(qe4);

        print(treeSet);
//------------------------------------------------------------------------------------------------------------------------------

        Comparator<QEwithDiscriminantAlgo> comparator = new Comparator<QEwithDiscriminantAlgo>() {
            @Override
            public int compare(QEwithDiscriminantAlgo o1, QEwithDiscriminantAlgo o2) {
                if (o1.getDiscriminant() > o2.getDiscriminant()) {
                    return 1;
                } else if (o1.getDiscriminant() == o2.getDiscriminant()){
                    return 0;
                } else {
                    return -1;
                }
            }
        };

        System.out.println("\n---------\n");


        QEwithDiscriminantAlgo qEwithDiscriminantAlgo1 = new QEwithDiscriminantAlgo(1, 1, 1);
        QEwithDiscriminantAlgo qEwithDiscriminantAlgo2 = new QEwithDiscriminantAlgo(1, 2, 1);
        QEwithDiscriminantAlgo qEwithDiscriminantAlgo3 = new QEwithDiscriminantAlgo(1, 3, 1);

        QEwithDiscriminantAlgo[] qEwithDiscriminantAlgos = {qEwithDiscriminantAlgo2,
                qEwithDiscriminantAlgo3, qEwithDiscriminantAlgo1};

        print(qEwithDiscriminantAlgos);

        Arrays.sort(qEwithDiscriminantAlgos, comparator);
        print(qEwithDiscriminantAlgos);


        TreeSet<QEwithDiscriminantAlgo> treeSet2 = new TreeSet<>(comparator);
        treeSet2.add(qEwithDiscriminantAlgo1);
        treeSet2.add(qEwithDiscriminantAlgo2);
        treeSet2.add(qEwithDiscriminantAlgo3);

        print(treeSet2);
    }

    static void print(QuadraticEquation[] qes) {
        for (QuadraticEquation qe : qes) {
            System.out.println(qe);
        }
        System.out.println();
    }

    static void print(TreeSet<? extends QuadraticEquation> treeSet) {
        for (Object obj : treeSet) {
            System.out.println(obj);
        }
        System.out.println();
    }
}
