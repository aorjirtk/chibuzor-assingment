package atm;

public class AutomatedTellerMachine {
    private String name;
    private String pin;
    private String accountNumber;
    private Double balance;
    public AutomatedTellerMachine(String name, String pin, String accountNumber, Double balance) {
        this.name = name;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
}
