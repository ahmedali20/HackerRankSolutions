import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String A=scanner.nextLine().toLowerCase();
        String B=scanner.nextLine().toLowerCase();

        int a=A.length()+B.length();
        System.out.println(a);
        if (A.compareTo(B) > 0)
            System.out.println("Yes");
        else System.out.println("No");

        String c=A.substring(0,1).toUpperCase()+A.substring(1);
        String b=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(c+" "+b);
    }
}
