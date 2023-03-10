import chainofresponsibility.Handler;
import chainofresponsibility.handlers.DirectorHandler;
import chainofresponsibility.handlers.EmployeeHandler;
import chainofresponsibility.handlers.PresidentHandler;

import java.util.Scanner;

public class ApplicationChainOfResponsibility {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String menuOptions = "Add the amount to process or press zero (0) to end the execution";
        int selectOption;

        Handler employee = new EmployeeHandler();
        Handler director = new DirectorHandler();
        Handler president = new PresidentHandler();

        employee.setNextHandler(director);
        director.setNextHandler(president);

        do {
            System.out.println(menuOptions);
            selectOption = sc.nextInt();
            if (selectOption == 0) {
                System.out.println(ANSI_YELLOW + "Thanks for use the invoice system" + ANSI_RESET);
            } else {
                employee.processInvoice(selectOption);
            }

        } while (selectOption != 0);


    }

}
