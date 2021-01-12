
import java.io.IOException;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static int[] reverse(int[] a) {
        int[] result = new int[a.length];
        int j = 0;
        for (int s = 0; s < a.length; s++) {
            a[s] = scanner.nextInt();
        }
        for (int i = a.length - 1; i >= 0; i--) {
            result[j] = a[i];
            j++;
        }

        return result;
    }


    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = reverse(A);
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
