class Person implements Cloneable {

    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

public class ShallowClone {

    public static void main(String[] args) throws CloneNotSupportedException {
    
        Address address = new Address("Delhi");
        Person originalPerson = new Person("Advait", address);

        Person clonedPerson = (Person) originalPerson.clone();

        // Changing city in the cloned address affects the original
        clonedPerson.address.city = "Muzaffarpur";

        System.out.println(originalPerson.address.city); // Output: Muzaffarpur
    }
}