
import javaScriptAssignment.JavaScriptAssignmentOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class JavaScriptAssignmentOneTest {
@Test
    public void testThatFunctionCanSortArraysInReverseOrder() {
        JavaScriptAssignmentOne javaScriptAssignmentOne = new JavaScriptAssignmentOne();
        int[] num = {1, 2, 3, 4, 5};
        int[] numbers = {5, 4, 3, 2, 1};
        int []  expected = javaScriptAssignmentOne.sortArraysInReverse(num);
        assertArrayEquals(numbers, expected);
    }

}
