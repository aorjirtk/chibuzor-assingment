import java.util.Arrays;
import java.util.Scanner;
import java.time.format.DateTimeFormatter; 


public class CreditCardValidator2{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.println("Hello, Kindly Enter Card details to verify ");
   long number = input.nextLong();
String numberStr = Long.toString(number);
int[] splitDigits = new int[numberStr.length()];
for(int index = 0; index < numberStr.length(); index++){
	splitDigits[index] = numberStr.charAt(index)-'0';
}

	int[] secondPlace = new int[splitDigits.length];
	int total = 0;
	int sumOdd = 0;
	int sum = 0;
	int length = 0;

	for(length = 0; length < splitDigits.length; length++){
   	int digits = splitDigits[length] * 2;
		if(digits > 9){
		digits = digits % 10 + digits / 10;
		}

	secondPlace[length] = digits;
}
for(int index = splitDigits.length-1; index >=0; index-=2){
		sumOdd+=splitDigits[index];
}

for(int index = secondPlace.length-2; index >= 0; index-=2){
	total+=secondPlace[index];

}
for(int count = 0; count < 50; count++){
	System.out.print("*");

}
if(splitDigits[0] == 6){
	System.out.printf("%n%s%s","**","Credit Card Type: MasterCard");
}else
if(splitDigits[0] == 4){
	System.out.printf("%n%s%s","**","Credit Card Type: VisaCard");

}else
if(splitDigits[0] == 5){
	System.out.printf("%n%s%s","**","Credit Card Type: MasterCard");

}else
if(splitDigits[0] == 3 && splitDigits[1] == 7){
	System.out.printf("%n%s%s","**","Credit Card Type: MasterCard");
}else
System.out.printf("%n%s%s","**","Credit Card Type: Invalid");
System.out.printf("%n%s%s%d","**","Credit Card Type Number: ",number);
System.out.printf("%n%s%s%d","**","Credit Card Type Digit length: ",length);
sum = sumOdd + total;
	if(sum % 10 == 0){
System.out.printf("%n%s%s","**","Credit Card Validity Status: Valid");
}else
System.out.printf("%n%s%s","**","Credit Card Validity Status: invalid");
System.out.println();
for(int count = 0; count < 50; count++){
	System.out.print("*");
}


}

}