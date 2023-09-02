package p02ConditionalOperator;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String role;
        float percentageAdjustment;

        System.out.printf("\nNome do colaborador: ");
        String name = input.nextLine();
        System.out.printf("\nCargo: ");
        int roleCode = input.nextInt();
        System.out.printf("\nSalário: R$ ");
        float wage = input.nextFloat();

        switch (roleCode) {
            case 1:
                role = "Gerente";
                percentageAdjustment = 0.1f;
                break;
            case 2:
                role = "Vendedor";
                percentageAdjustment = 0.07f;
                break;
            case 3:
                role = "Supervisor";
                percentageAdjustment = 0.09f;
                break;
            case 4:
                role = "Motorista";
                percentageAdjustment = 0.06f;
                break;
            case 5:
                role = "Estoquista";
                percentageAdjustment = 0.05f;
                break;
            case 6:
                role = "Técnico de TI";
                percentageAdjustment = 0.08f;
                break;
            default:
                role = "Cargo não encontrado!";
                percentageAdjustment = 0f;
        }

        System.out.printf("\nNome do colaborador: %s\n", name);
        System.out.printf("\nCargo: %s\n", role);
        System.out.printf("\nSalário: R$ %.2f\n", (1 + percentageAdjustment) * wage);
    }
}
