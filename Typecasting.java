import java.util.Scanner; 
public class TypeCasting{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int a = 0;
		int b = 0;
		
	for(a = 1;a <= 5; a++){
		
		float pow = (float)Math.pow(a,(a+1));

		System.out.printf("%d%10d%10.0f%n",a,a+1,pow);


		}

	}		


}