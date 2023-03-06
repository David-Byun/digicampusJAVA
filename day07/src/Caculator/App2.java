import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {
        String[] nameArr = {"IronMan", "Captain", "Hulk", "Thor"};
        List<String> nameList = Arrays.asList(nameArr);
        System.out.println(nameList);

        Stream<String> nameStream = nameList.stream();
        Stream<String> arrayStream = Arrays.stream(nameArr);

        System.out.println(nameList);
        nameStream.sorted().forEach(System.out::println);
    }
}
