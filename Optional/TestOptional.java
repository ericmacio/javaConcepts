import java.util.*;
import java.util.Optional;
import java.util.stream.*;

public class TestOptional {
    public static void main(String[] args) {
        String st1 = "Eric Macioszczyk";
        System.out.println("st1: " + st1);
        Optional opt1 = Optional.of(st1);
        System.out.println("opt.isPresent(): " + opt1.isPresent());
        System.out.println("opt1: " + opt1);
        System.out.println("opt1.get(): " + opt1.get());
        String name = null;
        String st2 = Optional.ofNullable(name).orElse("Patricia Macioszczyk");
        System.out.println("st2: " + st2);
        String st3 = null;
        System.out.println("st3: " + st3);
        Optional opt3 = Optional.ofNullable(st3);
        System.out.println("opt3.isPresent(): " + opt3.isPresent());
        System.out.println("opt3: " + opt3);
        if(opt3.isPresent()) System.out.println("opt3.get(): " + opt3.get()); else System.out.println("empty");
        String firstName = "eric";
        Optional opt4 = Optional.ofNullable(firstName);
        System.out.println("opt4.isPresent(): " + opt4.isPresent());
        //opt4.isPresent(System.out::println);
        List<Optional<String>> listOfOptionals = Arrays.asList(Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));
        List<String> filteredList1 = listOfOptionals.stream()
                .flatMap(o -> o.map(Stream::of).orElseGet(Stream::empty))
                .collect(Collectors.toList());
        System.out.println("filteredList1: " + filteredList1);
        List<String> filteredList2 = listOfOptionals.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        System.out.println("filteredList2: " + filteredList2);
        List<String> filteredList3 = listOfOptionals.stream()
            .flatMap(Optional::stream)
            .collect(Collectors.toList());
        System.out.println("filteredList3: " + filteredList3);
    }
}