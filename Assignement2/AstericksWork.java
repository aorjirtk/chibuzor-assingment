import java.util.Scanner; 
public class AstericksWork{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;
		int numberEntered = 0;
		int newCounter = 0;
		
	for(counter = 1;counter <= 5;counter++){
		
		System.out.print("Enter number btw 1 & 30: ");
		numberEntered = input.nextInt();
		
		if(counter ==1)number1 = numberEntered;
		if(counter ==2)number2 = numberEntered;
		if(counter ==3)number3 = numberEntered;
		if(counter ==4)number4 = numberEntered;
		if(counter ==5)number5 = numberEntered;
			
		
	for(newCounter = 1; newCounter <= numberEntered; newCounter++){				
	System.out.printf("*");
			}


		}
	}


}		
