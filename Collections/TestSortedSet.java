import java.util.*;

public class TestSortedSet {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("args is null");
            return;
        }
        //Create a SortedSet
        SortedSet<String> s = new TreeSet<>(Arrays.asList(args));
        for(String word : s) {
            System.out.println(word);
        }
        //Special elements
        String first = s.first();
        System.out.println("first: " + first);
        String last = s.last();
        System.out.println("last: " + last);
        s.add("aaa");
        s.add("xxx");
        System.out.println("s: " + s);
        s.remove("aaa");
        s.remove("xxx");
        System.out.println("s: " + s);
        //All elements but first
        SortedSet<String> tail = s.tailSet(first + '\0');
        System.out.println("tail: " + tail);
        //All elements but last
        SortedSet<String> head = s.headSet(last);
        System.out.println("head: " + head);
        //Middle
        SortedSet<String> middle = s.subSet(first + '\0', last);
        System.out.println("middle: " + middle);
    }
}