//Author's name:TIEW KAI RUO
//Matrix number:212682
//Lab No:3

import java.util.Scanner;
public class Integer {
	
	public static void main(String[] args) {
		
	//Prompt user to enter the integer
	// TODO Auto-generated method stub
	Scanner reader = new Scanner(System.in);
	
	System.out.print("Enter an integer: ");
	int integer = reader.nextInt();
	
	if(integer % 2 == 0)
		System.out.println(integer + " is even number");
	else 
		System.out.println(integer + " is odd number");
			
	reader.close();
	}

}
