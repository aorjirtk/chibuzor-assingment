import java.util.Scanner;

public class NokiaMenu{
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

			break;
			
			case 9:
			System.out.print("Speed dials ");
			break;

			case 10:
			System.out.print("Voice tags ");
			break;

			default:
			System.out.print("Update ");
				
			}

		break;
			
		case 2: 
			String messageEntry="""
			press any number to enter
			1.Write messages
			2.Inbox
			3.Outbox
			4.Picture messages
			5.Templates
			6.Smileys
			7.Message settings
			8.Info services
			9.Voicemail box number
			10.Service command editor
				""";
			System.out.print(messageEntry);

			int messages = input.nextInt();

			switch(messages){
			case 1:
			System.out.print("Write messages ");
			break;

			case 2:
			System.out.print("Inbox ");
			break;

			case 3:
			System.out.print("Output ");
			break;

			case 4:
			System.out.print("picture messages ");
			break;

			case 5:
			System.out.print("Templates ");
			break;

			case 6:
			System.out.print("Smileys ");
			break;

			case 7:
			String messageSetEntry="""
			press any number to enter
			1.Set
			2.Common
			""";
			System.out.print(messageSetEntry);
				int messageSettings = input.nextInt();
				switch(messageSettings){

				case 1:
				String setEntry="""
				press any number to enter
				1.Message centre number
				2.Messages sent as
				3.Message validity
						""";

				System.out.print(setEntry);
					int set = input.nextInt();

					switch(set){
					case 1:
					System.out.print("Message centre number ");
					break;

					case 2:
					System.out.print("Messages sent as ");
					break;

					case 3:
					System.out.print("Message validity ");
					break;

					default:
					System.out.print("Update ");

					}


				break;
				case 2:
				String commonEntry="""
				press any number to enter
				1.Delivery reports
				2.Reply via same centre
				3.Character support
						""";

				System.out.print(commonEntry);
					int common = input.nextInt();

					switch(common){
					case 1:
					System.out.print("Delivery ");
					break;

					case 2:
					System.out.print("Reply via same centre ");
					break;

					case 3:
					System.out.print("Character support ");
					break;

					default:
					System.out.print("Update ");

					}

				break;

				default:
				System.out.print("Update ");

				}

			break;

			case 8:
			System.out.print("Info Service ");
			break;

			case 9:
			System.out.print("Voice mailbox number ");
			break;

			case 10:
			System.out.print("Service command editor ");
			break;

			default:
			System.out.print("Update ");


			}
			
		break;

		case 3: 
		System.out.print("Chat ");
		break;
	
		case 4:

		String callRegisterEntry="""
		press any number to enter
		1.Missed calls
		2.Received calls
		3.Dialled numbers
		4.Erase recent call lists
		5.Show call duration
		6.Show call costs
		7.Call cost settings
		8.Prepaid credit
			""";
 
		System.out.print(callRegisterEntry);
			int callRegister = input.nextInt();

			switch(callRegister){
			case 1:
			System.out.print("Missed calls ");
			break;

			case 2:
			System.out.print("Received calls ");
			break;

			case 3:
			System.out.print("Dialled numbers ");
			break;

			case 4:
			System.out.print("Erase recent call lists ");
			break;

			case 5:
			String callDurationEntry="""
			press any number to enter
			1.Last call duration
			2.All calls' duration
			3.Received calls' duration
			4.Dialled calls' duration
			5.Clear timers
			""";

			System.out.print(callDurationEntry);
				int showCallDuration = input.nextInt();

				switch(showCallDuration){
				case 1:
				System.out.print("Last call duration ");
				break;

				case 2:
				System.out.print("All calls' duration ");
				break;

				case 3:
				System.out.print("Received calls' duration ");
				break;

				case 4:
				System.out.print("Dialled calls' duration ");
				break;

				case 5:
				System.out.print("Clear timers ");
				break;

				default:
				System.out.print("Update ");
				}

			break;

			case 6:
			String callCostsEntry="""
			press any number to enter
			1.Last calls costs
			2.All calls' cost
			3.Clear counters
			""";
			System.out.print(callCostsEntry);
				int showCallCosts = input.nextInt();

				switch(showCallCosts){
				case 1:
				System.out.print("Last call costs ");
				break;

				case 2:
				System.out.print("All calls' costs ");
				break;

				case 3:
				System.out.print("Clear counters ");
				break;

				default:
				System.out.print("Update ");
				}			

			break;

			case 7:
			String callCostsSettingsEntry="""
			press any number to enter
			1.Call cost limit
			2.Show costs in
			""";
			System.out.print(callCostsSettingsEntry);
				int callCostSettings = input.nextInt();

				switch(callCostSettings){
				case 1:
				System.out.print("Call cost limits ");
				break;

				case 2:
				System.out.print("Show costs in ");
				break;

				default:
				System.out.print("Update ");
				}

			break;

			case 8:
			System.out.print("Prepaid credit ");
			break;

			default:
			System.out.print("Update ");
	
			}

		break;

		case 5: 
		String tonesEntry="""
		press any number to enter
		1.Ringing tone
		2.Ringing volume
		3.Incoming call alert
		4.Composer
		5.Message alert tone
		6.Keypad tones
		7.Warning and game tones
		8.Vibrating alert
		9.Screen saver
		""";
		System.out.print(tonesEntry);
			int tones = input.nextInt();

			switch(tones){
			case 1:
			System.out.print("Ringing tone ");
			break;

			case 2:
			System.out.print("Ringing volume ");
			break;

			case 3:
			System.out.print("Incoming call alert ");
			break;

			case 4:
			System.out.print("Composer ");
			break;

			case 5:
			System.out.print("Message alert tone ");
			break;

			case 6:
			System.out.print("Keypad tones ");
			break;

			case 7:
			System.out.print("Warning and game tones ");
			break;

			case 8:
			System.out.print("vibrating alert ");
			break;

			case 9:
			System.out.print("Screen saver ");
			break;

			default:
			System.out.print("Update ");
			}

		break;
		case 6:
		String settingEntry="""
		press any number to enter
		1.Call setting
		2.Phone setting
		3.Security setting
		4.Restore factory settings
		""";
		System.out.print(settingEntry);
			int settings = input.nextInt();

			switch(settings){
			case 1:
			String callSettingEntry="""
			press any number to enter
			1.Automatic redial
			2.Speed dialling
			3.Call waiting options
			4.Own number sending
			5.Phone line in use
			6.Automatic
			""";
			System.out.print(callSettingEntry);
				int callSettings = input.nextInt();

				switch(callSettings){
				case 1:
				System.out.print("Automatic redial ");
				break;

				case 2:
				System.out.print("Speed dialling ");
				break;

				case 3:
				System.out.print("Call waiting options ");
				break;

				case 4:
				System.out.print("Own number sending ");
				break;

				case 5:
				System.out.print("Phone line in use ");
				break;

				case 6:
				System.out.print("Automatic answer ");
				break;

				default:
				System.out.print("Update ");
				}
			
			break;

			case 2:
			String phoneSettingEntry="""
			press any number to enter
			1.Language
			2.Cell info display
			3.Welcome note
			4.Network selection
			5.Lights
			6.Confirm SIM service actions
			""";
			
			System.out.print(phoneSettingEntry);
				int phoneSettings = input.nextInt();

				switch(phoneSettings){
				case 1:
				System.out.print("Language ");
				break;

				case 2:
				System.out.print("Cell info display ");
				break;

				case 3:
				System.out.print("Welcome note ");
				break;

				case 4:
				System.out.print("Network selection ");
				break;

				case 5:
				System.out.print("Lights ");
				break;

				case 6:
				System.out.print("Confirm SIM service actions ");
				break;

				default:
				System.out.print("Update ");
				}
				
	
			break;

			case 3:

			String securitySettingEntry="""
			press any number to enter
			1.PIN code request
			2.Call barring service
			3.Fixed dialling
			4.Closed user group
			5.Phone security
			6.Change access codes
				""";
			System.out.print(securitySettingEntry);
				int securitySettings = input.nextInt();

				switch(securitySettings){
				case 1:
				System.out.print("PIN code request ");
				break;

				case 2:
				System.out.print("Call barring request ");
				break;

				case 3:
				System.out.print("Fixed dialling ");
				break;

				case 4:
				System.out.print("Closed user group ");
				break;

				case 5:
				System.out.print("Phone security ");
				break;

				case 6:
				System.out.print("Change access codes ");
				break;

				default:
				System.out.print("Update ");
				}

			break;

			case 4:
			System.out.print("Restore factory settings ");
			break;

			default:
			System.out.print("Update ");
			}

		break;
			
		case 7: 
		System.out.print("Call divert ");
		break;

		case 8: 
		System.out.print("Games ");
		break;
	
		case 9: 
		System.out.print("Calculators ");
		break;

		case 10: 
		System.out.print("Reminders ");
		break;
		case 11: 

		String clockEntry="""
		press any number to enter
		1.Alarm clock
		2.Clock settings
		3.Date setting
		4.Stop watch
		5.Countdown timer
		6.Auto update of data and time
				""";

		System.out.print(clockEntry);

			int clock = input.nextInt();

			switch(clock){
			case 1:
			System.out.print("Alarm clock ");
			break;

			case 2:
			System.out.print("Clock settings ");
			break;

			case 3:
			System.out.print("Date settings ");
			break;

			case 4:
			System.out.print("Stopwatch ");
			break;

			case 5:
			System.out.print("Countdown timer ");
			break;

			case 6:
			System.out.print("Auto update of date and time ");
			break;

			default:
			System.out.print("Update ");
			}

		break;
	
		case 12: 
		System.out.print("Profiles ");
		break;

		case 13: 
		System.out.print("SIM Services ");
		break;

		default: 
		System.out.print("Update ");
				
		}


	}


}
