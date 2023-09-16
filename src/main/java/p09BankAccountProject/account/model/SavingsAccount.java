package p09BankAccountProject.account.model;

import p09BankAccountProject.account.model.Account;

public class SavingsAccount extends Account {
    private int anniversary;

    public SavingsAccount(int number, int agency, int type, String holder, float balance, int anniversary) {
        super(number, agency, type, holder, balance);
        this.anniversary = anniversary;
    }

    @Override
    public void view() {
        super.view();
        System.out.printf("\nAniversário da conta: %d", this.anniversary);
    }

    public int getBirthday() {
        return anniversary;
    }

    public void setBirthday(int anniversary) {
        this.anniversary = anniversary;
    }
}
