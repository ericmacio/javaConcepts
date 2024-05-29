import java.util.*;

public class TestList {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("args is null");
            return;
        }
        //Create Lists
        List<String> l = new ArrayList<String>(Arrays.asList(args));
        List<String> words = Arrays.asList("hello", "world");
        List<String> words2 = List.of("hello", "world");
        System.out.println("l: " + l);
        System.out.println("words: " + words);
        System.out.println("words2: " + words2);
        l.add("aaa");
        l.add("xxx");
        System.out.println("l after adding aaa and xxx: " + l);
        l.remove("aaa");
        l.remove("xxx");
        System.out.println("l after removing aaa and xxx: " + l);
        //words.add("tom"); //java.lang.UnsupportedOperationException words is immutable
        //words2.add("tom"); //java.lang.UnsupportedOperationException words2 is immutable
        //Querying and setting element by index
        String first = l.get(0);
        System.out.println("first: " + first);
        String last = l.get(l.size() - 1);
        System.out.println("last: " + last);
        l.set(0, last); //Last must be first
        System.out.println("l after Last must be first: " + l);
        //Adding and inserting elements. Add can append or insert
        l.add(first);       //Append the first word at end of the list
        System.out.println("l after Append the first word at end of the list (add): " + l);
        l.add(0,first);     //Insert first at the start of the list again
        System.out.println("l after Insert first at the start of the list again(add): " + l);;
        l.addAll(words);    //Append a collection at the end of the list
        System.out.println("l after Append a collection at the end of the list(addAll): " + l);
        l.addAll(1, words); //Insert collection after first word
        System.out.println("l after Insert collection after first word(addAll): " + l);
        //Sublists: backed by the original list
        List<String> sub = l.subList(1,3);  //Second and third elements
        System.out.println("sub Second and third elements: " + sub);
        sub.set(0, "hi");                   //Modifies 2nd element of l
        System.out.println("sub after modifies first element of sub: " + sub);
        System.out.println("l after modifies first element of sub: " + l);
        //Searching list
        int p = l.indexOf(last);
        System.out.println("p index of last: " + p);
        //Removing elements
        l.remove(last);
        System.out.println("l after remove last: " + l);
        l.remove(0);
        System.out.println("l after remove 0: " + l);
        l.removeAll(words);
        System.out.println("l after remove words: " + l);
        l.clear();
        System.out.println("l after clear: " + l);
    }
}