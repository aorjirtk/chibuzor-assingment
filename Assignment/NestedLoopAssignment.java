import java.util.Scanner; 
public class NestedLoopAssignment{
	public static void main(String[] args){
		int count = 6;
		System.out.println("\n\nPattern A");
		for(int row = 1; row <= count; row++){
			for(int row2 = 1; row2 <= row; row2++){
			System.out.print(row2 +"");
		}
		System.out.println();
	}

		System.out.println("\n\nPattern B");
		for(int row = 1; row <= 6;row++){
			for(int row2 =1; row2 <= 6-row; row2++){

			System.out.print(row2 + "");
			}
		System.out.println();
		}
		System.out.println("\n\nPattern C");
		for(int row = 1; row <= 6;row++){
			for(int row2 =1; row2 <= 6-row; row2--){

			System.out.print(row2 + "");
			}
		System.out.println();
		}

	}

}