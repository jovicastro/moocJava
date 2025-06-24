import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        // Cria o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // --- Lendo a String ---
        System.out.println("Give a string:");
        String text = scanner.nextLine();

        // --- Lendo o Inteiro ---
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scanner.nextLine());

        // --- Lendo o Double ---
        System.out.println("Give a double:");
        double floatingPoint = Double.valueOf(scanner.nextLine());

        // --- Lendo o Boolean ---
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());

        // --- Imprimindo todas as respostas ---
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + floatingPoint);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}