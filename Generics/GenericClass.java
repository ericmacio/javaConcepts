public class GenericClass <T> {
    private T value;
    public void setValue(T t) {
        value = t;
    }
    public T getValue() {
        return value;
    }
}