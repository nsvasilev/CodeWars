package kyu8.arrayMaxMin;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 5, 8, -1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
       int[] arr1 = new int[]{max,min};
        System.out.println(arr1);
    }
}

