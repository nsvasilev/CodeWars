package kyu8.arrayMult;

public class ArrayMult {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,2,4,6,4};

        System.out.println(multiply(arr));

    }
    public static int multiply(int[] arr){
        int mult =1;
        for (int i =0; i < arr.length;i++) {
            mult = mult * arr[i];

        }
        return mult;
    }
}
