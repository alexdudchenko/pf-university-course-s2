package com.company.multitreading;

import com.company.stat.Result;

public class Main {

    public static void main(String[] args) {
        Result result = new Result();
        MultiReader firstReader = new MultiReader("Lab7/../Files/first.txt", result);
        MultiReader secondReader = new MultiReader("Lab7/../Files/second.txt", result);
        MultiReader thirdReader = new MultiReader("Lab7/../Files/third.txt", result);

        Thread thread1 = new Thread(firstReader);
        Thread thread2 = new Thread(secondReader);
        Thread thread3 = new Thread(thirdReader);

        long start = System.nanoTime();

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Result.printResult(result);

        System.out.println(System.nanoTime() - start);
    }
}
