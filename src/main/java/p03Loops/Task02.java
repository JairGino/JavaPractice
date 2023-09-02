package p03Loops;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, totalEven = 0, totalOdd = 0;

        for (int i = 1; i < 11; i++) {
            System.out.printf("\nDigite o %dº número: ", i);
            num = input.nextInt();
            if (num % 2 == 0) totalEven++;
            else totalOdd++;
        }

        System.out.printf("\nTotal de números pares: %d", totalEven);
        System.out.printf("\nTotal de números ímpares: %d\n", totalOdd);
    }
}
