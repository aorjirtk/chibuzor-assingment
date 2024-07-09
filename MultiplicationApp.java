public class MultiplicationApp{

	public int multiply(int number1,int number2){
		int multiply=0;

		if(number2<0){
		number2 = number2-(number2)-(number2);
		}

		for (int counter = 1; counter <= number2; counter++){
		multiply = multiply + number1;
		
		}
	return multiply;
	}

}