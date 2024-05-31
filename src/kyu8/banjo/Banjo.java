package kyu8.banjo;


public class Banjo {
    public static void main(String[] args) {
        String s = null;
        String name = "Ruby";
        String firsLetter = String.valueOf(name.charAt(0));
        if (firsLetter.equals("R") || firsLetter.equals("r") ) {
           s = name + " plays banjo";

        }
        else {
            s = name + " does not play banjo";
        }
        System.out.println(s);
    }

}
