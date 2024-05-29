import java.util.*;

public class TestHashSet2 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("args is null");
            return;
        }
        //Create a SortedSet
        Set<String> s = new HashSet<>(Arrays.asList(args));
        for(String word : s) {
            System.out.println(word);
        }
        s.add("aaa");
        s.add("xxx");
        System.out.println("s: " + s);
        s.remove("aaa");
        s.remove("xxx");
        System.out.println("s: " + s);
    }
}