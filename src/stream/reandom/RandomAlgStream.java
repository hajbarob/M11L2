package stream.reandom;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomAlgStream {

    public static void main(String[] args) {
        RandomAlg randomAlg = new RandomAlg();

        Stream<Integer> intStream = Stream.iterate(5895156, (seed) -> randomAlg.c(seed).next());

        Set<Integer> collect = intStream.limit(5)
                .peek(System.out::println)
                .collect(Collectors.toSet());
    }
}
