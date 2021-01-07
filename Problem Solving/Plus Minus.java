
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");
        int n = scanner.nextInt();
        int a[] = new int[n];
        double b = 0;
        double c = 0;
        double d = 0;
        if (n > 0 && n <= 100) {
            for (int i = 0; i < a.length; i++) {
                int m = scanner.nextInt();
                if (m >= -100 && m <= 100)
                    a[i] = m;
                if (m > 0)
                    b++;
                else if (m < 0)
                    c++;
                else d++;
            }
        }
        System.out.println(decimalFormat.format(b / n));
        System.out.println(decimalFormat.format(c / n));
        System.out.println(decimalFormat.format(d / n));
    }
}
