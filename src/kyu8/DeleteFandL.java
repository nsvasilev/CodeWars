package kyu8;

import java.util.Arrays;

public class DeleteFandL {
    public static void main(String[] args) {

            System.out.println(порезатьСукаНаЧастиФио("Романов Илья Олегович"));
        }

        public static String порезатьСукаНаЧастиФио(String string){
            String[] s = string.split(" ");
            for (int i = 0; i < s.length; i++) {
                s[i] = s[i].substring(0, 1);
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length; i++) {
                builder.append(s[i]).append(".").append(" ");
            }

            return builder.toString();
        }
//
//
//        String string = "testword efwef ";
//
//    }
//
//    public static String abbrevName(String string) {
//        String[] words = string.split(" ");
//        for (String word : words) {
//            word.substring(0, 1);
//
//        }
//
//return Arrays.toString(string.toCharArray());
    }

