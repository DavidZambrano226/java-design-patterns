package chainofresponsibility.handlers;

import chainofresponsibility.Handler;

public class PresidentHandler extends Handler {
    @Override
    public void processInvoice(int amount) {
        if (amount >= 500) {
            System.out.println("Process invoice from "+ ANSI_RED + "*** President class ***" + ANSI_RESET + "the amount was " + amount);
        } else {
            super.nextHandler.processInvoice(amount);
        }
    }
}
