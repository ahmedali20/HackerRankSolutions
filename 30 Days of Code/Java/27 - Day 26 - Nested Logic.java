
import java.io.IOException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int fine = 0;

        if (y1 != y2) {
            fine = 10000;
            if (y2>y1) {
                fine = 0;
            }
        } else if (m1 != m2) {
            fine = 500 * (m1 - m2);
            if (fine < 0) {
                fine = 0;
            }
        } else {
            fine = 15 * (d1 - d2);
            if (fine < 0) {
                fine = 0;
            }
        }
        System.out.println(fine);
    }
}
