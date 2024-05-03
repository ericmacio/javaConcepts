import java.io.*;

public class TestPerson {
    static String OUTPUT_FILE="./person.out";
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Person p = new Person();
        p.setAge(20);
        p.setName("Joe");
        p.setHeight(180);
        
        FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(p);
        objectOutputStream.flush();
        objectOutputStream.close();
        
        FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person = (Person) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("person name: " + person.getName());
        System.out.println("person age: " + person.getAge());
        System.out.println("person height: " + person.getHeight());
        System.out.println("person country: " + person.country);
    }
}