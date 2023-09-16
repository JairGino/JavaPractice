package p09BankAccountProject.account.model;

import p09BankAccountProject.account.model.Account;

public class CheckingAccount extends Account {
    private float limit;

    public CheckingAccount(int number, int agency, int type, String holder, float balance, float limit) {
        super(number, agency, type, holder, balance);
        this.limit = limit;
    }

    @Override
    public boolean withdraw(float value) {
        if (this.getBalance() + this.getLimit() < value) {
            System.out.println("\n Saldo Insuficiente!");
            return false;
        }

        this.setBalance(this.getBalance() - value);
        return true;
    }

    @Override
    public void view() {
        super.view();
        System.out.printf("\nLimite de Crédito: %.2f", this.limit);
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }
}
