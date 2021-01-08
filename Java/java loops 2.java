
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int[] c = new int[n];
            for (int j = 0; j < c.length; j++) {
                c[j]= (int) (a+Math.pow(2,0)*b);//0+1*2;
                for (int x=1;x<= j;x++){
                    c[j]+=Math.pow(2,x)*b;
                }
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }

    }
}
