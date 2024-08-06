import java.util.Arrays;
public class Reverse{

	public static int[] reverseElements(int[] array){
		int[] reversedArray = new int[array.length];
		for(int index = 0; index < array.length; index++){
			reversedArray[index] = array[array.length - index - 1];
		}
		System.out.println(Arrays.toString(reversedArray));
		return reversedArray;
		
	}

	public static int[] reverseArray(int[] array){
		//{1,2,3,4} --> {4,3,2,1}
		int[] reversedArray = new int[array.length];
		int count = 0;
		for (int index = array.length-1; index >= 0; index--){
			reversedArray[count] = array[index];
			count++;
		}
		return reversedArray;
	}

}