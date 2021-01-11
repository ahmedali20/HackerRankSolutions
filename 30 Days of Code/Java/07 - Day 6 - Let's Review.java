import java.io.IOException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String y = "";
        String z = "";
        scanner.nextLine();
        for (int i = 0; i < x; i++) {
            String s = scanner.nextLine();
            char[] c = s.toCharArray();
            for (int j = 0; j < c.length; j++) {
                char cc = c[j];
                if (j % 2 == 0) {
                    y += cc;
                } else
                    z += cc;
            }
            System.out.print(y);
            System.out.print(" ");
            System.out.println(z);
            y="";
            z="";
        }
    }
}
