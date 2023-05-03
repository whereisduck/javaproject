package exception;
import java.io.*;
public class InsuffictionFundException extends Exception{
    private double amount;
    public InsuffictionFundException(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}

