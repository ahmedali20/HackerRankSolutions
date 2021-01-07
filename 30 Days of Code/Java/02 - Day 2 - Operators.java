import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();

        double tip=(double)tip_percent/100*meal_cost;
        double tax=(double)tax_percent/100*meal_cost;
        double totalcost=Math.rint(meal_cost+tip+tax);
        int total= (int) Math.rint(totalcost);

        System.out.println(total);


    }
}
