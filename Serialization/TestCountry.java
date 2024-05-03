import java.io.*;
public class TestCountry{
  
    public static void main(String[] args) {
        String OUTPUT_FILE="./country.txt";
        Country c = new Country();
        c.setCode(374);
        c.setName("Armenia");
        try {
            //Output write into a file
            FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            c.writeExternal(objectOutputStream);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
            //Input read from a file
            FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Country c2 = new Country();
            c2.readExternal(objectInputStream);
            objectInputStream.close();
            fileInputStream.close();
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("c2 code: " + c.getCode());
        System.out.println("c2 name: " + c.getName());
    }
}