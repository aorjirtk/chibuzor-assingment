package IdeaProjects.techblazers.test;

import org.junit.jupiter.api.Test;
import savingsAccount.SavingAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {
    @Test
    public void testThatSaverAHasAnAccountAndAccountBalance() {
        SavingAccount saverA = new SavingAccount(2000.00, 4);
        SavingAccount saverB = new SavingAccount(3000.00, 4);
        assertEquals(2000.00, saverA.getSavingsBalance());
    }
    @Test
    public void testThatWeCAnCalculateMonthlyInterestForSavera() {
        SavingAccount saverA = new SavingAccount(1200.00, 4);
        SavingAccount saverB = new SavingAccount(24000.00, 4);
        assertEquals(400.00, saverA.getMonthlyInterest());
        assertEquals(8000.00, saverB.getMonthlyInterest());
    }
    @Test
    public void testThatWeCanDeposit(){
        SavingAccount saverA = new SavingAccount(4000.00, 5);
        SavingAccount saverB = new SavingAccount(6000.00, 5);
        saverA.deposit(2000.00);
        saverB.deposit(6000.00);
        assertEquals(6000.00, saverA.getSavingsBalance());
        assertEquals(2500.00, saverA.getMonthlyInterest());
        assertEquals(12000.00, saverB.getSavingsBalance());
        assertEquals(5000.00, saverB.getMonthlyInterest());

    }

}
