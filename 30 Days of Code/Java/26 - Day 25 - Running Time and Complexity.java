
import java.io.IOException;
import java.util.Scanner;


public class Main {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String result = isPrime(scanner.nextInt()) ? "Prime" : "Not prime";
            System.out.println(result);
        }
    }
}
