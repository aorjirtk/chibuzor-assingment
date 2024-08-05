import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ArraysFunctionTest{

	@Test
	public void testForReverseFunction(){
	ArraysFunction arraysFunction = new ArraysFunction();
	int[] elements = {1, 2, 3, 4, 5, 6, 7};	
	int[]  reversedArray = {7, 6, 5, 4, 3, 2, 1};
	assertArrayEquals(reversedArray, arraysFunction.reverseFunction(elements));

}

	@Test
	public void testForEvenIndices(){
	ArraysFunction arraysFunction = new ArraysFunction();
	int[] elements = {1, 2, 3, 4, 5, 6, 7, 8};	
	int[] evenIndices = {1, 3, 5, 7};
	assertArrayEquals(evenIndices, arraysFunction.getEvenIndices(elements));
}

	@Test
	public void testForOddIndices(){
	ArraysFunction arraysFunction = new ArraysFunction();
	int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};	
	int[] oddIndices = {2, 4, 6, 8, 10};
	assertArrayEquals(oddIndices, arraysFunction.getOddIndices(elements));
}

	@Test
	public void testForSum(){
	ArraysFunction arraysFunction = new ArraysFunction();
	int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int expectedResult = 55;
	assertEquals(expectedResult, arraysFunction.getSum(elements));
}
	@Test
	public void testForDigitInList(){
	ArraysFunction arraysFunction = new ArraysFunction();
	int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int digit = 100;
	boolean result = false;
	assertEquals(result, arraysFunction.checkElementInList(elements,digit));
}

	@Test
	public void testForStringPalindrome(){
	ArraysFunction arraysFunction = new ArraysFunction();
	String[] word = {"racecar"};
	String[] reversedWord = {"racecar"};
	String result = "word is a palindrome";
	assertEquals(result, arraysFunction.checkElementInList("word","reversedWord"));
}
}