import java.util.Scanner;

public class NumberTrueOrFalse{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	for(int count=1;count<=5;count++)

	System.out.print("Enter number ");	
	int num = input.nextInt();	
	
	if(num % 2 == 0){
	System.out.print("True ");
	}
	else{

	System.out.print("false ");
	

		}


	}


}