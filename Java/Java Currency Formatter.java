
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double d = scanner.nextDouble();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(d);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(d);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(d);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(d);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);


    }
}
