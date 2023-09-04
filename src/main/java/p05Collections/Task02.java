package p05Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> integerList = Arrays.asList(2,5,1,3,4,9,7,8,10,6);

        System.out.printf("\nDigite o número que você deseja encontrar: ");
        Integer num = input.nextInt();
        Integer index = integerList.indexOf(num);

        if (index != -1) {
            System.out.printf("\nO número %d está localizado na posição: %d", num, index);
        } else {
            System.out.printf("\nO número %d não foi encontrado!", num);

        }

    }
}
