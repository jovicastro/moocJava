
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        // Inicializa o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede o primeiro número ao usuário
        System.out.println("Give the first number:");
        // Lê a linha como texto e a converte para um número inteiro
        int firstNumber = Integer.valueOf(scanner.nextLine());

        // Pede o segundo número ao usuário
        System.out.println("Give the second number:");
        // Lê a linha como texto e a converte para um número inteiro
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // Calcula a soma dos dois números
        int sum = firstNumber + secondNumber;

        // Imprime o resultado final no formato "n1 + n2 = soma"
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
    }
}
