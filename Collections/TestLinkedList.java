import java.util.*;
public class TestLinkedList {
    public static void main(String args[]) {
        LinkedList<String> linkedList = new LinkedList<String> ();
        //A
        System.out.print("Liste en A: ");
        affiche(linkedList);
        //B
        linkedList.add("a");
        linkedList.add("b");
        System.out.print("Liste en B: ");
        affiche(linkedList);
        //C
        ListIterator<String> listIterator = linkedList.listIterator();
        listIterator.next(); //First element
        listIterator.add("c");
        listIterator.add("d");
        System.out.print("Liste en C: ");
        affiche(linkedList);
        //D
        listIterator = linkedList.listIterator();
        listIterator.next(); //First element
        listIterator.add("e");
        listIterator.add("f");
        System.out.print("Liste en D: ");
        affiche(linkedList);
        //E
        listIterator = linkedList.listIterator(linkedList.size()); //End of list
        while(listIterator.hasPrevious()) {
            String ch = listIterator.previous();
            if(ch == "e") {
                listIterator.remove();
                break;
            }
        }
        System.out.print("Liste en E: ");
        affiche(linkedList);
        //F
        listIterator = linkedList.listIterator();
        listIterator.next(); //First element
        listIterator.next(); //Next element
        listIterator.set("e");
        System.out.print("Liste en F: ");
        affiche2(linkedList);
    }
    public static void affiche (LinkedList<String> linkedList) {
        ListIterator<String> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()) System.out.print(listIterator.next() + " ");
        System.out.println();
    }
    public static void affiche2 (LinkedList<String> linkedList) {
        for(String s:linkedList) System.out.print(s + " ");
        System.out.println();
    }
}