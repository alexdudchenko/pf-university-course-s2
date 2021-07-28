package com.company.stat;

import java.util.ArrayList;
import java.util.HashMap;

public class Result {
    private final HashMap<String, Integer> statistics = new HashMap<>();

    public HashMap<String, Integer> getStatistics() {
        return statistics;
    }

    public ArrayList<String> getPopular() {
        Strategy strategy = new FirstStrategy();
        return strategy.getPopular(statistics);
    }

    public static void printResult(Result result) {
        ArrayList<String> popular = result.getPopular();
        popular.sort(String::compareTo);

        for (String str : popular) {
            System.out.println(str);
        }
    }

}
