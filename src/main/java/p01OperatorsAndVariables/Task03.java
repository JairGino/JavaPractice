package p01OperatorsAndVariables;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        String[] questions = {"Sálario Bruto", "Adicional Noturno", "Horas Extras", "Descontos"};
        double sum = 0;

        for (int i = 0; i < 4; i++) {
            System.out.printf("\n%s: ", questions[i]);
            sum += input.nextDouble();
        }

        System.out.printf("\nSalário Líquido: %.2f\n", sum);
    }
}
