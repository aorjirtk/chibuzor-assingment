public class WageCalculator{
	
   public static double basePay(int successfulDeliveries){
	double commission = 0.0;


   if(successfulDeliveries > 0 && successfulDeliveries < 50){  commission = successfulDeliveries * 160.00;
}else if(successfulDeliveries >= 50 && successfulDeliveries < 60){ commission = successfulDeliveries * 200.00;
}else if(successfulDeliveries >= 60 && successfulDeliveries < 70){ commission = successfulDeliveries * 250.00;
}else if(successfulDeliveries >= 70 && successfulDeliveries <= 100){ commission = successfulDeliveries * 500.00;
}

  return commission;

}
 	
}