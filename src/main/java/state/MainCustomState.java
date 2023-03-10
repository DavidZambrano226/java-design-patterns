package state;

public class MainCustomState {
    public static void main(String[] args) {
        /* RealContext realContext = new RealContext();
        try {
            realContext.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        Account account = new Account("Jey");
        account.Deposit(200);
    }
}
