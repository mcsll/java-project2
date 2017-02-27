/**
 * CS152 Section 01, Project #2
 * TestAccount contains main routine
 * @author (Matthew Sullivan) 
 * @version (Feb 27, 2017)
 */

public class TestAccount
{
    public static void main(String[] args)
    {
        Account a1 = new CheckingAccount("c1234", "Halston", 2500.00);
        a1.deposit(500.00);
        a1.withdraw(2500.00);
        System.out.println("Account ID: " + a1.getAccountID());
        System.out.println("Account balance: "
                + String.format("%.2f", a1.getBalance()) + "\n");
        
        Account a2 = new SavingAccount("a6789", "Halston", 0.00);
        a2.deposit(750.00);
        a2.withdraw(10.00);
        System.out.println("Account ID: " + a2.getAccountID());
        System.out.println("Account balance: "
                + String.format("%.2f", a2.getBalance()) + "\n");
    }
}
