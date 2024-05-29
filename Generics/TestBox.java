public class TestBox {
    public static void main(String[] args) {
        Integer myInt = 10;
        Box<Integer> boxInt = new Box<Integer>();
        boxInt.setT(myInt);
        System.out.println("MyInt: " + boxInt.getT());
        String myString = "Hello";
        Box<String> boxStr = new Box<String>();
        boxStr.setT(myString);
        System.out.println("myString: " + boxStr.getT());
        BoxString<String> myNewBoxStr = new BoxString<>(); //Diamond syntax - String is not specified
        myNewBoxStr.setT(myString);
        System.out.println("myNewBoxStr: " + myNewBoxStr.getStr());
        // will not compile: myNewBoxStr.setT(myInt);
    }
}