package bank;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account2> accounts = new ArrayList<>();
    private int totalNumberOfAccounts;
    private String accountNumber;
    public void createAccount(String accountName, String accountPin) {
        String accountNumber = accountNumberGenerator();
        Account2 account2 = new Account2(accountName, accountNumber, accountPin);
        accounts.add(account2);
    }
    private String accountNumberGenerator() {
        totalNumberOfAccounts += 1;
        return "205077799"+totalNumberOfAccounts;
    }

    public int getTotalNumberOfAccounts(){
        return totalNumberOfAccounts;
    }
    public  Account2 accountNumberValidator(String accountNumber){
        for(Account2 account : accounts.subList(0,2)){
                if(account.getAccountNumber().equals(accountNumber)) {
                    return account;
            }
        }
        return null;
    }
    public String deposit(String accountNumber, double amount) {
        Account2 foundAccountNumber = accountNumberValidator(accountNumber);
        if(foundAccountNumber != null) {
            foundAccountNumber.deposit(amount);
            return String.format("Deposit of %.2f successful",amount);
        }
        return "account not found";
    }
    public Double getBalance(String number, String pin) {
        Account2 foundAccountNumber = accountNumberValidator(number);
        if(foundAccountNumber != null) {
            return foundAccountNumber.checkBalance(pin);
        }else return null;
    }
//    public String getAccountNumber(String accountNumber) {
//        for(Account2 account : accounts.subList(accounts.(size))) {
//            if()
//
//        }

//    }

}
