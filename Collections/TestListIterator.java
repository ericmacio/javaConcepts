import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ListIterator;

public class TestListIterator{
  public static void main(final String[] args) {
    String[] tableau = { "1", "2", "3", "4", "5" };
    List<String> inputList = new ArrayList<String>();
    Collections.addAll(inputList, tableau);
    System.out.println("inputList: " + inputList.toString());
    ListIterator<String> lit = inputList.listIterator(); // ^ 1 2 3 4 5
    System.out.println("lit.next(): " + lit.next()); // 1 ^ 2 3 4 5 // assert 1
    System.out.println("lit.next(): " + lit.next()); // 1 2 ^ 3 4 5 // assert 2
    System.out.println("lit.remove()");
    lit.remove();
    System.out.println("lit.add('0')");
    lit.add("0");
    System.out.println("lit.next(): " + lit.next());
    System.out.println("lit.previous(): " + lit.previous());
    System.out.println("inputList: " + inputList.toString());
    //
    System.out.println("-----------------");
    int[] intTableau = { 1, 2, 3, 4, 5 };
    List<Integer> intList = new ArrayList<Integer>();
    for(int i:intTableau) intList.add(i);
    System.out.println("inputList: " + intList.toString());
    ListIterator<Integer> lit2 = intList.listIterator(); // ^ 1 2 3 4 5
    System.out.println("lit2.next(): " + lit2.next()); // 1 ^ 2 3 4 5 // assert 1
    System.out.println("lit2.next(): " + lit2.next()); // 1 2 ^ 3 4 5 // assert 2
    System.out.println("lit2.remove()");
    lit2.remove();
    System.out.println("lit2.add(0)");
    lit2.add(0);
    System.out.println("lit2.next(): " + lit2.next());
    System.out.println("lit2.previous(): " + lit2.previous());
    System.out.println("inputList: " + intList.toString());
  }
}