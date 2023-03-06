import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {
        String[] nameArr = {"IronMan", "Captain", "Hulk", "Thor"};
        List<String> nameList = Arrays.asList(nameArr);

        Stream<String> nameStream = nameList.stream();
        Stream<String> arrayStream = Arrays.stream(nameArr);

        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b2", "b3");
        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .count();
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of(new String[]{"a", "b", "c"});

        //필터링
        myList.stream().filter(name -> name.contains("a")).forEach(System.out::println);

        //데이터 변환 - Map(기존의 Stream 요소들을 변환하여 새로운 Stream 형성)
        myList.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

        //메소드 참조를 이용해 변경
        Stream<File> fileStream = Stream.of(new File("Test1.java"), new File("Test2.java"));
        fileStream.map(File::getName).forEach(System.out::println);

        //정렬 - sorted(Stream 요소를 정렬하기 위해서는 sorted 사용) default 오름, 내림 reverseOrder()
        List<String> list = Arrays.asList("Java", "Scala", "Groovy");
        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
