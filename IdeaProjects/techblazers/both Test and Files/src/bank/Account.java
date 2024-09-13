package bank;

public class Account {
    private String number;
    private double balance;
    private String name;
    private String pin;

    public Account(String name, String pin, String number) {
        this.name = name;
        this.pin = pin;
        this.balance = 0.0;
        this.number = number;
    }

    public Double getBalance(String pin) {
        if(pinValidator(pin)) {
            return this.balance;
        }else
            return 0.0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(int amount, String pin) {
        if (pinValidator(pin)) {
            if (amount > 0) {
                this.balance -= amount;
            }
        }
    }

    public void updatePin(String oldPin, String newPin) {
        if (pinValidator(oldPin)) {
            this.pin = newPin;
        }
    }

    public boolean pinValidator(String pin) {
        if (this.pin.equals(pin)) {
            return true;
        } else
            return false;
    }
}




