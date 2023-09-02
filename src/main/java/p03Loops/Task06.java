package p03Loops;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, multiplesOf3Counter = 0;
        int sumNumbersMultplesOf3 = 0;

        do {
            System.out.printf("\nDigite um número: ");
            num = input.nextInt();

            if (num % 3 == 0 && num != 0) {
                multiplesOf3Counter++;
                sumNumbersMultplesOf3 += num;
            }
        } while (num != 0);

        System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f", ((float) sumNumbersMultplesOf3 / (float) multiplesOf3Counter));
    }
}

