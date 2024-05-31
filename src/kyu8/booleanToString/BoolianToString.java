package kyu8.booleanToString;

public class BoolianToString {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        boolean b =true;
        for (int i = 0; i < 1000; i++)
            System.out.println(i);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
