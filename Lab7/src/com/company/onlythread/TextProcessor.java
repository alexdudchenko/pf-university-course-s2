package com.company.onlythread;

import com.company.stat.Result;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextProcessor implements TextStatProcessor {

    @Override
    public Result processText(String filename, Result result) throws IOException {
        String[] array;
        String currentLine;

        try (FileInputStream fis = new FileInputStream(filename);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {


            while ((currentLine = br.readLine()) != null) {
                array = currentLine.split(" ");

                for (String str : array) {
                    if (result.getStatistics().containsKey(str)) {
                        int a = result.getStatistics().get(str) + 1;
                        result.getStatistics().put(str, a);
                    } else {
                        result.getStatistics().put(str, 1);
                    }
                }
            }
        }
        return result;
    }
}
