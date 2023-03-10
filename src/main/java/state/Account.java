package state;

import state.states.AccountState;
import state.states.impl.SilverAccountState;

public class Account {
    private AccountState accountState;
    private String owner;

    public Account(String owner) {
        // New accounts are 'Silver' by default
        this.owner = owner;
        this.accountState = new SilverAccountState(0, this);
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void Deposit(double amount) {
        accountState.Deposit(amount);
        System.out.println("Deposited {0:C} --- " + amount);
        System.out.println(" Balance = {0:C}" + accountState.getBalance());
        System.out.println(" Status  = {0}" + accountState.getClass().getName());
        System.out.println("");
    }

    public void Withdraw(double amount){
        accountState.Withdraw(amount);
        System.out.println("Withdrew {0:C} --- " + amount);
        System.out.println(" Balance = {0:C}" + accountState.getBalance());
        System.out.println(" Status  = {0}\n" + accountState.getClass().getName());
    }

    public void PayInterest() {
        accountState.PayInterest();
        System.out.println("Interest Paid --- ");
        System.out.println(" Balance = {0:C}" + accountState.getBalance());
        System.out.println(" Status  = {0}\n" + accountState.getClass().getName());
    }
}
