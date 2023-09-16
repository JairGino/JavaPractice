package p09BankAccountProject.account.repository;

import p09BankAccountProject.account.model.Account;

public interface AccountRepository {
    // CRUD da Conta
    public void findByNumber(int numero);
    public void listAll();
    public void register(Account account);
    public void update(Account account);
    public void delete(int number);

    // Métodos Bancários
    public void withdraw(int number, float value);
    public void deposit(int number, float value);
    public void transfer(int originNumber, int destinationNumber, float value);
}
