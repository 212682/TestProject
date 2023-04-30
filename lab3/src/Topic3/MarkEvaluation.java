 //Author's name:Tiew Kai Ruo
//Matrix number:212682
//Lab No:3

package Topic3;
import java.util.Scanner;
public class MarkEvaluation {
	
	public static void main(String[] args) {
		//Print Mark Evaluation 
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("                                         COMPUTER PROGRAMMING I (CSC3100)                                       ");
	System.out.println();
	System.out.println("*******************************************MARKS EVALUATION APPLICATION*****************************************");
	System.out.println("PLEASE ENTER MARKS:-");
	
	System.out.println();	
	
	//prompt user to put in the FIRST TEST MARK
	System.out.print("FIRST TEST:");
	double FirstTest = sc.nextDouble();
	
	//prompt user to put in the SECOND TEST MARK
	System.out.print("SECOND TEST:");
	double SecondTest = sc.nextDouble();
	
	System.out.println();
	
	//prompt user to put in the ASSIGNMENTS MARK
	System.out.print("ASSIGNMENT 1:");
	double Assignment1 = sc.nextDouble();
	
	System.out.print("ASSIGNMENT 2:");
	double Assignment2 = sc.nextDouble();
	
	System.out.print("ASSIGNMENT 3:");
	double Assignment3 = sc.nextDouble();
	
	System.out.println();
	
	//prompt user to put in the FINAL EXAMINATION MARK
	System.out.print("FINAL EXAMINATION:");
	double FinalExam = sc.nextDouble();
	
	System.out.println();
	
	System.out.println("CALCULATED MARKS:");
	
	//Calculate the Mark Percentage of each evaluation
	double First_Test_Percentage = FirstTest*20/50;
	double Second_Test_Percentage = SecondTest*20/50;
	double Total_Assignment = Assignment1 + Assignment2 + Assignment3;
	double Total_Assignment_Percentage = Total_Assignment*30/90;
	double Final_Exam_Percentage = FinalExam*30/100;
	double Total_Marks = First_Test_Percentage + Second_Test_Percentage + Total_Assignment_Percentage + Final_Exam_Percentage;
			
	//Display the Marks and Marks Percentage for each evaluation including the Total Marks
	System.out.println();
	System.out.println("FIRST TEST\tSECOND TEST\tASS 1\tASS 2\tASS 3\tASSIGNMENT SUB-TOTAL\tFINAL EXAMINATION\tTOTAL\n");
	
	System.out.println("___________________________________________________________________________________________________________________");
	System.out.println();
	
	System.out.printf("%.1f (%.2f%%)\t%.1f (%.2f%%)\t%.1f\t%.1f\t%.1f\t\t%.1f (%.2f%%)\t%.1f (%.2f%%)\t\t%.2f%%",
		     FirstTest, First_Test_Percentage, SecondTest, Second_Test_Percentage, Assignment1, Assignment2, Assignment3,Total_Assignment,Total_Assignment_Percentage,
		     FinalExam, Final_Exam_Percentage, Total_Marks);
	}
	

}
