
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n= scanner.nextInt();
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        for (int i=0;i<n;i++){
            a.put(scanner.next(),scanner.nextInt());
        }
        
        
        while (scanner.hasNext()){
            String aa=scanner.next();
            if (a.containsKey(aa))
            System.out.println(aa+"="+a.get(aa));
            else
                System.out.println("Not found");
        }
    }
}
