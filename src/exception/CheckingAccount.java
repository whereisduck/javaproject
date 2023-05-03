package exception;

public class CheckingAccount {
    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }
    public void deposit (double amount){
        balance += amount;
    }
    public void withdraw(double amount) throws InsuffictionFundException {
        if(amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsuffictionFundException(needs);
        }

    }

    public int getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }


}
