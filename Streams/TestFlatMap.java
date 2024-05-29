import java.util.*;
import java.util.stream.*;

public class TestFlatMap {
    public static void main(String[] args) {
        String line1 = "For Brutus is an honourable man";
        String line2 = "Give me your hands";
        String line3 = "Misery acquaints a man with strange bedfellows";
        List<String[]> strList = Stream.of(line1, line2, line3).map(s -> s.split(" +")).toList();
        for(String[] strArray:strList) {
            for(String str:strArray)
                System.out.println("map str: " + str);
        }
        List<String> strArray = Stream.of(line1, line2, line3).flatMap(s -> Arrays.stream(s.split(" +"))).toList();
        for(String str:strArray)
            System.out.println("flatmap str: " + str);
    }
}