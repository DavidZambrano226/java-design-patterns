package state.states.impl;

import state.Account;
import state.states.AccountState;

public class SilverAccountState extends AccountState {

    public SilverAccountState(double balance, Account accountState) {
        this.balance = balance;
        this.account = accountState;
        initialize();
    }

    private void initialize() {
        // Should come from a datasource
        interest = 0.0;
        lowerLimit = 0.0;
        upperLimit = 1000.0;
    }

    @Override
    public void Deposit(double amount) {
        balance += amount;
        StateChangeCheck();
    }

    @Override
    public void Withdraw(double amount) {
        balance -= amount;
        StateChangeCheck();
    }

    @Override
    public void PayInterest() {
        balance += interest * balance;
        StateChangeCheck();
    }

    private void StateChangeCheck() {
        if (balance < lowerLimit) {
            this.account.setAccountState(new RedAccountState(this));
        }
        /* else if (balance > upperLimit)
        {
            account.State = new GoldState(this);
        }*/
    }
}
