import java.util.Scanner;

public class PrimeNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number ");
		int number = input.nextInt();

		if(number == 2 || number ==3){
		System.out.print(number + " is a prime number.");
		}
		else if(number % 2 !=0 && number % 3!=0){
		System.out.print(number + " is a prime number.");
		}
		else

		System.out.print(number + " is a NOT prime number.");

		
		
	}	


}

