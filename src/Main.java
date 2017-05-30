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
            Armstrong(line);
        }
    }
    
    public static void Armstrong(String line) {
        int lineValue = Integer.parseInt(line);
        int armstrongValue = 0;
        char[] numbers = line.toCharArray();
        String answer;
        
        for(int i = 0; i < numbers.length; i++) {
            armstrongValue += Math.pow(Character.getNumericValue(numbers[i]), numbers.length);
        }
        
        /*
        if(lineValue == armstrongValue) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        */
        
        answer = (lineValue == armstrongValue) ? "True" : "False";
        System.out.println(answer);
    }
}
