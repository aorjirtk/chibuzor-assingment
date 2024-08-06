import java.util.Scanner; 
public class NumberRaisedToPower3{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer ");
		int number1 = input.nextInt();

		System.out.print("Enter second integer ");
		int number2 = input.nextInt();
		
		int counter = 1;
		int result =  number1;
		
	for(counter = 1;counter < number2;counter++){
		result *= number1 ;
	
		}
		System.out.println(result);
	}

}		
