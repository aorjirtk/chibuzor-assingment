import bank.Account2;
import bank.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class  BankTest {
    Bank bank=new Bank();
    @Test
    public void testThatWhenAUserCreateAccountTotalNumberOfAccountEqualsOne() {
        String name = "Kizito Aorjir";
        String pin = "1212";
        bank.createAccount(name,pin);
        assertEquals(1, bank.getTotalNumberOfAccounts());
    }
    @Test
    public void testThatWhenTwoUsersCreateAccountTotalNumberOfAccountEqualsTwo(){
        String name = "Kizito Aorjir";
        String pin = "1212";
        String name2 = "Winner James";
        String pin2 = "3232";
        bank.createAccount(name,pin);
        bank.createAccount(name2,pin2);
        assertEquals(2, bank.getTotalNumberOfAccounts());
    }
    @Test
    public void testThatWhenAUserCreateAccountUserCanDepositIntoAccount(){
        String name = "Kizito Aorjir";
        String pin = "1212";
        bank.createAccount(name,pin);
        bank.deposit("2050777991",5000);
        assertEquals(5000, bank.getBalance("2050777991", "1212"));
    }

}
