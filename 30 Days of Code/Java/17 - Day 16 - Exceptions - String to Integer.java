
import java.io.IOException;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scanner.next();
        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        }catch (Throwable throwable){
            System.out.println("Bad String");
        }
    }

}
