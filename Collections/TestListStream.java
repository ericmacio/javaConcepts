import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestListStream {
  public static void main(final String[] args) {
    String[] array = { "ABCD", "ABE", "CGRTB", "DAVFD", "ABCD" };
    List<String> myList = Arrays.asList(array);
    System.out.println("myList: " + myList.toString());
    List<String> newList = myList.stream().filter(s -> s.indexOf("A")>=0).collect(Collectors.toList());
    System.out.println("myList: " + myList.toString());
    System.out.println("newList: " + newList.toString());
  }
}