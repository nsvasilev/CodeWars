package kyu8;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.*;

public class BynarryToNumber {
    public static void main(String[] args) throws Exception {
        List<Integer> binary = List.of(1,2,1,0);

        int sum = 0;
        int step = binary.size() - 1;

        for (Integer integer : binary) {
            if (integer == 0 || integer == 1) {
                sum += (int) (integer * Math.pow(2, step));
                step = step - 1;
            } else {
                throw new  UnexpectedException ("Обнаружен плохой элемент: " + integer);
            }

        }
        System.out.println(sum);
    }
}

