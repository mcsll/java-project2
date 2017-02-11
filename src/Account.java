/**
 * Created by Matt on 2/11/2017.
 */
public interface Account
{
    void deposit( double amount);
    void withdraw(double amount);
    double getBalance();
    String getAccountID();
}
