public class BoxString<T extends String> extends Box<T> {
    public String getStr() {
        return "This is the BoxString: " + getT();
    }
}