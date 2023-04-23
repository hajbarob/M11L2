package stream;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class NameOrderStream {


    public static void main(String[] args) {
        HumanGenerator humanGenerator = new HumanGenerator();

        Collection<Human> generate = humanGenerator.generate(10);

        AtomicInteger i = new AtomicInteger(1);

        Set<String> collect = generate.stream()
                .map(h -> h.getName())
                .map(String::toUpperCase)
                .map(s -> i.getAndIncrement() + ". " + s)
                .peek(System.out::println)
                .collect(Collectors.toSet());

//        generate.stream()
//                .map(Human::getName);
    }
}
