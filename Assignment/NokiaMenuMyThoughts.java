import java.util.Scanner;

public class NokiaMenuMyThoughts{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	String frontInput="""
	 List of Menu Functions
	press any number to enter
	1.Phonebook
	2.Messages
	3.Chat
	4.Call Register
	5.Tones
	6.Settings
	7.Call divert
	8.Games
	9.Calculator
	10.Reminder
	11.Clock
	12.Profiles
	13.SIM services
		""";
	
	System.out.print(frontInput);	
	int mainPage = input.nextInt();
	switch(mainPage){
	case 1:
		String phoneBookEntry="""
		press any number to enter
		1.Search
		2.Service Nos
		3.Add name
		4.Erase
		5.Edit
		6.Assign tone
		7.Send b'cards
		8.Options
		9.Speed dials
		10.Voice tags
		""";
		

		System.out.print(phoneBookEntry);
			int phoneBook = input.nextInt();
			
			switch(phoneBook){
			case 1:
			System.out.print("Search ");
			break;

			case 2:
			System.out.print("Service Nos ");
			break;

			case 3:
			System.out.print("Add name ");
			break;

			case 4:
			System.out.print("Erase ");
			break;

			case 5:
			System.out.print("Edit ");
			break;

			case 6:
			System.out.print("Assign tone ");
			break;

			case 7:
			System.out.print("Send b'cards ");
			break;

			case 8:
			System.out.print("Options ");

				String optionEntry="""
				press any number to enter
				1.Type of view
				2.Memory status
				""";
				System.out.print(optionEntry);
				int options = input.nextInt();
				if(options == 3){return;phonebook
						}
				

				switch(options){
				case 1:
				System.out.print("Type of view ");
				break;

				case 2:
				System.out.print("Memory status ");
				break;

				default:
				System.out.print("Update ");
				}



	}

}