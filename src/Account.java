/**
 * CS152 Section 01, Project #2
 * Account is an interface
 * @author (Matthew Sullivan) 
 * @version (Feb 27, 2017)
 */

public interface Account
{
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    String getAccountID();
}
