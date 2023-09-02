package p03Loops;
// Requisito do exercício: resolver com While
// Este problema deveria ser resolvido com Do While!

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        int totalUnder21YearsOld = 0;
        int totalOver50YearsOld = 0;

        System.out.printf("\nDigite uma idade: ");
        age = input.nextInt();

        while (age > 0) {
            if (age < 21) totalUnder21YearsOld++;
            if (age > 50) totalOver50YearsOld++;

            System.out.printf("\nDigite uma idade: ");
            age = input.nextInt();
        }

        System.out.printf("\nTotal de pessoas menores de 21 anos: %d", totalUnder21YearsOld);
        System.out.printf("\nTotal de pessoas maiores de 50 anos: %d\n", totalOver50YearsOld);

    }
}
