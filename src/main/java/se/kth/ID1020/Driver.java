package se.kth.ID1020;


public class Driver {
    public static void main(String[] args) {
        RecursivePascal recursive = new RecursivePascal();
        IterativePascal iterative = new IterativePascal();

        recursive.setReverse(false);
        iterative.setReverse(false);
        recursive.printPascal(5);
        iterative.printPascal(5);
        recursive.setReverse(true);
        iterative.setReverse(true);
        recursive.printPascal(5);
        iterative.printPascal(5);
    }
}
