import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a % 2 == 1)
            System.out.println("Weird");
        else if (a % 2 == 0 && a > 1 && a < 6)
            System.out.println("Not Weird");
        else if (a % 2 == 0 && a > 5 && a < 21)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
    }
}
