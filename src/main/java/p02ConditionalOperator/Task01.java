package p02ConditionalOperator;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] letters = {'A', 'B', 'C'};
        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("\nDigite o número %c: ", letters[i]);
            num[i] = input.nextInt();
        }

        int sum = num[0] + num[1];
        char numComparator;
        String comparator;

        if (sum > num[2]) {
            numComparator = '>';
            comparator = "Maior do que";
        } else if (sum < num[2]) {
            numComparator = '<';
            comparator = "Menor do que";
        } else {
            numComparator = '=';
            comparator = "Igual a";
        }
        System.out.printf("\n%d + %d = %d %c %d", num[0], num[1], sum, numComparator, num[2]);
        System.out.printf("\nA soma de A + B é %s C", comparator);
    }
}
