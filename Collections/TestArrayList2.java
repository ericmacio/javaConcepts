import java.util.*;
public class TestArrayList2 {
    public static void main(String args[]) {
        if(args.length == 0) {
            System.out.println("args is null");
            return;
        }
        //Create a SortedSet
        List<String> arrayList = new ArrayList<>(Arrays.asList(args));
        System.out.println("size of arrayList: " + arrayList.size());
        System.out.println("content of arrayList: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("content of Collections.sort(arrayList): " + arrayList);
    }
}