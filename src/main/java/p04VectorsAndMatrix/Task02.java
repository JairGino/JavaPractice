package p04VectorsAndMatrix;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int[] oddNums = new int[10];
        int oddIndex = 0;
        int[] evenNums = new int [10];
        int evenIndex = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número a ser adicionado no vetor: ");
            num = input.nextInt();
            if (num % 2 == 0) evenNums[evenIndex++] = num;
            if (i % 2 == 1) oddNums[oddIndex++] = num;
            sum += num;
        }

        System.out.printf("\nElementos nos índices ímpares: \n");
        for (int i = 0; i < oddIndex; i++)
            System.out.printf("%d ", oddNums[i]);
        System.out.printf("\n\nElementos pares: \n");
        for (int i = 0; i < evenIndex; i++)
            System.out.printf("%d ", evenNums[i]);
        System.out.printf("\n\nSoma: %d", sum);
        System.out.printf("\n\nMédia: %.2f", (float)sum/10);
    }
}
