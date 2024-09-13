package IdeaProjects.techblazers.test;

import bank.Account2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Account2Test {
    Account2 account2 = new Account2("Kizito","213328999", "1212");
    @BeforeEach
    @Test
    public void testThatAccount2IsCreated_AndBalanceIsZero() {
        assertEquals(0, account2.checkBalance("1212"));
    }
    @Test
    public void testThatAccountCanDeposit(){

        account2.deposit(3000.00);
        assertEquals(3000, account2.checkBalance("1212"));
    }
    @Test
    public void testThatAccountCanDeposit2k_Balance2k(){
        account2.deposit(2000.00);
        assertEquals(2000, account2.checkBalance("1212"));
    }
    @Test
    public void testThatAccountCannotDepositNegativeAmount(){

        account2.deposit(-3000.00);
        assertEquals(0, account2.checkBalance("1212"));
    }
    @Test
    public void testThatAccountCanDepositTwoTimes(){

        account2.deposit(3000.00);
        account2.deposit(2000.00);
        assertEquals(5000, account2.checkBalance("1212"));
    }
    @Test
    public void testThatAccountCanWithdraw(){

        account2.deposit(3000.00);
        account2.withdraw(1000.00, "1212");
        assertEquals(2000, account2.checkBalance("1212"));
    }
    @Test
    public void testThatAccountCannotWithdrawNegativeAmount(){

        account2.deposit(3000.0);
        account2.deposit(2000.0);
        account2.withdraw(-3000.0, "1212");
        assertEquals(5000, account2.checkBalance("1212"));
    }
    @Test
    public void testThatAccountCannotWithdrawAmountMoreThanBalance(){

        account2.deposit(3000.0);
        account2.withdraw(7000.0, "1212");
        assertEquals(3000, account2.checkBalance("1212"));
    }
    @Test
    public void testThatAccountCanUpdatePin(){
        account2.updatePin("1212", "2222");
    }
    @Test
    public void testThatAccountCanUpdatePinAndDepositAndWithdrawWithNewPin() {
        account2.updatePin("1212", "2222");
        account2.deposit(7000.0);
        account2.withdraw(4000.0, "2222");
        assertEquals(3000, account2.checkBalance("2222"));
    }

}
