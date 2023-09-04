package p04VectorsAndMatrix;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite numero da linha %d e coluna %d: ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.printf("\nElementos da Diagonal Principal: \n");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", matrix[i][i]);
            sumPrimaryDiagonal += matrix[i][i];
        }

        System.out.printf("\n\nElementos da Diagonal Secundária: \n");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", matrix[i][2-i]);
            sumSecondaryDiagonal += matrix[i][2-i];
        }

        System.out.printf("\n\nSoma dos Elementos da Diagonal Principal: \n%d", sumPrimaryDiagonal);
        System.out.printf("\n\nSoma dos Elementos da Diagonal Secundária: \n%d", sumSecondaryDiagonal);
    }
}
