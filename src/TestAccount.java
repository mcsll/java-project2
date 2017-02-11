/**
 * Created by Matt on 2/11/2017.
 */
public class TestAccount
{
    public static void main(String[] args)
    {
        Account a1 = new CheckingAccount("a1234", "Halston", 2500.00);
        a1.deposit(500.00);
        a1.withdraw(2500.00);
    }
}
