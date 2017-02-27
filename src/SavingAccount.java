/**
 * CS152 Section 01, Project #2
 * SavingAccount class implements Account interface as a Saving Account
 * @author (Matthew Sullivan) 
 * @version (Feb 27, 2017)
 */

public class SavingAccount implements Account
{
    private String id;
    private String name;
    private double balance;

    public SavingAccount(String id, String name, double balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        double oldBalance = balance;
        balance += amount;
        System.out.println("Amount of " + String.format("%.2f", amount)
            + " dollars was added to " + id
            + " saving account.\nThe old balance was "
            + String.format("%.2f", oldBalance)
            + " and the new balance is "
            + String.format("%.2f", balance) + ".\n");
    }

    public void withdraw(double amount)
    {
        double oldBalance = balance;
        if (amount > balance)
        {
            System.out.println("Insufficient funds on saving account.\n"
                + "The old and new balance are both "
                + String.format("%.2f", balance) + ".\n");
        }
        else
        {
            balance -= amount;
            System.out.println("Amount of " + String.format("%.2f", amount) 
                + " dollars was withdrawn from "+ id 
                + " saving account.\nThe old balance was "
                + String.format("%.2f", oldBalance)
                + " and the new balance is " 
                + String.format("%.2f", balance) + ".\n");
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
