import javax.naming.NoPermissionException;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt"))
        {
            byte chars[] = new byte[in.available()];
            in.read(chars, 0, chars.length);
            String[] numbers = new String(chars).split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            int c = a / b;
            System.out.println(c);
        } catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}