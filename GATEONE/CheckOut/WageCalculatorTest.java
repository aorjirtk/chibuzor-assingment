
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class WageCalculatorTest{

	@Test
	public void testThatApplicationCanCalculateRidersPay(){

	//given
	 WageCalculator payCalculator = new WageCalculator();

	//when
	double commission = payCalculator.basePay(70);

	//assert
	assertEquals(35000, commission);
    }
}