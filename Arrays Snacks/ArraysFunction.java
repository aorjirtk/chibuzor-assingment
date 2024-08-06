import java.util.Arrays;
public class ArraysFunction{
	public static int[] reverseFunction(int[] elements){
	int[] reversedArray = new int[elements.length];
	int index = 0;
	for(int count = elements.length-1; count >= 0; count --){
		reversedArray[index] = elements[count];
		index++;

}
		return reversedArray;
}


	public static int[] getEvenIndices(int[] elements){
	int length;
	if(elements.length % 2==0)length = elements.length / 2;
	else length = (elements.length / 2) + 1;
	int[] evenIndices = new int[length]; 
	int count = 0;
	for(int index = 0; index < elements.length; index+=2){
		evenIndices[count] = elements[index];
		count++;

} 
		return evenIndices;
}

	public static int[] getOddIndices(int[] elements){
	int length;
	if(elements.length % 2==0)length = elements.length / 2;
	else length = (elements.length / 2) + 1;
	int[] oddIndices = new int[length]; 
	int count = 0;
	for(int index = 1; index < elements.length; index+=2){
		oddIndices[count] = elements[index];
		count++;

} 
		return oddIndices;


}

	public static int getSum(int[] elements){
	int total = 0;
	for(int index = 0; index < elements.length; index++){
		total+=elements[index];
}
		return total;
	
}
	public static boolean checkElementInList(int[] elements,int digit){
	boolean result = false;
	for(int index = 0; index < elements.length; index++){
		if(digit == elements[index]){
			result = true;
			}
		}
		return result;
	}

	public static String checkStringPalindrome(String[] word){
	String[] reversedWord = String [word.length];
	String result = "word is NOT a palindrome";
	int count;
	for(int index = word.length-1; index >= 0; index--){
		reversedWord = word;
		count++;	
		}
	if(reversedWord == word){
	result = "word is a palindrome";
		}
	return result;
	}
}