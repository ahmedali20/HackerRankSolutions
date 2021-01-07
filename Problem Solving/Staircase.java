import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0 && n <= 100) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i+j > n)
                        System.out.print("#");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
