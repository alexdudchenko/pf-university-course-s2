package com.company;

import java.io.*;
import java.util.*;

public class FirstStrategy implements Strategy {

    @Override
    public ArrayList<String> commonestWords(String filename) throws IOException {

        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        String[] array;
        String currentLine;
        int popularCount = 0;


        try (FileInputStream fis = new FileInputStream(filename);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {


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

            for (String str : map.keySet()) {
                if (map.get(str) > popularCount) {
                    popularCount = map.get(str);
                }
            }

            for (String str : map.keySet()) {
                if (map.get(str) == popularCount) {
                    arrayList.add(str);
                }
            }
        }

        return arrayList;
    }
}
