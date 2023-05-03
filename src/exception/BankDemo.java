package exception;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Deposit $500..");
        c.deposit(500.00);
        try {
            System.out.println("\nWithDrawing $100");
            c.withdraw(100.00);
            System.out.println("\nWithDrawing $600");
            c.withdraw(600.00);
        } catch (InsuffictionFundException e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        }

    }
}
