/**
 * CS152 Section 01, Project #2
 * CheckingAccount implements class Account as a Checking Account
 * @author (Matthew Sullivan) 
 * @version (Feb 27, 2017)
 */

//import java.util.*;

public class CheckingAccount implements Account
{
    private String id;
    private String name;
    private double balance;
    private static final double LOWBALANCE = 1000.00;

    public CheckingAccount(String id, String name, double balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        double oldBalance = balance;
        balance += amount;

        String outputString = "Amount of " + String.format("%.2f", amount) 
            + " dollars was added to "+ id 
            + " checking account. The old balance was " 
            + String.format("%.2f", oldBalance)
            + " and the new balance is " + String.format("%.2f", balance) + ".";

        System.out.println(outputString);
    }

    public void withdraw(double amount)
    {
        double oldBalance = balance;
        String outputString;

        if (amount > balance)
        {
            outputString = "Insufficient funds. The old and new balance are both "
                + String.format("%.2f", balance);
            System.out.println(outputString);
        }
        else
        {
            balance -= amount;
            outputString = "Amount of " + String.format("%.2f", amount) 
                + " dollars was withdrawn from " + id 
                + " checking account. The old balance was " 
                + String.format("%.2f", oldBalance)
                + " and the new balance is " + String.format("%.2f", balance) + ".";
            System.out.println(outputString);
            if (balance < LOWBALANCE)
            {
                System.out.println("Account balance is low.");
            }
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public String getAccountID()
    {
        return id;
    }
}
