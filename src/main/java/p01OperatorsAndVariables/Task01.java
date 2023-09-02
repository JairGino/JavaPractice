package p01OperatorsAndVariables;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("\nDigite o Salário: ");
        float wage = input.nextFloat();

        System.out.printf("\nDigite o abono: ");
        float allowance = input.nextFloat();

        input.close();
        System.out.printf("\nNovo Salário: %.2f\n", (wage + allowance));

    }
}

