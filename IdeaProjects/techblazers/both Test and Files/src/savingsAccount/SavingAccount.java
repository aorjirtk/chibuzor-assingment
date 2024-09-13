package savingsAccount;

public class SavingAccount {
double annualInterestRate;
double savingsBalance;

public SavingAccount(double savingsBalance, double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
    this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
    public double getMonthlyInterest() {
        return (savingsBalance * annualInterestRate) / 12;
    }
    public String deposit(double amount) {
        if(amount > 0) {
            savingsBalance += amount;
            return "Deposit Successful";
        }else
            return "Deposit Failed";
    }
}
