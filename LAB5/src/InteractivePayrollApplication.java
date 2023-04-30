//Author's name:TIEW KAI RUO
//Matrix number:212682
//Lab No:5

import java.util.Scanner;
public class InteractivePayrollApplication {
	
public static void main(String[] args) {
	//TODO Auto-generated method stub
		
		//TODO Auto-generated method stub
	    int PayRate = 0;
		
		Scanner input = new Scanner (System.in);
	
		//prompt user to enter Skill Level 
		System.out.println("Enter your Skill Level: ");
		int SkillLevel = input.nextInt();
		
		if (SkillLevel == 1)
			PayRate = 17;
		else if (SkillLevel ==2)
			PayRate = 20;
		else if (SkillLevel ==3)
			PayRate = 22;
		else 
			System.out.println("Error: Invalid Skill Level.");
		
		//prompt user to enter Total Working Hours and Calculate Overtime Pay
		if (SkillLevel > 0 && SkillLevel < 4) {
		System.out.println("Enter your Total Working Hours: ");
		int WorkHours = input.nextInt();
		double RegularPay = 0;
		double OvertimePay= 0;
		
		
		if (WorkHours <= 40 )
			RegularPay = WorkHours*PayRate;
			
		else 
			RegularPay = 40*PayRate;
		
		    OvertimePay = (WorkHours-40)*PayRate*1.5;
		    
	
		    
		 //Calculate Total Pay
		 double TotalPay = RegularPay + OvertimePay;
		 
		
	     //Prompt user to select the insurance and retirement options
	     final double MedicalIns = 32.50;
	     final double DentalIns = 20.00;
	     final double DisabillityIns = 10.00;
	     double RetirementPlan = TotalPay*0.03;
	 	 double Deductions = 0;	 
	 	 int Option = 0;
	 	 int numSelections = 0;
	 	 
	     if (SkillLevel == 2 || SkillLevel== 3)
	    	 do {
	    	 System.out.println("Would you like 1) Medical Insurance, 2) Dental Insurance. and/or 3) Disabillity Insurance? Press 0 to skip.");
	     	 Option = input.nextInt();
	     	 numSelections++;
	     	 
	     	 if (Option == 1)
	     		 Deductions += MedicalIns;
	     	 else if (Option == 2)
	     		 Deductions += DentalIns;
	     	 else if (Option == 3)
	     		 Deductions += DisabillityIns;
	     	 else if (Option == 0)
	     		 System.out.println("You have choosen to skip the insurance plan.");
	     	 else 
	     		 System.out.println("Error:Invalid Option.");
	     	 
	    	 } while (Option !=0 && numSelections < 3); 
	     
	     if (SkillLevel ==3)
	    	 System.out.println("Would you like to participate in the retirement plan? (Y/N)");
	          String RetirementYesOrNo = input.next();
	         if (RetirementYesOrNo == ("Y")) {
	         	Deductions += RetirementPlan;
	          System.out.println("You have chose to participate in the retirement plan.");
	         }else {
	        	 System.out.println("You have chose not to participate in the retirement plan.");
	         }
	         
	         
	       //Calculate the Net Pay
	       double NetPay = TotalPay - Deductions;
	       
	       //Display
	       System.out.println();
	       System.out.println("Total Working Hours: " +  WorkHours);
		   System.out.println("Hourly pay rate:RM " + PayRate);
	       System.out.println();
		   System.out.printf("Regular pay for 40 hours: RM%.2f%n", RegularPay);
		   System.out.printf("Overtime pay: RM%.2f%n", OvertimePay);
		   System.out.printf("Total pay: RM%.2f%n", TotalPay);
		   System.out.printf("Total Itemized Deductions : RM%.2f%n", Deductions);
		   System.out.printf("Net Pay : RM%.2f%n", NetPay);
		}	
		}		
	}

