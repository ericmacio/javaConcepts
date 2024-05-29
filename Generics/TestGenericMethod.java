import java.util.function.Function;

public class TestGenericMethod {
    private static String printStr(String str) {
        System.out.println("printStr: " + str);
        return "OK";
    }
    private static <T, G> void myGenericMethod(T t, G g, Function<String, String> performAction) {
        String str = t + ", " + g;
        System.out.println("performAction: " + performAction.apply(str));
    }
    public static <E> void displayArray(E[] data) {
        for(E element:data) {
            System.out.print(element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "Hello";
        String name = "Tom";
        myGenericMethod(str, name, TestGenericMethod::printStr);
        Integer myInt = 10;
        myGenericMethod(str, myInt, TestGenericMethod::printStr);
        Integer[] integerArray = { 1, 2, 3, 4, 5 };
        String[] charArray = { "a", "b", "c", "d", "e" };
        displayArray(integerArray);
        displayArray(charArray);

    }
}