import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class JavaLambda {
    public static void main(String[] args) {
        List<String> al=new ArrayList<>();
        al.add("kjcnkj");
        al.add("WSFj");
        al.add("kwAFRkj");
       //1  List<String> str=al.stream().filter(obj->obj.startsWith("k")).collect(Collectors.toList());
        //System.out.println(str);

        List<String> replace = al.stream().map(n -> n.replace("kjcnkj", "dd")).collect(Collectors.toList());
         System.out.println(replace);


        List<String> people = Arrays.asList("Alice", "Bob", "Charlie");
        people.forEach(person -> System.out.println("Hello, " + person.length()));  //this is for iteration..


        //people.forEach(person -> System.out.println("Hello, " + person.getName()));
        //listOfStrings.forEach(s -> System.out.println(s.toUpperCase()));




        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Square each number using map()
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squaredNumbers);


        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        Optional<Integer> maxElement = numbers.stream().max(Integer::compareTo);
        System.out.println(maxElement);

        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> uppercaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        long count = words.stream().count();
        String concatenated = words.stream().collect(Collectors.joining(", "));

        List<String> words4 = Arrays.asList("apple", "banana", "cherry");
        words4.sort((a, b) -> Integer.compare(a.length(), b.length()));





    }
}
