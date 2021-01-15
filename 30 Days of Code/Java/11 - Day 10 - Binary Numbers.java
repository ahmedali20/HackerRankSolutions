import java.io.IOException;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        int binary[] = new int[100];
        int index = 0;
        int c = 0;
        int max=0;
        while (n > 0) {
            binary[index++] = n % 2;
            n = n / 2;
        }


        for (int i = 0; i < index; i++) {
            if (binary[i] == 1) {
                if (i != 0) {
                    if (binary[i - 1] == 0) {
                        c = 0;
                    }
                }

                if (i == 0) {
                    if (binary[i + 1] == 1) {
                        c++;
                    }
                } else if (binary[i + 1] == 1 || binary[i - 1] == 1) {
                    c++;
                } else c = 1;
            }
            if (c>max)
                max=c;
        }
        System.out.println(max);
    }
}
