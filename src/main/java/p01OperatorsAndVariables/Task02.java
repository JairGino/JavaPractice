package p01OperatorsAndVariables;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;

        for (int i = 0; i < 4; i++) {
            System.out.printf("\nNota %d: ", i + 1);
            sum += input.nextDouble();
        }

        System.out.printf("\nMédia final: %.1f\n", (sum / 4));
    }
}
