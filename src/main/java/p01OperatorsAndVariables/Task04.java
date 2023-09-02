package p01OperatorsAndVariables;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] values = new float[4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("\nnumero%d: ", i + 1);
            values[i] = input.nextFloat();
        }

        System.out.printf("\nDiferença: %.1f\n", (values[0] * values[1]) - (values[2] * values[3]));
    }
}
