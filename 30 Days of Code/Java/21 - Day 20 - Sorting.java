import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int numberOfSwaps = 0;
        int temp = 0;
        for (int b = 0; b < a.length; b++) {
            a[b] = scanner.nextInt();
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < n - i; j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    numberOfSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);

    }

}


