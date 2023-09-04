package p04VectorsAndMatrix;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vector = {2,5,1,3,4,9,7,8,10,6};
        int num, index = -1;

        System.out.printf("\nDigite o número que você deseja encontra: ");
        num = input.nextInt();

        for (int i = 0; i < 10; i++) {
            if(vector[i] == num) index = i;
        }

        if (index != -1) {
            System.out.printf("\nO número %d está localizado na posição: %d", num, index);
        } else {
            System.out.printf("\nO número %d não foi encontrado!", num);
        }
    }
}
