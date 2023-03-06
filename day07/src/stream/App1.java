import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App1 {

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

        // max / min / Avg -> Optional로 값 반환(비어있을 경우)
        OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
        System.out.println(min.getAsInt());

        int max = IntStream.of(1, 3, 5, 7, 9).max().orElse(0);
        IntStream.of(1,3,5,7,9).average().ifPresent(System.out::println);
        
        // sum / count -> 0으로 반환
        long count = IntStream.of(1, 3, 5, 7, 9).count();
        long sum = IntStream.of(1, 3, 5, 7, 9).sum();
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        //Stream의 요소들을 List, Set, Map 다른 종류 결과로 수집하고 싶은 경우 Collect 함수 이용
        List<Product> productList = Arrays.asList(
                new Product(23, "potato"),
                new Product(14, "orange"),
                new Product(13, "leomn")
        );

        // Stream 작업 결과를 List로 반환
        productList.stream().map(Product::getName).collect(Collectors.toList()).forEach(System.out::println);

        
        // anyMatch 1개 요소라도 해당 조건을 만족하는가, allMatch 모든 요소가 해당 조건을 만족하는가
        List<String> names = Arrays.asList("Eric", "Elena", "Java");
        boolean a = names.stream().anyMatch(name -> name.contains("a"));
        System.out.println("a = " + a);

        boolean b = names.stream().allMatch(name -> name.length() > 3);
        System.out.println("b = " + b);

    }
}
