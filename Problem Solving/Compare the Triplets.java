
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = new int[2];
        int d = 0;
        int e = 0;
        for (int j = 0; j < a.length; j++) {
            int x = scanner.nextInt();
            if (x >= 1 && x <= 100) {
                a[j] = x;
            }
        }
        for (int j = 0; j < b.length; j++) {
            int x = scanner.nextInt();
            if (x >= 1 && x <= 100) {
                b[j] = x;
            }


        }

        for (int j = 0; j < 3; j++) {
            if (a[j] > b[j])
                d++;
            else if (a[j] < b[j])
                e++;
        }

        for (int i = 0; i < c.length; i++) {

            if (i == 0)
                c[i] = d;
            else c[i] = e;
        }
        System.out.println(c[0] + " " + c[1]);
    }
}
