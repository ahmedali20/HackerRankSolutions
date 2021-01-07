
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        long n[] = new long[5];
        long sum1 = 0;
        long sum2 = 0;
        long sum3 = 0;
        long sum4 = 0;
        long sum5 = 0;
        for (int i = 0; i < n.length; i++) {
            int x = scanner.nextInt();
            if (x >= 1 && x <= Math.pow(10, 9))
                n[i] = x;
        }
        for (int j = 0; j < n.length; j++) {
            if (j == 0)
                sum1 = n[1] + n[2] + n[3] + n[4];
            else if (j == 1)
                sum2 = n[0] + n[2] + n[3] + n[4];
            else if (j == 2)
                sum3 = n[1] + n[0] + n[3] + n[4];
            else if (j == 3)
                sum4 = n[1] + n[2] + n[0] + n[4];
            else
                sum5 = n[1] + n[2] + n[3] + n[0];
        }
        long max = sum1;
        long min = sum1;
        if (sum2 > max)
            max = sum2;
        if (sum3 > max)
            max = sum3;
        if (sum4 > max)
            max = sum4;
        if (sum5 > max)
            max = sum5;

        if (sum2 < min)
            min = sum2;
        if (sum3 < min)
            min = sum3;
        if (sum4 < min)
            min = sum4;
        if (sum5 < min)
            min = sum5;
        System.out.print(min + " ");
        System.out.print(max);
    }
}
