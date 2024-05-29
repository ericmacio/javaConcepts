public class TestGenericClass {
    public static void main(String[] args) {
        GenericClass<String> gC = new GenericClass<>();
        String myValue = "Hello";
        gC.setValue(myValue);
        System.out.println("getValue: " + gC.getValue());
    }
}