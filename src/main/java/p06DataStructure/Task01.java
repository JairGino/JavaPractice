package p06DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        String name;
        Queue<String> clientsQueue = new LinkedList<>();

        do {
            System.out.printf("\n*****************************");
            System.out.printf("\n1 - Adicionar Cliente na Fila");
            System.out.printf("\n2 - Listar todos os Clientes");
            System.out.printf("\n3 - Retirar Cliente da Fila");
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
                    clientsQueue.add(input.nextLine());
                    System.out.printf("\nFila: %s", clientsQueue.toString());
                    System.out.printf("\nCliente Adicionado!");
                    break;
                case 2:
                    System.out.printf("\nLista de Clientes na Fila: \n%s", clientsQueue.toString());
                    break;
                case 3:
                    if (clientsQueue.isEmpty()) {
                        System.out.printf("\nA Fila está vazia!");
                        continue;
                    }
                    clientsQueue.remove();
                    System.out.printf("\nFila: %s", clientsQueue.toString());
                    System.out.printf("\nO Cliente foi Chamado!");
                    break;
            }
        } while(option != 0);


    }
}
