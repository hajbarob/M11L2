package stream.reandom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMergeTest {

    public static void main(String[] args) {

        Stream<String> names = Stream.of("Ivan", "Olaf", "Galga", "Dot", "Jan", "Clod");
        Stream<String> indexes = Stream.of("1", "2", "3", "4");

        merge(names, indexes).peek(System.out::println).collect(Collectors.toSet());

    }

    public static Stream<String> merge(Stream<String> aStream, Stream<String> bStream) {
        List<String> res = new ArrayList<>();

        Iterator<String> iteratora = aStream.iterator();
        Iterator<String> iteratorb = bStream.iterator();

        while (iteratora.hasNext() && iteratorb.hasNext()) {
            res.add(iteratora.next());
            res.add(iteratorb.next());
        }

        return res.stream();
    }
}
