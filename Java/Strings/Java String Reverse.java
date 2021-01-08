
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static String reverse(String s) {

        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String A=scanner.nextLine();
        String b=reverse(A);

        if (A.equals(b))
            System.out.println("Yes");
        else System.out.println("No");
}
}
