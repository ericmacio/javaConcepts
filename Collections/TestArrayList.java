import java.util.*;
public class TestArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<Integer> ();
        System.out.println("A:size of arrayList: " + arrayList.size());
        for(int i=0; i<10; i++) arrayList.add(new Integer(i));
        System.out.println("B:size of arrayList: " + arrayList.size());
        System.out.print("B:content of arrayList: ");
        for(Integer i:arrayList) System.out.print(i + " ");
        System.out.println();
        arrayList.remove(3);
        arrayList.remove(5);
        arrayList.remove(5);
        System.out.println("C:content of arrayList: " + arrayList);
        arrayList.add(2, new Integer(100));
        arrayList.add(2, new Integer(200));
        System.out.println("D:content of arrayList: " + arrayList);
        arrayList.set(2, new Integer(1000));
        arrayList.set(5, new Integer(2000));
        System.out.println("E:content of arrayList: " + arrayList);
    }
}