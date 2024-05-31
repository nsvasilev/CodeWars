package kyu8.coutingSheeps;

public class CoutingSheeps {
    public static void main(String[] args) {
        System.out.println(countSheeps(new Boolean[]
                {true, true, true, false,
                        true, true, true, true,
                        true, false, true, false,
                        true, false, false, true,
                        true, true, true, true,
                        false, false, true, true}));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] && arrayOfSheeps[i]!= null) {
                count += 1;
            }
        }
        return count;
    }
}
