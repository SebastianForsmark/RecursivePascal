package se.kth.ID1020;

import java.util.HashMap;

public class RecursivePascal extends ErrorPascal
        implements Pascal {

    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    private int k, n, finalRow = -1;
    private boolean isFirstIteration = true;
    private boolean reverse = false;

    public void printPascal(int i) {
        if (finalRow != n || (n != 0 && reverse)) {
            if (isFirstIteration) {
                super.printPascal(i); //Sanity check
                if (reverse)
                    n = i-1;
                finalRow = i;
                isFirstIteration = false;
            }
            if (k == n) {
                System.out.print(" ");
                System.out.println(binom(n, k));
                k = 0;
                printPascal(n + isReverse());
                return;
            }
            if (k < n) {
                System.out.print(" ");
                System.out.print(binom(n, k++));
                printPascal(n);
            }
        }
        resetVariables();
    }

    public int binom(int n, int k) {
        super.binom(n, k); // Sanity check
        String pascalValue = n + " " + k;
        if (n == k || k == 0) {
            hashMap.put(pascalValue, 1);
            return 1;
        }
        if (hashMap.containsKey(pascalValue)) {
            return hashMap.get(pascalValue);
        } else {
            hashMap.put(pascalValue, binom(n - 1, k - 1) + binom(n - 1, k));
            return binom(n - 1, k - 1) + binom(n - 1, k);
        }
    }


    public void resetVariables() {
        k = 0;
        n = 0;
        finalRow = -1;
        isFirstIteration = true;

    }

    public int isReverse() {
        if (reverse) {
            n--;
            return -1;
        } else {
            n++;
            return 1;
        }
    }
    public void setReverse(boolean a){
        reverse = a;
    }
}