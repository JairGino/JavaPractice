package p09BankAccountProject;

import p09BankAccountProject.account.controller.AccountController;
import p09BankAccountProject.account.model.CheckingAccount;
import p09BankAccountProject.account.model.SavingsAccount;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        AccountController accounts = new AccountController();
        Scanner input = new Scanner(System.in);

        int totalSpaces = 90;
        int initialSpaces = 9;

        String bankName = "BANCO DO PROJETO";
        String bankNameFormat = "%" + (totalSpaces - bankName.length()) / 2 + "s%s%" + (totalSpaces - bankName.length()) / 2 + "s\n";

        String[] options = {
            "1 - Criar Conta",
            "2 - Listar todas as Contas",
            "3 - Buscar Conta por Numero",
            "4 - Atualizar Dados da Conta",
            "5 - Apagar Conta",
            "6 - Sacar",
            "7 - Depositar",
            "8 - Transferir valores entre Contas",
            "9 - Sair"
        };
        String format;

        int chosenOption;
        int agency, type, number;
        float balance, value;
        String holder;



        while (true) {
            System.out.printf("%s\n", "*".repeat(totalSpaces));
            System.out.printf(bankNameFormat, "", bankName, "");
            System.out.printf("%s\n", "*".repeat(totalSpaces));

            format = "%" + initialSpaces + "s%s\n";
            for (String sentence : options) {
                System.out.printf(format, "", sentence);
            }
            System.out.printf("%s\n", "*".repeat(totalSpaces));


            System.out.printf("Entre com a opção desejada: ");

            try {
                chosenOption = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                input.nextLine();
                chosenOption = 0;
            }

            if (chosenOption == 9) {
                System.out.printf("\n%s - O seu futuro está aqui!", bankName);
                input.close();
                System.exit(0);
            }

            switch (chosenOption) {
                case 1:
                    System.out.printf("\nCriar Conta");

                    System.out.printf("\nDigite o Numero da Agência: ");
                    agency = input.nextInt();
                    System.out.printf("\nDigite o nome do Titular: ");
                    input.skip("\\R?");
                    holder = input.nextLine();

                    do {
                        System.out.printf("\nDigite o Tipo da conta (1-CC ou 2-CP): ");
                        type = input.nextInt();
                    } while (type < 1 || type > 2);

                    System.out.printf("\nDigite o Saldo da Conta(R$): ");
                    balance = input.nextFloat();

                    switch(type) {
                        case 1 -> {
                            System.out.printf("\nDigite o Limite de Crédito (R$): ");
                            float limit = input.nextFloat();
                            accounts.register(new CheckingAccount(accounts.generateNumber(), agency, type, holder, balance, limit));
                        }
                        case 2 -> {
                            System.out.printf("\nDigite o dia do Aniversario da Conta: ");
                            int anniversary = input.nextInt();
                            accounts.register(new SavingsAccount(accounts.generateNumber(), agency, type, holder, balance, anniversary));
                        }
                    }
                    keyPress();
                    break;
                case 2:
                    System.out.printf("\nListar todas as Contas");
                    accounts.listAll();
                    keyPress();
                    break;
                case 3:
                    System.out.printf("\nConsultar dados da Conta - por número");
                    System.out.printf("\nDigite o número da conta: ");
                    number = input.nextInt();
                    accounts.findByNumber(number);
                    keyPress();
                    break;
                case 4:
                    System.out.println("Atualizar dados da Conta\n\n");
                    System.out.println("Digite o número da conta: ");
                    number = input.nextInt();

                    if (accounts.findInCollection(number) == null) break;

                    System.out.printf("\nDigite o Numero da Agência: ");
                    agency = input.nextInt();
                    System.out.printf("\nDigite o nome do Titular: ");
                    input.skip("\\R?");
                    holder = input.nextLine();

                    type = accounts.returnType(number);

                    System.out.printf("\nDigite o Saldo da Conta(R$): ");
                    balance = input.nextFloat();

                    switch(type) {
                        case 1 -> {
                            System.out.printf("\nDigite o Limite de Crédito (R$): ");
                            float limit = input.nextFloat();
                            accounts.update(new CheckingAccount(number, agency, type, holder, balance, limit));
                        }
                        case 2 -> {
                            System.out.printf("\nDigite o dia do Aniversario da Conta: ");
                            int anniversary = input.nextInt();
                            accounts.update(new SavingsAccount(number, agency, type, holder, balance, anniversary));
                        }
                        default -> {
                            System.out.printf("\nTipo de conta inválido!");
                        }
                    }
                    keyPress();
                    break;
                case 5:
                    System.out.println("Apagar a Conta\n\n");
                    System.out.println("Digite o número da conta: ");
                    number = input.nextInt();
                    accounts.delete(number);
                    keyPress();
                    break;
                case 6:
                    System.out.println("Saque\n\n");
                    System.out.println("Digite o número da conta: ");
                    number = input.nextInt();
                    do {
                        System.out.println("Digite o valor do Saque (R$): ");
                        value = input.nextFloat();
                    } while(value <= 0);

                    accounts.withdraw(number, value);

                    keyPress();
                    break;
                case 7:
                    System.out.println("Depósito\n\n");
                    System.out.println("Digite o número da conta: ");
                    number = input.nextInt();
                    do {
                        System.out.println("Digite o valor do Depósito (R$): ");
                        value = input.nextFloat();
                    } while(value <= 0);

                    accounts.deposit(number, value);

                    keyPress();
                    break;
                case 8:
                    System.out.println("Transferência entre Contas\n\n");
                    System.out.println("Digite o número da conta de origem: ");
                    int originNumber = input.nextInt();
                    System.out.println("Digite o número da conta de destino: ");
                    int destinationNumber = input.nextInt();
                    do {
                        System.out.println("Digite o valor do Depósito (R$): ");
                        value = input.nextFloat();
                    } while(value <= 0);
                    accounts.transfer(originNumber, destinationNumber, value);

                    keyPress();
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }

        }
    }

    public static void keyPress() {
        try {
            System.out.println("\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }
    }
}
