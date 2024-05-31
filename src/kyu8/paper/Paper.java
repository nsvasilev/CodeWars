package kyu8.paper;

public class Paper {
    public static int paperWork(int n, int m) {
        n = 0;
        m = 1;
        int paper = (((n > 0) && (m > 0)) ? (m * n) : 0);
       return paper;


    }
}