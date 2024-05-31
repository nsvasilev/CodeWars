package kyu8;

import java.util.Arrays;

public class Square {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5};
        int summ = 0;
        for (int j : arr) {
            summ = (int) (summ + (Math.pow(j, 2)));
        }
        System.out.println(summ);
    }
}

