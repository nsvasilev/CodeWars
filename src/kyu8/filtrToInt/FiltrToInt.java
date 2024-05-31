package kyu8.filtrToInt;


import java.util.List;

public class FiltrToInt {
    public static void main(String[] args) {
       List <Object> list1 = List.of(1, 2, "a", "b", "aasf", "1", "123", 123);
        List<Object> list = list1.stream().filter(x -> x instanceof Integer).toList();
        System.out.println(list);
    }
}
