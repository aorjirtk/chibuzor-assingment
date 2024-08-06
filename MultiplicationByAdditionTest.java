import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultiplicationByAdditionTest{

@Test
public void testThatCalculatorCanMultiplyAdditionAddition(){

//given
MultiplicationApp multiplication = new MultiplicationApp();

//when
int multiply = multiplication.multiply(3, -4);

//assert
assertEquals(12, multiply);
	}

}