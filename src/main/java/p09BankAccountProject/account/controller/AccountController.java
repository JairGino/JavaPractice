package p09BankAccountProject.account.controller;

import p09BankAccountProject.account.model.Account;
import p09BankAccountProject.account.repository.AccountRepository;

import java.util.ArrayList;

public class AccountController implements AccountRepository {

    private ArrayList<Account> accountList = new ArrayList<Account>();
    int number = 0;

    @Override
    public void findByNumber(int number) {
        var account = findInCollection(number);

        if (account != null) {
            account.view();
        } else {
            System.out.printf("\nA Conta número: %d não foi encontrada!", number);
        }
    }

    @Override
    public void listAll() {
        for (var account : accountList) {
            account.view();
        }
    }

    @Override
    public void register(Account account) {
        accountList.add(account);
        System.out.printf("\nA Conta número: %d foi criada com sucesso", account.getNumber());
    }

    @Override
    public void update(Account account) {
        var foundAccount = findInCollection(account.getNumber());

        if (foundAccount != null) {
            accountList.set(accountList.indexOf(foundAccount), account);
            System.out.printf("\nA Conta numero: %d foi atualizada com sucesso!", account.getNumber());
        } else {
            System.out.printf("\nA Conta numero: %d não foi encontrada!", account.getNumber());
        }
    }

    @Override
    public void delete(int number) {
        var account = findInCollection(number);

        if (account != null) {
            if (accountList.remove(account) == true)
                System.out.printf("\nA Conta numero: %d foi deletada com sucesso!", number);
        } else {
            System.out.printf("\nA Conta numero: %d n'ao foi encontrada!", number);
        }
    }

    @Override
    public void withdraw(int number, float value) {
        var account = findInCollection(number);

        if (account == null) {
            System.out.printf("\nA Conta numero: %d não foi encontrada!", number);
            return;
        }

        if (account.withdraw(value) == true)
            System.out.printf("\nO Saque na Cota numero: %d foi efetuado com sucesso!", number);
    }

    @Override
    public void deposit(int number, float value) {
        var account = findInCollection(number);

        if (account == null) {
            System.out.printf("\nA Conta numero: %d não foi encontrada!", number);
            return;
        }

        account.deposit(value);
        System.out.printf("\nO Depósito na Conta numero %d foi efetuado com sucesso!", number);
    }

    @Override
    public void transfer(int originNumber, int destinationNumber, float value) {
        var originAccount = findInCollection(originNumber);
        var destinationAccount = findInCollection(destinationNumber);

        if (originAccount == null || destinationAccount == null) {
            System.out.printf("\nA Conta de Origem e/ou Destino não foram encontradas!");
            return;
        }
        if (originAccount.withdraw(value) == true) {
            destinationAccount.deposit(value);
            System.out.printf("\nA Transferência foi efetuada com sucesso!");
        }
    }

    public int generateNumber() {
        return ++number;
    }

    public Account findInCollection(int number) {
        for (var account : accountList) {
            if (account.getNumber() == number) {
                return account;
            }
        }
        return null;
    }

    public int returnType(int number) {
        for (var account : accountList) {
            if (account.getNumber() == number) {
                return account.getType();
            }
        }
        return 0;
    }
}
