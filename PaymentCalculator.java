import java.util.Scanner; 
public class PaymentCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of deliveries done: ");
	int amountOfDeliveries = input.nextInt();
	int riderPayment = DispatchRidersPayCalculator.riderPayment(amountOfDeliveries);
	System.out.printf("%s%d","The Rider's payment is #",riderPayment);

	}

}