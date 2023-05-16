//Author's name:TIEW KAI RUO
//Matrix number:212682
//Lab No:7

import java.util.Scanner;
public class StudentMajor {

	public static void main(String[]args) {
		
			Scanner in = new Scanner(System.in);
		
		//Prompt user to input the first character and the second character number
		System.out.println("I:Information Systems  C:Computer Science  A:Accounting");
		System.out.println("1:freshman  2:sophomore  3:junior 4:senior");
		System.out.println("Enter a character according to your major and a number that indicates your student status:");
		String year = in.next();
		
		char major = Character.toUpperCase(year.charAt(0));
		char status = year.charAt(1);
		
		String majorName = "";
		String statusName = "";
		
		if (major=='I'||major=='C'||major=='A')
		{
		
			switch(major) 
			{
			case 'I':
				majorName = "Information Systems";
				break;
			
			case 'C':
				majorName = "Computer Science";
				break;
				
			case 'A':
				majorName = "Accounting";
				break;
			
			default:
				break;
						
			}
			
			switch(status)
			{
			case'1':
			 statusName = "Freshman";
			 break;
			 
			case'2':
			 statusName = "Sophomore";
			 break;
			 
			case'3':
			 statusName = "Junior";
			 break;
			
			case'4':
			 statusName = "Senior";
			 break;
		
			}
			System.out.printf("%s %s %n",majorName, statusName);
		}
		
		  else {
	            System.out.printf("Invalid input.%n");
		  	}
	        }
	     
	}