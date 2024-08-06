import java.util.Scanner; 
public class Assignment{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int number = 0;
		int highest = 0;
		int lowest = 0;

		
	while(number != -1){
		
		System.out.print("Enter Integers or -1 to stop: ");
		number = input.nextInt();

		if(highest < number ){
		highest = number;

		}
		if(lowest > number ){
		lowest = number;
		}

		}
		System.out.println("the largest number is "+highest);
		System.out.println("the smallest number is "+lowest);


	
		
	}


}		
