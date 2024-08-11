import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
public class CheckOut{
   public static void main(String[] args){

   ArrayList<String> itemPurchased = new ArrayList<String>();
   ArrayList<Integer> quantity = new ArrayList<Integer>();
   ArrayList<Double> price = new ArrayList<Double>();
   ArrayList<Double> totalPrice = new ArrayList<Double>();
   ArrayList<Double> sum = new ArrayList<Double>();

	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String formattedNow = now.format(formatter);

   Scanner input = new Scanner(System.in);


System.out.println("Enter cashier's name: ");
String cashierName = input.nextLine();

System.out.println("Enter customers name: "); 
String name = input.nextLine();	
double subTotal = 0;
double discount = 0;
double vatValue = 0;
double billTotal = 0;
double total = 0;
double paid = 0;
double balance = 0;

String flag = "yes";

while(flag.equalsIgnoreCase("yes")){

System.out.println("Enter the item purchased: ");
itemPurchased.add(input.nextLine());

System.out.println("Enter quantity: ");
quantity.add(input.nextInt());

input.nextLine();

System.out.println("Enter price: ");
price.add(input.nextDouble());
input.nextLine();

System.out.println("Add more items: ");
flag = input.nextLine();
	}
	for(int index = 0; index < quantity.size(); index++){
		double counter = 0;
		counter = quantity.get(index) * price.get(index);
		sum.add(counter);
   }
for(int count1 = 0; count1 < sum.size(); count1++){
	total+= sum.get(count1);
}
subTotal = total;
discount = 0.08 * subTotal;
vatValue = 0.175 * subTotal;
billTotal = subTotal + vatValue - discount;


String message = """
SEMICOLON STORES
MAIN BRANCH 
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA,LAGOS.
TEL: 03293828343""";
System.out.println(message);
System.out.println(formattedNow);

System.out.println("cashier's name: "+cashierName);
System.out.println("customer name: "+name);


for(int index = 0; index < 55; index ++){
System.out.print("=");
}

System.out.printf("%n%15s%10s%10s%15s", "ITEM ", "QTY ", "PRICE ", "TOTAL(NGN)");
for(int count = 0; count < itemPurchased.size(); count++){
System.out.printf("%n%14s%10d%11.2f%12.2f",itemPurchased.get(count), quantity.get(count), price.get(count),sum.get(count));
System.out.println();
}
for(int index = 0; index < 55; index ++){
System.out.print("-");
}
System.out.printf("%n%38s%9.2f%n%38s%9.2f%n%38s%9.2f","Sub Total ",subTotal,"Discount ",discount,"VAT@17.5% ",vatValue);
System.out.println();
for(int index = 0; index < 55; index ++){
System.out.print("-");
}
System.out.printf("%n%40s%10.2f", "Bill Total: ",billTotal); 
System.out.println();

for(int index = 0; index < 55; index ++){
System.out.print("=");
}
System.out.println();
System.out.printf("%10s%10.2f%n%n%10s","THIS IS NOT A RECEIPT, KINDLY PAY ",billTotal,"HOW MUCH ARE YOU PAYING?: ");
paid = input.nextDouble();

balance = paid - billTotal;

System.out.println();
System.out.println();

String message2 = """
SEMICOLON STORES
MAIN BRANCH 
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA,LAGOS.
TEL: 03293828343""";
System.out.println(message2);
System.out.println(formattedNow);

System.out.println("cashier's name: "+cashierName);
System.out.println("customer name: "+name);



for(int index = 0; index < 55; index ++){
System.out.print("=");
}

System.out.printf("%n%15s%10s%10s%15s", "ITEM ", "QTY ", "PRICE ", "TOTAL(NGN)");
for(int count = 0; count < itemPurchased.size(); count++){
System.out.printf("%n%14s%10d%11.2f%12.2f",itemPurchased.get(count), quantity.get(count), price.get(count),sum.get(count));
System.out.println();
}
for(int index = 0; index < 55; index ++){
System.out.print("-");
}
System.out.printf("%n%38s%9.2f%n%38s%9.2f%n%38s%9.2f","Sub Total ",subTotal,"Discount ",discount,"VAT@17.5% ",vatValue);
System.out.println();
for(int index = 0; index < 55; index ++){
System.out.print("-");
}
System.out.printf("%n%40s%10.2f%n%40s%10.2f%n%40s%10.2f", "Bill Total: ",billTotal,"amount paid:",paid,"Balance:",balance); 
System.out.println();

for(int index = 0; index < 55; index ++){
System.out.print("=");
}
System.out.println();
System.out.print("THANK YOU FOR YOUR PATRONAGE ");



}

}

	






