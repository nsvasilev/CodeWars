package kyu8.createArray;

import java.util.Arrays;

import static java.lang.Math.abs;

public class CreateArray {
    public static void main(String[] args) {
        int n = 5;
        int [] arr = new int[n];
        for (int i = 0; i < arr.length;i++) {
            arr[i] =n-i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
