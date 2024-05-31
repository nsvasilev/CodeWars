package kyu8.validatePin;


import java.util.regex.Pattern;

public class ValidatePin {
    public static void main(String[] args) {
        String pin = "1111";
        char[] pin1 = pin.toCharArray();
        for (char c : pin1) {
            if (Character.isDigit(c))  {


//        char[] pin1 = pin.toCharArray();
//        if (pin1.length == 4 || pin1.length == 6) {
//            for (char c : pin1) {
//                if (Character.isDigit(c)) {
//                } else {
//                    sum++;
//
//                }
//            }
//        }
    }
}}}