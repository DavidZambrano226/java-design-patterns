package state.states.impl;

import state.Account;
import state.states.AccountState;

public class RedAccountState extends AccountState {
    private double serviceFee;

    public RedAccountState(AccountState accountState)
    {
        this.balance = accountState.getBalance();
        this.account = accountState.getAccount();
        Initialize();
    }

    private void Initialize()
    {
        // Should come from a datasource
        interest = 0.0;
        lowerLimit = -100.0;
        upperLimit = 0.0;
        serviceFee = 15.00;
    }


    @Override
    public void Deposit(double amount) {
        balance += amount;
        StateChangeCheck();
    }

    @Override
    public void Withdraw(double amount) {
        amount = amount - serviceFee;
        System.out.println("No funds available for withdrawal!" + amount);
    }

    @Override
    public void PayInterest() {
        // No interest is paid
    }

    private void StateChangeCheck() {
        if (balance > upperLimit)
        {
            // this.account.setAccountState(new SilverAccountState(0,this));
        }
    }
}
