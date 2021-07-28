package lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        testFormula();

        testOnlyTread();

        testTreads(2);

        testTreads(4);

        testTreads(8);

        testTreads(16);

        testTreads(32);
    }

    static void testFormula() {
        long n = Constant.n.getI();
        long N = Constant.N.getI();
        long aN = n * N;

        long time1 = System.nanoTime();
        long result = (n + aN) * N / 2;
        long time2 = System.nanoTime();

        System.out.println("Value: " + result);
        System.out.println("Formula method has completed in " + (time2 - time1) + " ns\n");
    }

    static void testOnlyTread() {
        long result = 0;
        long time1 = System.nanoTime();

        for (long i = 1; i <= Constant.N.getI(); i++) {
            result += i  * Constant.n.getI();
        }

        long time2 = System.nanoTime();

        System.out.println("Value: " + result);
        System.out.println("Time 1 tread: " + + (time2 - time1) + " ns\n");
    }

    static void testTreads(int treads) {
        List<Counter> listOfThreads = new ArrayList<>();
        TreeSet<Long> timeSet = new TreeSet<>();

        for (int i = 0; i < treads; i++) {
            Counter c = new Counter(i + 1, Constant.n.getI(), Constant.N.getI(), treads);
            listOfThreads.add(c);
        }

        for (Counter c : listOfThreads) {
            try {
                c.join();
                timeSet.add(c.getDate1());
                timeSet.add(c.getDate2());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long time1 = timeSet.first();
        long time2 = timeSet.last();

        long result = listOfThreads.stream().map(Counter::getResult).reduce(Long::sum).get();

        System.out.println("Value: " + result);
        System.out.printf("Time %d treads: " + (time2 - time1) + " ns\n\n", treads);
    }
}

