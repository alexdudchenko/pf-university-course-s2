package com.company.onlythread;

import com.company.stat.Result;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static ArrayList<String> files;

    static {
        files = new ArrayList<>();
        files.add("Lab7/../Files/first.txt");
        files.add("Lab7/../Files/second.txt");
        files.add("Lab7/../Files/third.txt");
    }

    public static void main(String[] args) {
        long start;

        Result result;
        TextStatProcessor textProcessor = new TextProcessor();

        start = System.nanoTime();
        try {
            result = processAll(textProcessor);
            Result.printResult(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(System.nanoTime() - start);

    }

    private static Result processAll(TextStatProcessor textProcessor) throws IOException {
        Result result = new Result();
        for (String file : files) {
            textProcessor.processText(file, result);
        }
        return result;
    }
}
