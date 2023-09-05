package p06DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        String name;
        Stack<String> bookStack = new Stack<>();

        do {
            System.out.printf("\n*****************************");
            System.out.printf("\n1 - Adicionar Livro na Pilha");
            System.out.printf("\n2 - Listar todos os Livros");
            System.out.printf("\n3 - Retirar Livro da Pilha");
            System.out.printf("\n0 - Sair");
            System.out.printf("\n*****************************\n");
            System.out.printf("\nEntre com a opção desejada: ");
            option = input.nextInt();

            switch (option) {
                case 0:
                    System.out.printf("\nPrograma Finalizado!");
                    break;
                case 1:
                    System.out.printf("\nDigite o nome: ");
                    input.skip("\\R");
                    bookStack.push(input.nextLine());
                    System.out.printf("\nPilha: %s", bookStack.toString());
                    System.out.printf("\nLivro Adicionado!");
                    break;
                case 2:
                    System.out.printf("\nLista de Livros na Pilha: \n%s", bookStack.toString());
                    break;
                case 3:
                    if (bookStack.isEmpty()) {
                        System.out.printf("\nA Pilha está vazia!");
                        continue;
                    }
                    bookStack.pop();
                    System.out.printf("\nPilha: %s", bookStack.toString());
                    System.out.printf("\nUm Livro foi retirado da pilha!");
            }
        } while(option != 0);


    }
}
