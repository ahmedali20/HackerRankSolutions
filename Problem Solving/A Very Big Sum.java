import java.math.*;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long b[] = new long[a];

        long sum = 0;
            for (int i = 0; i < a; i++) {
                long x = scanner.nextLong();
                if (x >= 0 && x <= Math.pow(10, 10)) {
                    b[i] = x;
                    sum += x;
                }
            }
            System.out.println(sum);
    }
}
