import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                long  a = scanner.nextLong();
                System.out.println(a + " can be fitted in:");
                if (a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (a >= Short.MIN_VALUE && a<=Short.MAX_VALUE)
                    System.out.println("* short");
                if (a >= Integer.MIN_VALUE && a<=Integer.MAX_VALUE)
                    System.out.println("* int");
                if (a >= Long.MIN_VALUE && a<=Long.MAX_VALUE)
                    System.out.println("* long");

            } catch (InputMismatchException e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }

        }
    }
}
