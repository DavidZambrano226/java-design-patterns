package chainofresponsibility.handlers;

import chainofresponsibility.Handler;

public class EmployeeHandler extends Handler {
    @Override
    public void processInvoice(int amount) {
        if (amount > 0 && amount <= 200) {
            System.out.println("Process invoice from "+ ANSI_RED + "*** Employee class ***" + ANSI_RESET + "the amount was " + amount);
        } else {
            super.nextHandler.processInvoice(amount);
        }
    }
}
