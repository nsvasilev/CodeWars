package kyu8;

import java.util.Arrays;

import static java.util.Arrays.*;

public class ArrayMinMax {
    public static void main(String[] args) {
        String numbers = "4 5 2 67";
        int[] numArr = stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = numArr[0];
        int max = numArr[0];
        for (int i = 0; i< numArr.length; i++){
            if (numArr[i] >= max) max = numArr[i];
            if (numArr[i] <= min) min = numArr[i];
        }
        System.out.print(max +" "+min);
        //System.out.println(numbers);
//        String[] numbersStr = numbers.split(" ");
//        int[] numbersInt = new int[numbersStr.length];
//        for (int i = 0; i < numbersStr.length; i++) {
//            numbersInt[i] = Integer.parseInt(numbersStr[i]);
//        }
//        System.out.println(numbersInt);
    }

}
