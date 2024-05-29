import java.util.*;
import java.util.stream.Collectors;

public class TestFilter {
    public static void main(String args[]) {
        if(args.length == 0) {
            System.out.println("args is null");
            return;
        }
        List<String> l = List.of("tiger", "TIGER", "Tiger", "cat", "Cat", "leopard");
        System.out.println("l: " + l);
        String stringFiltered = l.stream()
                                .filter(element -> element.equalsIgnoreCase(args[0]))
                                .collect(Collectors.joining(", "));
        System.out.println("stringFiltered: " + stringFiltered); 
    }
}