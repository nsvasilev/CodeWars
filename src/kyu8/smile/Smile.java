package kyu8.smile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Smile {
    public static void main(String[] args) {
        List <String> arr = new ArrayList<>();
        arr.add(":)");
        arr.add(":(");
        arr.add(":D");
        arr.add(":c");
        System.out.println(arr);
        List<String> matches = arr.stream().filter(it -> it.contains(")")).collect(Collectors.toList());
        System.out.println(matches);

    }
}
