/**
 *
 * @author Scott Pantall
 */
import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main (String[] args) throws IOException {
        Path file = Paths.get(args[0]);
        BufferedReader buffer = Files.newBufferedReader(file);
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            //System.out.println(line);
            Armstrong(line);
        }
    }
    
    public static void Armstrong(String line) {
        System.out.println(line);
        //char[] numbers = line.toCharArray();
        
    }
}
