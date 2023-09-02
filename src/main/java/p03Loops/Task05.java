package p03Loops;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, counter = 0;

        do {
            System.out.printf("\nDigite um número: ");
            num = input.nextInt();

            if (num > 0) counter += num;

        } while (num != 0);

        System.out.printf("\nA soma dos números postivos é: %d\n", counter);
    }
}
