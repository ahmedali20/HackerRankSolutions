import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if (((k - 1) | k) <= n) {
                System.out.println(k - 1);
            } else {
                System.out.println(k - 2);
            }

        }
    }
}
