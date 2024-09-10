import java.util.Scanner;

public class AccountTest{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     Account myAccount = new Account("John", 70.99);
     Account account2 = new Account("Baby", -3.55);
System.out.printf("%s balance: $%.2f%n", myAccount.getName(), myAccount.getBalance()); 

Scanner input = new Scanner(System.in);

System.out.print("enter deposit amount for account1: ");
double depositAmount = input.nextDouble();

System.out.printf("%n adding %.2f to account1 balance %n%n", depositAmount);
myAccount.deposit(depositAmount);

System.out.printf("%s balance: $%.2f%n", myAccount.getName(), myAccount.getBalance());

System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

System.out.printf("enter deposit amount for account2: ");

depositAmount = input.nextDouble();
System.out.printf("%n adding  %.2f to account2 balance %n%n", depositAmount);

account2.deposit(depositAmount);  


System.out.printf("%s balance: $%.2f%n", myAccount().getName(), myAccount.gtBalance());

System.out.printf("%s balance: $%.2f%n%n", account2().getName(), account2.getBalance());

}
}