package lab6;

public enum Constant {
    n(8), N(10_000_000L);

    // n - first element
    // N - quantity of elements

    private final long i;

    Constant(long i) {
        this.i = i;
    }

    public long getI() {
        return i;
    }
}
