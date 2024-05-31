package kyu8.summArray;

import static java.util.Arrays.*;

public class SummArray {


    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 7, 10};
        System.out.println(sum(numbers));
    }

    public static int sum(int[] numbers) {
        if (numbers.length <= 1) {
            return 0;
        }

        int min = stream(numbers).min().getAsInt();
        int max = stream(numbers).max().getAsInt();
        int summ = stream(numbers).sum();
        summ = summ - max - min;
        return summ;


    }
}


