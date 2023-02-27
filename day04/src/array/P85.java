package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P85 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream().filter(name -> name.contains("a")).map(m -> m.toLowerCase());
    }
}
