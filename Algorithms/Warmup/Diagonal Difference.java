import java.math.*;
import java.io.IOException;
import java.util.Scanner;


public class Solution {
   public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[][] = new int[n][n];

        int d1 = 0;
        int d2 = 0;

        for (int i=0;i<n;i++){
            for (int j =0;j<n;j++){
                int m =scanner.nextInt();
                if (m >= -100 & m<= 100){
                a[i][j]=m;}
                if (i == j)
                    d1+=m;
            }
        }
        int x=n-1;
        for (int i =0;i<n;i++){
            for (int j=n-1;j>=0;j--){
                if (x == j)
                    d2+=a[i][j];
            }
            x--;
        }
        System.out.println(Math.abs(d1-d2));
    }
}
