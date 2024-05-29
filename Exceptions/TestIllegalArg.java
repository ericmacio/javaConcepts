public class TestIllegalArg {
    public static void main(String[] args) {
        try {
            SetIllegalArg.setData(100);
            SetIllegalArg.setData(-20);
        } catch (IllegalArgumentException e) {
            System.out.println("Got IllegalArgumentException from SetIllegalArg.setData: " + e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }
}