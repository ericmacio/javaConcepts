public class SetIllegalArg {
    private static final ThrowsIllegalArg illegalArg = new ThrowsIllegalArg();
    public static void setData(int data) {
        illegalArg.setData(data);
    }
}