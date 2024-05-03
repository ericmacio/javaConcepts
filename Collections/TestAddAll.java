import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestAddAll {
  public static void main(final String[] args) {
    String[] tableau = { "A", "B", "C", "D" };
    List<String> liste = new ArrayList<String>();

    Collections.addAll(liste, tableau);

    System.out.println("Contenu du tableau");
    for (String str : tableau) {
      System.out.print(" " + str);
    }

    System.out.println("\nContenu de la liste");
    for (String str : liste) {
      System.out.print(" " + str);
    }

    tableau[0] = "AA";
    liste.add("E");

    System.out.println("\nContenu du tableau");
    for (String str : tableau) {
      System.out.print(" " + str);
    }

    System.out.println("\nContenu de la liste");
    for (String str : liste) {
      System.out.print(" " + str);
    }
  }
}