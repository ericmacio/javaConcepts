import java.nio.file.*;
import java.nio.charset.*;
import java.io.*;
import java.util.*;

public class CopyFile {
    public static void main(String[] args) {
        Charset cs = StandardCharsets.UTF_8;
        var inputFile = new File("copyInput.txt");
        Path ouputPath = Path.of("copyOutput.txt");
        try(var in = new FileInputStream(inputFile)) {
            Files.copy(in, ouputPath);
            List<String> lines = Files.readAllLines(ouputPath, cs);
            System.out.println("lines: " + lines);
            Thread.sleep(5000);
            Files.delete(ouputPath);
            System.out.println("output file deleted");
        } catch(IOException | InterruptedException ex) {
            System.out.println("Got IOException: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}