package e_store;

import java.util.Scanner;

public class Users {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the user: ");
        String name = input.nextLine();
        System.out.println("Enter the age of the user : ");
        int age = input.nextInt();
        System.out.println("Enter the email of the user : ");
        String email = input.nextLine();
        System.out.println("Enter the phone of the user : ");
        String phone = input.nextLine();
        System.out.println("Enter the password of the user : ");
        String password = input.nextLine();
        String message = """
                
                1. Enter 1 for Admin
                2. Enter 2 for Customer
                3. Enter 3 for Seller
                """;
        System.out.printf("%s%s%n%s","Welcome to EStore ",name,message);
        int user = input.nextInt();
//        if (user == 1) {
//

//        }

    }
}

