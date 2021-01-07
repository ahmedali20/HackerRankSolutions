
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] grade = new int[n];
            for (int i = 0; i < grade.length; i++) {
                grade[i] = scanner.nextInt();
                    if (grade[i] < 38) {
                        System.out.println(grade[i]);
                    } else if (grade[i] % 5 < 3) {
                        System.out.println(grade[i]);
                    } else {
                        grade[i] = grade[i] + (5 - grade[i] % 5);
                        System.out.println(grade[i]);
                    }
                }
            }
        }

