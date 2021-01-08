import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;
        int max = a[0];
        if (n <= Math.pow(10, 5)) {
            for (int i = 0; i < a.length; i++) {
                int x = scanner.nextInt();
                if (x >= 1 && x <= Math.pow(10, 7))
                    a[i] = x;
                if (a[i] > max)
                    max = a[i];
            }
            for (int i = 0; i < a.length; i++) {
                if (max == a[i]) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
