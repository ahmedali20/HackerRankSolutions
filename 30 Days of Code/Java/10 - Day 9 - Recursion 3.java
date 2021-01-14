
import java.io.IOException;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int factorial(int n) {
       int fac=n;
        for (int i =n-1;i>0;i--){
            fac*=i;
        }
        return fac;
    }



    public static void main(String[] args) throws IOException {


        int x=factorial(scanner.nextInt());
        System.out.println(x);

    }
}
