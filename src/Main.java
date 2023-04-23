import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        List<String> list = Arrays.asList("a", "b", "c", "d");


        List<String> result = list.stream()
                .limit(3)
                .map(String::toUpperCase)
                .sorted((String s1, String s2) -> s1.substring(1,2).compareTo(s2.substring(1, 2)))
                .toList();
    }
}