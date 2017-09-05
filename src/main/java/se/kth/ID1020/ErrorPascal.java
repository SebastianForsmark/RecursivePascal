package se.kth.ID1020;


public abstract class ErrorPascal
        implements Pascal {

    public void printPascal(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public int binom(int n, int k) {
        if (k > n || k < 0 || n < 0)
            throw new IllegalArgumentException();
        return 0;
    }
}
