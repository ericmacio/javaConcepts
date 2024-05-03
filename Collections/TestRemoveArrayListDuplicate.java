import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class TestRemoveArrayListDuplicate {
  public static void main(final String[] args) {
    String[] array = new String[]{ "a", "b", "c", "d", "a", "e" };
    List<String> inputList = new ArrayList<String>();
    Collections.addAll(inputList, array);
    System.out.println("inputList: " + inputList);
    Set<String> mySet = new HashSet<String>(inputList);
    System.out.println("mySet: " + mySet);
    inputList.clear();
    inputList.addAll(mySet);
    System.out.println("inputList: " + inputList);
  }
}