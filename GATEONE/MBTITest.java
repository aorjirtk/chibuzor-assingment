import java.util.Arrays;
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
   String[] judging= new String[5];
   String[] judgingB = new String[5];

	int index = 0;
	int count = 0;
	int index2 = 0;
	int count1 = 0;
	int index3 = 0;
	int count2 = 0;
	int index4 = 0;
	int count3 = 0;

extrovert[0] = "P"; 
while(!extrovert[0].equalsIgnoreCase("A") && !extrovert[0].equalsIgnoreCase("B")){

   System.out.printf("%n%s%s%s\t%s%s","1.","A.","expend energy, enjoy groups,", "B.","conserve energy, enjoy one-one-one: ");
   extrovert[0] = input.nextLine();

if(!extrovert[0].equalsIgnoreCase("A") && !extrovert[0].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");

     if(extrovert[0].equalsIgnoreCase("A"))
	extrovertB[0] = "expend energy, enjoy groups";
     
     if(extrovert[0].equalsIgnoreCase("B"))
	extrovertB[0] = "conserve energy, enjoy one-one-one";
	
	
     }


sensing[0] = "P"; 
while(!sensing[0].equalsIgnoreCase("A") && !sensing[0].equalsIgnoreCase("B")){
   System.out.printf("%n%s%s%s\t%s%s","2.","A.", "Interpret literally,", "B.","look for meaning and possibilities: ");
   sensing[0] = input.nextLine();

if(!sensing[0].equalsIgnoreCase("A") && !sensing[0].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");

     if(sensing[0].equalsIgnoreCase("A"))
	sensingB[0] = "Interpret literally";
     
     if(sensing[0].equalsIgnoreCase("B"))
	sensingB[0] = "look for meaning and possibilities";
     
}

thinking[0] = "P"; 
while(!thinking[0].equalsIgnoreCase("A") && !thinking[0].equalsIgnoreCase("B")){
   System.out.printf("%n%s%s%s\t%s%s","3.","A.", "logical,thinking, questioning", "B.","empathetical, feeling, accomodating: ");
   thinking[0] = input.nextLine();
if(!thinking[0].equalsIgnoreCase("A") && !thinking[0].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(thinking[0].equalsIgnoreCase("A"))
	thinkingB[0] = "logical,thinking, questioning";
     
     if(thinking[0].equalsIgnoreCase("B"))
	thinkingB[0] = "empathetical, feeling, accomodating";
     
}


judging[0] = "P"; 
while(!judging[0].equalsIgnoreCase("A") && !judging[0].equalsIgnoreCase("B")){
   System.out.printf("%n%s%s%s\t%s%s","4.","A.", "organized, orderly", "B.","flexible, adaptable: ");
   judging[0] = input.nextLine();
if(!judging[0].equalsIgnoreCase("A") && !judging[0].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(judging[0].equalsIgnoreCase("A"))
	judgingB[0] = "organized, orderly";
     
     if(judging[0].equalsIgnoreCase("B"))
	judgingB[0] = "flexible, adaptable";
     
}

extrovert[1] = "P"; 
while(!extrovert[1].equalsIgnoreCase("A") && !extrovert[1].equalsIgnoreCase("B")){
   System.out.printf("%n%s%s%s\t%s%s","5.","A.", "more outgoing, think out loud","B.", "more reserved, think to yourself: ");
   extrovert[1] = input.nextLine();
if(!extrovert[1].equalsIgnoreCase("A") && !extrovert[1].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(extrovert[1].equalsIgnoreCase("A"))
	extrovertB[1] = "more outgoing, think out loud";
     
     if(extrovert[1].equalsIgnoreCase("B"))
	extrovertB[1] = "more reserved, think to yourself";
     
}

sensing[1] = "P"; 
while(!sensing[1].equalsIgnoreCase("A") && !sensing[1].equalsIgnoreCase("B")){

   System.out.printf("%n%s%s%s\t%s%s","6.","A.", "practical, realistic, experiental","B.", "imaginative, innotative, theoretical: ");
   sensing[1] = input.nextLine();
if(!sensing[1].equalsIgnoreCase("A") && !sensing[1].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(sensing[1].equalsIgnoreCase("A"))
	sensingB[1] = "practical, realistic, experiental";
     
     if(sensing[1].equalsIgnoreCase("B"))
	sensingB[1] = "imaginative, innotative, theoretical";
     
}

thinking[1] = "P"; 
while(!thinking[1].equalsIgnoreCase("A") && !thinking[1].equalsIgnoreCase("B")){
   System.out.printf("%n%s%s%s\t%s%s","7.","A.", "candid, straight forward, frank", "B.","tactful, kind, encouraging: ");
   thinking[1] = input.nextLine();

if(!thinking[1].equalsIgnoreCase("A") && !thinking[1].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(thinking[1].equalsIgnoreCase("A"))
	thinkingB[1] = "candid, straight forward, frank";
     
     if(thinking[1].equalsIgnoreCase("B"))
	thinkingB[1] = "tactful, kind, encouraging";
     
}


judging[1] = "P"; 
while(!judging[1].equalsIgnoreCase("A") && !judging[1].equalsIgnoreCase("B")){
   System.out.printf("%n%s%s%s\t%s%s","8.","A.", "plan, schedule", "B.","unplanned, spontaneous: ");
   judging[1] = input.nextLine();

if(!judging[1].equalsIgnoreCase("A") && !judging[1].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(judging[1].equalsIgnoreCase("A"))
	judgingB[1] = "plan, schedule";
     
     if(judging[1].equalsIgnoreCase("B"))
	judgingB[1] = "unplanned, spontaneous";
     
}

extrovert[2] = "P"; 
while(!extrovert[2].equalsIgnoreCase("A") && !extrovert[2].equalsIgnoreCase("B")){

   System.out.printf("%n%s%s%s\t%s%s","9.","A.", "seek many tasks, public activities,interaction with others","B.", "seek private, solitary activities with quiet to concentrate: ");
   extrovert[2] = input.nextLine();

if(!extrovert[2].equalsIgnoreCase("A") && !extrovert[2].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(extrovert[2].equalsIgnoreCase("A"))
	extrovertB[2] = "seek many tasks, public activities,interaction with others";
     
     if(extrovert[2].equalsIgnoreCase("B"))
	extrovertB[2] = "seek private, solitary activities with quiet to concentrate";
     
}

sensing[2] = "P"; 
while(!sensing[2].equalsIgnoreCase("A") && !sensing[2].equalsIgnoreCase("B")){
   System.out.printf("%n%s%s%s\t%s%s","10.","A.", "standard, usual, conventional", "B.","different, novel, unique: ");
   sensing[2] = input.nextLine();
if(!sensing[2].equalsIgnoreCase("A") && !sensing[2].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(sensing[2].equalsIgnoreCase("A"))
	sensingB[2] = "standard, usual, conventional";
     
     if(sensing[2].equalsIgnoreCase("B"))
	sensingB[2] = "different, novel, unique";
     
}

thinking[2] = "P"; 
while(!thinking[2].equalsIgnoreCase("A") && !thinking[2].equalsIgnoreCase("B")){

   System.out.printf("%n%s%s%s\t%s%s","11.","A.", "firm, tend to criticize, hold the line","B.", "gentle, tend to appreciate, conciliate: ");
   thinking[2] = input.nextLine();
if(!thinking[2].equalsIgnoreCase("A") && !thinking[2].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(thinking[2].equalsIgnoreCase("A"))
	thinkingB[2] = "firm, tend to criticize, hold the line";
     
     if(thinking[2].equalsIgnoreCase("B")){
	thinkingB[2] = "gentle, tend to appreciate, conciliate";
}

judging[2] = "P"; 
while(!judging[2].equalsIgnoreCase("A") && !judging[2].equalsIgnoreCase("B")){
   System.out.printf("%s%s%s\t%s%s","12.", "A.","regulated, structured", "B.","easy-going,live and let live: ");
   judging[2] = input.nextLine();
if(!judging[2].equalsIgnoreCase("A") && !judging[2].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(judging[2].equalsIgnoreCase("A"))
	judgingB[2] = "regulated, structured";
     
     if(judging[2].equalsIgnoreCase("B"))
	judgingB[2] = "easy-going,live and let live";
     
}

extrovert[3] = "P"; 
while(!extrovert[3].equalsIgnoreCase("A") && !extrovert[3].equalsIgnoreCase("B")){
   System.out.printf("%s%s%s\t%s%s","13.", "A.","external, communicative, express yourself","B.", "internal, reticent, keep to yourself: ");
   extrovert[3] = input.nextLine();
if(!extrovert[3].equalsIgnoreCase("A") && !extrovert[3].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(extrovert[3].equalsIgnoreCase("A"))
	extrovertB[3] = "external, communicative, express yourself";
     
     if(extrovert[3].equalsIgnoreCase("B"))
	extrovertB[3] = "internal, reticent, keep to yourself";
   }  

sensing[3] = "P"; 
while(!sensing[3].equalsIgnoreCase("A") && !sensing[3].equalsIgnoreCase("B")){
   System.out.printf("%s%s%s\t%s%s","14.","A.", "focus on here-and-now", "B.","look to the future,global perspective, big picture: ");
   sensing[3] = input.nextLine();
if(!sensing[3].equalsIgnoreCase("A") && !sensing[3].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");

     if(sensing[3].equalsIgnoreCase("A"))
	sensingB[3] = "focus on here-and-now";
     
     if(sensing[3].equalsIgnoreCase("B"))
	sensingB[3] = "look to the future,global perspective, big picture";
     
}


thinking[3] = "P"; 
while(!thinking[3].equalsIgnoreCase("A") && !thinking[3].equalsIgnoreCase("B")){
   System.out.printf("%s%s%s\t%s%s","15.","A", "tough-minded, just","B", "tender-hearted, merciful: ");
   thinking[3] = input.nextLine();
if(!thinking[3].equalsIgnoreCase("A") && !thinking[3].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(thinking[3].equalsIgnoreCase("A"))
	thinkingB[3] = "tough-minded, just";
     
     if(thinking[3].equalsIgnoreCase("B"))
	thinkingB[3] = "tender-hearted, merciful";
}
judging[3] = "P"; 
while(!judging[3].equalsIgnoreCase("A") && !judging[3].equalsIgnoreCase("B")){
   System.out.printf("%s%s%s\t%s%s","16.", "A.","preparation, plan ahead", "B.","go with the flow, adapt as you go: ");
   judging[3] = input.nextLine();
if(!judging[3].equalsIgnoreCase("A") && !judging[3].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(judging[3].equalsIgnoreCase("A"))
	judgingB[3] = "preparation, plan ahead";
     
     if(judging[3].equalsIgnoreCase("B"))
	judgingB[3] = "go with the flow, adapt as you go";
     
}
extrovert[4] = "P"; 
while(!extrovert[4].equalsIgnoreCase("A") && !extrovert[4].equalsIgnoreCase("B")){
   System.out.printf("%s%s%s\t%s%s","17.","A.", "active, initiate", "B.","reflective, deliberate: ");
   extrovert[4] = input.nextLine();
if(!extrovert[4].equalsIgnoreCase("A") && !extrovert[4].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(extrovert[4].equalsIgnoreCase("A"))
	extrovertB[4] = "active, initiate";
     
     if(extrovert[4].equalsIgnoreCase("B"))
	extrovertB[4] = "reflective, deliberate";
}
sensing[4] = "P"; 
while(!sensing[4].equalsIgnoreCase("A") && !sensing[4].equalsIgnoreCase("B")){
   System.out.printf("%s%s%s\t%s%s","18.", "A.","facts, things, what is","B.", "ideas, dreams, what could be,philosophical: ");
   sensing[4] = input.nextLine();
if(!sensing[4].equalsIgnoreCase("A") && !sensing[4].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(sensing[4].equalsIgnoreCase("A"))
	sensingB[4] = "facts, things, what is";
     
     if(sensing[4].equalsIgnoreCase("B"))
	sensingB[4] = "ideas, dreams, what could be,philosophical";

}
thinking[4] = "P"; 
while(!thinking[4].equalsIgnoreCase("A") && !thinking[4].equalsIgnoreCase("B")){
   System.out.printf("%s%s%s\t%s%s","19.","A.", "matter of fact, issue-oriented","B.", "sensitive, people-oriented, compassionate: ");
   thinking[4] = input.nextLine();
if(!thinking[4].equalsIgnoreCase("A") && !thinking[4].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(thinking[4].equalsIgnoreCase("A"))
	thinkingB[4] = "matter of fact, issue-oriented";
     
     if(thinking[4].equalsIgnoreCase("B"))
	thinkingB[4] = "sensitive, people-oriented, compassionate";
     

}
judging[4] = "P"; 
while(!judging[4].equalsIgnoreCase("A") && !judging[4].equalsIgnoreCase("B")){
   System.out.printf("%s%s%s\t%s%s","20.","A.", "control, govern","B.", "latitude, freedom: ");
   judging[4] = input.nextLine();
if(!judging[4].equalsIgnoreCase("A") && !judging[4].equalsIgnoreCase("B"))
System.out.printf("%n%s%n%s","Expected A or B as Response", "I know this an error, pls try again");
     if(judging[4].equalsIgnoreCase("A"))
	judgingB[4] = "control, govern";
     
     if(judging[4].equalsIgnoreCase("B"))
	judgingB[4] = "latitude, freedom";
     

}

System.out.printf("%s%s%s","Hello ",name, ",you selected");
System.out.println();
for(int index1 = 0; index1 < extrovert.length; index1++){
    System.out.printf("%s\t%s%n",extrovert[index1],extrovertB[index1]);
	if(extrovert[index1].equalsIgnoreCase("A")){
		index++;
}

}
System.out.println("Number of A selected: "+index);
count = sensing.length - index;
System.out.println("Number of B selected: "+count);
System.out.println();


for(int index1 = 0; index1 < sensing.length; index1++){
    System.out.printf("%s\t%s%n",sensing[index1],sensingB[index1]);
	if(sensing[index1].equalsIgnoreCase("A")){
		index2++;
}

}
System.out.println("Number of A selected: "+index2);
count1 = sensing.length - index2;
System.out.println("Number of B selected: "+count1);
System.out.println();

for(int index1 = 0; index1 < sensing.length; index1++){
    System.out.printf("%s\t%s%n",thinking[index1],thinkingB[index1]);
	if(thinking[index1].equalsIgnoreCase("A")){
		index3++;
}

}
System.out.println("Number of A selected: "+index3);
count2 = thinking.length - index3;
System.out.println("Number of B selected: "+count2);
System.out.println();

for(int index1 = 0; index1 < judging.length; index1++){
    System.out.printf("%s\t%s%n",judging[index1],judgingB[index1]);
	if(judging[index1].equalsIgnoreCase("A")){
		index4++;
}

}
System.out.println("Number of A selected: "+index4);
count3 = judging.length - index4;
System.out.println("Number of B selected: "+count3);
System.out.println();
}
}
}
