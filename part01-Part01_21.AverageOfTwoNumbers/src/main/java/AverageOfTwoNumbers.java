
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int fn = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int sn = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (Double.valueOf(fn + sn) / 2));
    }
}
