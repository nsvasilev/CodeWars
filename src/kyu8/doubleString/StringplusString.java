package kyu8.doubleString;

import java.util.HashSet;
import java.util.Set;

public class StringplusString {
    public static void main(String[] args) {
        String str1 = "srtA";
        String str2 = "ef";
        Set<Character> map = new HashSet<>();
        String lowerCase = str1.toLowerCase();
        char[] s = lowerCase.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (!map.contains(s[i])){
//                return false;
            }
            map.add(s[i]);
        }
//        return true;


//        int sum = 0;
//        char[] s = str1.toCharArray();
//        for (int i = 0; i < s.length - 1; i++) {
//            for (int j = i + 1; j < s.length; j++) {
//                if (( Character.toLowerCase(s[i])== Character.toLowerCase(s[j]) )) {
//                    sum++;
//
//                }
//
//            }
//        }
//        if (sum == 0) {
//            System.out.println("nice");
//        } else {
//            System.out.println("no");
//
//        }
    }
}