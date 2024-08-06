import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ReverseTest{

	@Test
	public void reverseListTest(){
	    Reverse reverse = new Reverse();
	    int[] newArray = {1, 3, 2, 4};
	    int[] reversedArray = {4, 2, 3, 1};
	    assertArrayEquals(reversedArray, reverse.reverseArray(newArray));
	}

}