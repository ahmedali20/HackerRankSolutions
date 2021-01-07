
import java.io.IOException;
import java.util.Scanner;


public class Solution {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
       int sum =0;
        for (int i= 0;i<ar.length;i++){
            ar[i]=scanner.nextInt();
            sum+=ar[i];
        }
        return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int arCount = scanner.nextInt();

        int[] ar = new int[arCount];

        int result = simpleArraySum(ar);
        System.out.print(result);

    }
}
