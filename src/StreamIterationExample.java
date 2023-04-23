import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterationExample {

    public static void main(String[] args) {
        Set<String> collect = Stream.of("Vova", "Elon", "Elona", "Vova", "Elon", "Elona", "Vova", "Elon", "Elona")
                .map(s -> {
                    String a = "";
                    for (int i = 0; i < 90000; i++) {
                        a += i;
                    }
                    return s.toUpperCase();
                })
                .peek(System.out::println)
                .map(String::toLowerCase)
                .peek(System.out::println)
                .collect(Collectors.toSet());
    }
}
