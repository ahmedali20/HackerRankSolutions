import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        if (n% 2 == 1)
            System.out.println("Weird");
        else if (n% 2 == 0 && n > 1 && n<6)
            System.out.println("Not Weird");
        else if (n% 2 == 0 && n > 5 && n<21)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");

    }
}
