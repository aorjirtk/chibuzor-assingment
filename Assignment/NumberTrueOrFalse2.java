import java.util.Arrays;
import java.util.Scanner;

public class NumberTrueOrFalse2{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		int [] age = new int[10];
int add = age.length-1;
	
	for(int index=0; index < age.length; index++){
//System.out.print("Enter number"+(index+1)+":");
//age [index] = input.nextInt();


System.out.print("Enter number");
age[add] = input.nextInt();

add--;
}
System.out.print(Arrays.toString(age));
	}


}
