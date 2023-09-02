package p03Loops;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String proceed = "S";
        int age, gender, category;

        int totalBackend = 0;
        int totalWomanFront = 0;
        int totalMenMobileOver40 = 0;
        int totalWomanFullStackUnder30 = 0;

        while (proceed.equals("S")) {
            System.out.printf("\nDigite a Idade: ");
            age = input.nextInt();
            System.out.printf("\nDigite o Sexo: ");
            gender = input.nextInt();
            System.out.printf("\nDigite a Categoria: ");
            category = input.nextInt();

            if (category == 1) totalBackend++;
            if (gender == 2 && category == 2) totalWomanFront++;
            if (gender == 1 && category == 3 && age > 40)
                totalMenMobileOver40++;
            if (gender == 2 && category == 4 && age < 30)
                totalWomanFullStackUnder30++;

            System.out.printf("\nDeseja continuar(S/N): ");
            input.skip("\\R?");
            proceed = input.nextLine().toUpperCase();
        }

        System.out.printf("\nTotal de pessoas desenvolvedoras Backend: %d", totalBackend);
        System.out.printf("\nTotal de mulheres desenvolvedoras Frontend: %d", totalWomanFront);
        System.out.printf("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: %d", totalMenMobileOver40);
        System.out.printf("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: %d\n", totalWomanFullStackUnder30);
    }
}
