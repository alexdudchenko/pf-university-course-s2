package lab6;

class Counter extends Thread {
    private final int number;
    private final long n;
    private final long N;
    private final int countOfThreads;
    private long result = 0;
    private long date1;
    private long date2;

    Counter(int number, long n, long N, int countOfThreads) {
        this.number = number;
        this.n = n;
        this.N = N;
        this.countOfThreads = countOfThreads;

        this.start();
    }

    @Override
    public void run() {
        long countOfSteps = N / countOfThreads;
        int steps = 0;
        date1 = System.nanoTime();

        for (long i = (number - 1) * countOfSteps * n; steps < countOfSteps; steps++) {
            i += n;
            result += i;

        }
        date2 = System.nanoTime();

    }

    public long getResult() {
        return result;
    }

    public long getDate1() {
        return date1;
    }

    public long getDate2() {
        return date2;
    }
}
