//Author's name:TIEW KAI RUO
//Matrix number:212682
//Lab No:5

import java.util.Scanner;
public class NotesDenomination {
	
	public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter Malaysia Ringgit amount: ");
	        int amount = sc.nextInt();

	        int RM50 = amount / 50;
	        int RM20 = (amount % 50) / 20;
	        int RM10 = ((amount % 50) % 20) / 10;
	        int RM5 = (((amount % 50) % 20) % 10) / 5;
	        int RM1 = (((amount % 50) % 20) % 10) % 5;

	        System.out.println("Number of RM50 bills: " + RM50);
	        System.out.println("Number of RM20 bills: " + RM20);
	        System.out.println("Number of RM10 bills: " + RM10);
	        System.out.println("Number of RM5 bills: " + RM5);
	        System.out.println("Number of RM1 bills: " + RM1);
	
	

	}
}

