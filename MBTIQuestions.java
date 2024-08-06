import java.util.Arrays;
import java.util.Scanner;

public class MBTIQuestions{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		int [] questions = new int[20];
	
		for(int index=0; index < questions.length; index++){
		System.out.print("Enter number"+(index+1)+":");
		questions [index] = input.nextInt();

		System.out.println(Arrays.toString("A. expend energy, enjoy groups", "B. conserve energy, enjoy one on one"));
 
		}
		//System.out.print(Arrays.toString(questions));
	}


}
