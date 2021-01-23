import java.util.*;
import java.io.*;

class Calculator {
    public int power(int n, int p) {
        int result = 1;
        for (int i = 1; i <= p; i++) {
            result = result * n;
        }
        if (0 > n || 0 > p)
            throw new IllegalArgumentException("n and p should be non-negative");
            
        return result;
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
