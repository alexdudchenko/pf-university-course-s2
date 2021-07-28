package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Strategy strategy = new FirstStrategy();

        try {
            ArrayList<String> arrayList = strategy.commonestWords("D:\\PF-Semester-2\\Lab5\\some.txt");

            if (arrayList.size() == 0) {
                System.out.println("Nothing there");
            } else {
                System.out.println("Most popular:");
                for (String string : arrayList) {
                    System.out.println(string);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
