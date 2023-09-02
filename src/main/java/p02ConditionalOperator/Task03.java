package p02ConditionalOperator;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("\nDigite o Nome do doador: ");
        String name = input.nextLine();
        System.out.printf("\nDigite a Idade do doador: ");
        int age = input.nextInt();
        System.out.printf("\nPrimeira doação de sangue? ");
        boolean firstDonation = input.nextBoolean();

        String donateStatus = (age >= 18 && age <= 60 || age >= 60 && !firstDonation) ? "está apto(a)" : "não está apto";
        System.out.printf("\n%s %s para doar sangue!\n", name, donateStatus);
    }
}
