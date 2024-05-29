public class ThrowsIllegalArg {
    private  int data;
    public void setData(int data) {
        if(data < 0) throw new IllegalArgumentException("Data must not be negative. Value: " + data);
        this.data = data;
        System.out.println("Data: " + this.data);
    }
}