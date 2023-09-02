package p02ConditionalOperator;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int productCode, amount;
        String product;
        float price;

        System.out.printf("\nCódigo do Produto: ");
        productCode = input.nextInt();
        System.out.printf("\nQuantidade: ");
        amount = input.nextInt();

        switch (productCode) {
            case 1:
                product = "Cachorro Quente";
                price = 10f;
                break;
            case 2:
                product = "X-Salada";
                price = 15f;
                break;
            case 3:
                product = "X-Bacon";
                price = 18f;
                break;
            case 4:
                product = "Bauru";
                price = 12f;
                break;
            case 5:
                product = "Refrigerante";
                price = 8f;
                break;
            case 6:
                product = "Suco de laranja";
                price = 13f;
                break;
            default:
                product = "Nao identificado";
                price = 0f;
        }

        System.out.printf("\nProduto: %s\n", product);
        System.out.printf("\nValor total: R$ %.2f\n", price * (float) amount);
    }
}
