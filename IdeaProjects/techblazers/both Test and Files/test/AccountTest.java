import bank.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AccountTest {
Account account;

    @Test
    public void newAccount_testThatBalanceIsZero() {
        Account account = new Account("Kizito Aorjir", "1111", "23335322231");
        assertEquals(0.0, account.getBalance("1111"));
    }

    @Test
    public void newAccount_depositNegativeAmount() {
        Account account = new Account("Kizito Aorjir", "1111", "23335322231");
        account.deposit(-2000);
        assertEquals(0.0,account.getBalance("1111"));
    }

    @Test
    public void newAccount_depositpositiveAmount() {
        Account account = new Account("kizito", "1111", "23335322231");
        int amount = 2000;
        account.deposit(amount);
        assertEquals(2000, account.getBalance("1111"));
    }
    @Test
    public void newAccount_withdrawNegativeAmount() {
        Account account = new Account("Kizito Aorjir", "1111", "23335322231");
        account.deposit(2000);
        account.withdraw(-2000, "1111");
        assertEquals(2000.00,account.getBalance("1111"));
    }
    @Test
    public void newAccount_withdrawAmountGreaterThanBalance() {
        Account account = new Account("Kizito Aorjir", "1111", "23335322231");
        account.deposit(2000);
        account.withdraw(1000, "1111");
        assertEquals(1000, account.getBalance("1111"));
    }
    @Test
    public void accountCanUpdatePin() {
        Account account = new Account("Kizito Aorjir", "1111", "2333532231");
        account.deposit(2000);
        account.updatePin("1111", "2222");
        account.withdraw(600, "2222");
        assertEquals(1400.00,account.getBalance("2222"));

    }
}

