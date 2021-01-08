import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String A=scanner.nextLine();
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        String c=A.substring(x,y);
        System.out.println(c);
    }
}
