package kyu8.middleCharacter;

public class MiddleCharacter {
    public static void main(String[] args) {
        String str = "prsty";

        int a = str.length() / 2;

        if (str.length() % 2 == 0) {
            System.out.println(str.substring((a - 1), (a + 1)));
        } else {
            System.out.println(str.substring((a), (a + 1)));
        }
    }


//    class Kata {
//        public static String getMiddle(String word) {
//            String s = "";
//            int length = word.length();
//            int half = length/2;
//
//            if (length % 2 == 0) {
//
//                s = word.substring(half - 1, half + 1);
//
//            } else {
//
//                s = word.substring(half, half + 1);
//
//            }
//
//            return s;
//        }
//    }
}