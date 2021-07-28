package com.company.multitreading;

import com.company.stat.Result;

import java.io.*;
import java.util.HashMap;

public class MultiReader implements Runnable {
    private final String filename;
    private final Result result;

    public MultiReader(String filename, Result result) {
        this.filename = filename;
        this.result = result;
    }

    @Override
    public void run() {
        try (FileInputStream fis = new FileInputStream(filename);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {

            String currentLine;
            HashMap<String, Integer> map = new HashMap<>();
            String[] array;

            while ((currentLine = br.readLine()) != null) {
                array = currentLine.split(" ");

                for (String str: array) {

                    if (map.containsKey(str)) {
                        int a = map.get(str) + 1;
                        map.put(str, a);
                    } else {
                        map.put(str, 1);
                    }
                }
            }

            writeToResult(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeToResult(HashMap<String, Integer> map) {
        synchronized (result) {
            for (String str : map.keySet()) {
                if (result.getStatistics().containsKey(str)) {
                    int newResult = result.getStatistics().get(str) + map.get(str);
                    result.getStatistics().put(str, newResult);
                } else {
                    result.getStatistics().put(str, map.get(str));
                }
            }
        }
    }
}
