package kyu8.complementaryDNA;

public class DNA {
    public static void main(String[] args) {
        String str = "abc";
        char [] ch = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            if('a'==str.charAt(i)){
                ch[i] = 'c';
            }
            if('b'==str.charAt(i)){
                ch[i] = 'p';
            }
            if('c'==str.charAt(i)){
                ch[i] = 'q';
            }
        }
        System.out.println(String.valueOf(ch));

    }
}

