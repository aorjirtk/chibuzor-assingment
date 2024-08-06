

public class DispatchRidersPayCalculator{
	
	public static int riderPayment(int amountOfDeliveries){
	int riderPayment = 0;
	int base = 5000;
	if(amountOfDeliveries < 50){
	riderPayment = (amountOfDeliveries * 160) + base;
		}
else

	if(amountOfDeliveries >= 50 && amountOfDeliveries < 60){
	riderPayment = (amountOfDeliveries * 200) + base;
		}
else

	if(amountOfDeliveries >= 60 && amountOfDeliveries < 70){riderPayment = (amountOfDeliveries * 250) + base;
		}
else
	if(amountOfDeliveries >= 70){riderPayment = (amountOfDeliveries * 500) + base;
		}
	return riderPayment;

	}

	

}