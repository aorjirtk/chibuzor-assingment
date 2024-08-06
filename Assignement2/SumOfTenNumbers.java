import java.util.Scanner; 
public class SumOfTenNumbers{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int number = 0;
		int sum = 0;
		int counter = 0;
		
	for(counter = 1;counter <= 10;counter++){
		System.out.print("Enter number ");
		number = input.nextInt();

		sum = sum + number;
		}

		System.out.print("sum is "+sum);
	}

}		
