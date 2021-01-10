import java.io.IOException;
import java.util.Scanner;


public class Main {

    private int age;


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i =1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
