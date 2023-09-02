package p02ConditionalOperator;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = input.nextInt();

        String parity = (num % 2 == 0) ? "par" : "ímpar";
        String signal = (num >= 0) ? "positivo" : "negativo";

        System.out.printf("\nO Número %d é %s e %s!\n", num, parity, signal);

    }
}
