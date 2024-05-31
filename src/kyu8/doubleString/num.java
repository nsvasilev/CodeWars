package kyu8.doubleString;

import java.util.Arrays;

public class num {
    public static void main(String[] args) {
        int n = 4321;
        String str = "" + n;
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        int[] arr = new int [str1.length()];
        for (int i = 0; i < str.length(); i++) {
           arr[i] = Integer.parseInt(String.valueOf(str1.charAt(i)));
        }
        System.out.println(Arrays.toString(arr));
    }
}
