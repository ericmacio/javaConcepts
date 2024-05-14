public class TestAbstract {
    public static void main (String[] args) {
        System.out.println("Testing abstract");
        SubAbstractClass subAb = new SubAbstractClass();
        System.out.println(subAb.getHello() + " " + subAb.getTom());
    }
}