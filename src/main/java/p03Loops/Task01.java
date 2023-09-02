package p03Loops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.printf("\nDigite o primeiro número do intervalo: ");
        num1 = input.nextInt();
        System.out.printf("\nDigite o último número do intervalo: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("\nIntervalo inválido!");
            return;
        }

        System.out.printf("\nNo intervalo entre %d e %d: ", num1, num2);
        for (int i = num1; i <= num2; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.printf("\n%d é múltiplo de 3 e 5", i);
            }
        }

    }
}
