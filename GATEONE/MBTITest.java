import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  

public class MBTITest{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("What is your name: ");
   String name = input.nextLine();
   String[] extrovert = new String[5];
   String[] extrovertB = new String[5];
   String[] sensing= new String[5];
   String[] sensingB = new String[5];
   String[] thinking= new String[5];
   String[] thinkingB = new String[5];



   System.out.print("1. "expend energy, enjoy groups", "conserve energy, enjoy one-one-one":");
   extrovert[0] = input.nextLine();
     if(extrovert[0].equalsIgnoreCase("A")){
	extrovertB[0] = "expend energy, enjoy groups";
     }else
     if(extrovert[0].equalsIgnoreCase("B")){
	extrovertB[0] = "conserve energy, enjoy one-one-one";
     }


   System.out.print("5. "more outgoing, think out loud", "more reserved, think to yourself":");
   extrovert[1] = input.nextLine();
     if(extrovert[1].equalsIgnoreCase("A")){
	extrovertB[1] = "more outgoing, think out loud";
     }else
     if(extrovert[1].equalsIgnoreCase("B")){
	extrovertB[1] = "more reserved, think to yourself";
     }

   System.out.print("9. "seek many tasks, public activities,interaction with others", "seek private, solitary activities with quiet to concentrate":");
   extrovert[2] = input.nextLine();
     if(extrovert[2].equalsIgnoreCase("A")){
	extrovertB[2] = "seek many tasks, public activities,interaction with others";
     }else
     if(extrovert[2].equalsIgnoreCase("B")){
	extrovertB[2] = "seek private, solitary activities with quiet to concentrate";
     }

   System.out.print("13. "external, communicative, express yourself", "internal, reticent, keep to yourself":");
   extrovert[3] = input.nextLine();
     if(extrovert[3].equalsIgnoreCase("A")){
	extrovertB[3] = "external, communicative, express yourself";
     }else
     if(extrovert[3].equalsIgnoreCase("B")){
	extrovertB[3] = "internal, reticent, keep to yourself";
     }

   System.out.print("17. "active, initiate", "reflective, deliberate":");
   extrovert[4] = input.nextLine();
     if(extrovert[4].equalsIgnoreCase("A")){
	extrovertB[4] = "active, initiate";
     }else
     if(extrovert[4].equalsIgnoreCase("B")){
	extrovertB[4] = "reflective, deliberate";
     }




   System.out.print("2. "Interpret literally", "look for meaning and possibilities":");
   sensing[0] = input.nextLine();
     if(sensing[0].equalsIgnoreCase("A")){
	sensingB[0] = "Interpret literally";
     }else
     if(sensing[0].equalsIgnoreCase("B")){
	sensingB[0] = "look for meaning and possibilities";
     }

   System.out.print("6. "practical, realistic, experiental", "imaginative, innotative, theoretical":");
   sensing[1] = input.nextLine();
     if(sensing[1].equalsIgnoreCase("A")){
	sensingB[1] = "practical, realistic, experiental";
     }else
     if(sensing[1].equalsIgnoreCase("B")){
	sensingB[1] = "imaginative, innotative, theoretical";
     }

   System.out.print("10. "standard, usual, conventional", "different, novel, unique":");
   sensing[2] = input.nextLine();
     if(sensing[2].equalsIgnoreCase("A")){
	sensingB[2] = "standard, usual, conventional";
     }else
     if(sensing[2].equalsIgnoreCase("B")){
	sensingB[2] = "different, novel, unique";
     }


   System.out.print("14. "focus on here-and-now", "look to the future,global perspective, big picture":");
   sensing[3] = input.nextLine();
     if(sensing[3].equalsIgnoreCase("A")){
	sensingB[3] = "focus on here-and-now";
     }else
     if(sensing[3].equalsIgnoreCase("B")){
	sensingB[3] = "look to the future,global perspective, big picture";
     }

   System.out.print("18. "facts, things, what is", "ideas, dreams, what could be,philosophical":");
   sensing[4] = input.nextLine();
     if(sensing[4].equalsIgnoreCase("A")){
	sensingB[4] = "facts, things, what is";
     }else
     if(sensing[4].equalsIgnoreCase("B")){
	sensingB[4] = "ideas, dreams, what could be,philosophical";
     }


   System.out.print("3. "logical,thinking, questioning", "empathetical, feeling, accomodating":");
   thinking[0] = input.nextLine();
     if(thinking[0].equalsIgnoreCase("A")){
	thinkingB[0] = "logical,thinking, questioning";
     }else
     if(thinking[0].equalsIgnoreCase("B")){
	thinkingB[0] = "empathetical, feeling, accomodating";
     }

   System.out.print("7. "candid, straight forward, frank", "tactful, kind, encouraging":");
   thinking[1] = input.nextLine();
     if(thinking[1].equalsIgnoreCase("A")){
	thinkingB[1] = "candid, straight forward, frank";
     }else
     if(thinking[1].equalsIgnoreCase("B")){
	thinkingB[1] = "tactful, kind, encouraging";
     }

   System.out.print(".11 "firm, tend to criticize, hold the line", "gentle, tend to appreciate, conciliate":");
   thinking[2] = input.nextLine();
     if(thinking[2].equalsIgnoreCase("A")){
	thinkingB[2] = "firm, tend to criticize, hold the line";
     }else
     if(thinking[2].equalsIgnoreCase("B")){
	thinkingB[2] = "gentle, tend to appreciate, conciliate";
     }
   System.out.print(".15 "tough-minded, just", "tender-hearted, merciful":");
   thinking[3] = input.nextLine();
     if(thinking[3].equalsIgnoreCase("A")){
	thinkingB[3] = "tough-minded, just";
     }else
     if(thinking[3].equalsIgnoreCase("B")){
	thinkingB[3] = "tender-hearted, merciful";
     }


   System.out.print(".19 "matter of fact, issue-oriented", "sensitive, people-oriented, compassionate":");
   thinking[4] = input.nextLine();
     if(thinking[4].equalsIgnoreCase("A")){
	thinkingB[4] = "matter of fact, issue-oriented";
     }else
     if(thinking[4].equalsIgnoreCase("B")){
	thinkingB[4] = "sensitive, people-oriented, compassionate";
     }



}
}