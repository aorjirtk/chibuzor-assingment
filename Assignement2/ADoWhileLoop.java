import java.util.Scanner; 
public class ADoWhileLoop{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		String stop = "";
		
	do{
		System.out.println("Enter the first Integers or "n" to stop: ");
		int number1 = input.nextInt();

		System.out.println("Enter the second Integers: ");
		int number2 = input.nextInt();

		sum = number1 + number2;
		System.out.print("The sum is "+sum);
		
		}
		while(stop !="n");
		
	
	}


}		
