import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] x = new int[m];
        int[] y = new int[n];
        int d1 = 0;
        int d2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        double z = Math.pow(10, 5);

        if (s >= 1 && t >= 1 && a >= 1 && b >= 1 && m >= 1 && n >= 1 && s <= z && t <= z && a <= z && b <= z && m <= z && n <= z) {
            if (a < s && s < t && t < b) {
                for (int i = 0; i < m; i++) {
                    d1 = scanner.nextInt();
                    if (d1 >= -z && d1 <= z)
                        x[i] = d1 + a;
                    if (x[i] >= s && x[i] <= t)
                        sum1++;
                }

                for (int j = 0; j < n; j++) {
                    d1 = scanner.nextInt();
                    if (d2 >= -z && d2 <= z)
                        y[j] = d1 + b;
                    if (y[j] >= s && y[j] <= t)
                        sum2++;
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
