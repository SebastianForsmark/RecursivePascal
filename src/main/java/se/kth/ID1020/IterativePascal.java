package se.kth.ID1020;


import java.util.Arrays;

public class IterativePascal
        implements Pascal{
        int[][] pascalArray;
    private boolean reverse = true;

    public void printPascal(int i) {
        pascalArray = new int[i][i];

        for (int j = 0; j < i; j++) {
            for (int q = 0; q <=j; q++) {
                pascalArray[j][q] = binom(j,q);
            }

        }

        if (reverse) {
            for (int j = i-1; j >=0; j--) {
                System.out.println(Arrays.toString(pascalArray[j]));
            }
        }
        else{
            for (int j = 0; j < i; j++) {
                System.out.println(Arrays.toString(pascalArray[j]));
            }
        }
        }
    public int binom(int n, int k) {
        if (n == k || k == 0) {
            return 1;
        }
        else{
            return pascalArray[n-1][k-1]+pascalArray[n-1][k];
        }
    }
}
