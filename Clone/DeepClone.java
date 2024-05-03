class DeepPerson implements Cloneable {

    String name;
    DeepAddress address;

    public DeepPerson(String name, DeepAddress address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class DeepAddress implements Cloneable {
    String city;

    public DeepAddress(String city) {
        this.city = city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class DeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {
    
        DeepAddress address = new DeepAddress("Delhi");
        DeepPerson originalPerson = new DeepPerson("Advait", address);

        DeepPerson clonedPerson = (DeepPerson) originalPerson.clone();
        clonedPerson.address = (DeepAddress) originalPerson.address.clone();

        // Changing city in the cloned address doesn't affect the original
        clonedPerson.address.city = "Muzaffarpur";

        System.out.println(originalPerson.address.city); // Output: Delhi
    }
}