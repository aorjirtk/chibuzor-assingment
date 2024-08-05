import java.util.Arrays;
import java.util.Scanner;
public class StudentsGradesReal{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the number of students: ");
   int totalStudent = input.nextInt();
   System.out.print("Enter the number of subjects: ");
   int totalSubject = input.nextInt();
   int[][] scores = new int [totalStudent][totalSubject];
   int[] student = new int [totalStudent];
   int[] sum = new int[totalStudent];
   double[] average = new double[totalStudent];
   int[] newArray = new int[totalStudent];
	
	for(int index = 0,counter=1; index < totalStudent; counter++, index++){
	      int total = 0;
	   for(int count = 0, element = 1; count < totalSubject; count++, element++){
	      System.out.print("Enter the scores for student"+counter+"\nsubect"+element+": " );
	      scores[index][count] = input.nextInt();
	      total += scores[index][count];
	  }
	sum[index] = total;
	newArray[index] = total;
	average[index] = total/totalSubject;
	
       }
      Arrays.sort(newArray);
      int[] position = new int[sum.length];
      for(int count1 = 0; count1 < sum.length; count1++){
	 for(int index1 = 0; index1 < sum.length; index1++){
	    if(sum[count1] == newArray[index1])position[count1] = sum.length - index1;
         }
      }

      System.out.print("STUDENT ");
      for(int index = 1; index <= totalSubject; index++){
         System.out.printf("%10s%d", "SUB", index);
      }
      System.out.printf("%10s%10s%10s%n", "TOTAL", "AVERAGE ", "POSITION");
      for(int index = 0,counter =1; index < totalSubject; index++,counter++){
         System.out.print("Student"+counter);
         for(int count = 0; count < totalSubject; count++){
             System.out.printf("%11d",scores[index][count]);
         }
	 System.out.printf("%8d%9.2f", sum[index], average[index]);
	 System.out.println();
      }
   }
}
	