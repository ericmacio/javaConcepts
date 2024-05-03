import java.util.*;
public class TestHashSet {
    public static void main(String args[]) {
        int t[] = {2, 5, -6, 2, -8, 9, 5};
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i:t) {
            boolean isAdded = hashSet.add(i);
            if(isAdded) 
                System.out.println(i + " has been added");
            else
                System.out.println(i + " exists already");
        }
        System.out.println("A:content of hashSet: " + hashSet);
        Integer five = 5;
        boolean isRemoved = hashSet.remove(five);
        if(isRemoved) 
            System.out.println(five + " has been removed");
        else
            System.out.println(five + " does not exist");
        System.out.println("B:content of hashSet: " + hashSet);
        boolean fiveExists = hashSet.contains(five);
        if(!fiveExists) 
            System.out.println("hashSet does not contain " + five);
        else
            System.out.println("ERROR: hashSet contains " + five);
    }
}