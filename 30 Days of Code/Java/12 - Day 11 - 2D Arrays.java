import java.io.IOException;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];
        int[][] array = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int x = scanner.nextInt();
                arr[i][j] = x;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

            }
        }

        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max)
                    max = array[i][j];

            }
        }
        System.out.println(max);
    }
}
