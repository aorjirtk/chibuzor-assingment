package bank;

public class Account2 {

    private String name;
    private String pin;
    private Double balance = 0.0;
    private String accountNumber;

    public Account2(String Name, String number, String pin) {
        this.pin = pin;
        this.name = name;
        this.accountNumber = number;
        this.balance = 0.0;
    }

    public Double checkBalance(String pin) {
        if (pinValidator(pin)) {
           return this.balance;
        }else
            return 0.0;
    }
    public void deposit(Double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
    public void withdraw(Double amount, String pin ) {
        if (amount > 0 && amount <= this.balance){
            if(pinValidator(pin)) {
                this.balance -= amount;
            }else System.out.print("invalid amount or balance");
        }
        else System.out.print("invalid pin");

    }
    private Boolean pinValidator(String pin) {
        return this.pin.equals(pin);
    }
    public void updatePin(String oldPin, String newPin) {
        if (pinValidator(oldPin)) {
            this.pin = newPin;
        }
    }
    public String getName() {
        return name;
    }
    public String getPin() {
        return pin;
    }
    public Double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    @Override
    public String toString() {
        return "Account2 [name=" + name + ", pin=" + pin + ", balance=" + balance + ", accountNumber="
                + accountNumber + "]";

    }
}
