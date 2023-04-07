//Author's name:TIEW KAI RUO
//Matrix number:212682
//Lab No:3

import java.util.InputMismatchException;
import java.util.Scanner;
public class Compare_the_Cost {
	
	public static void main(String[] args) {
			
	//Compare the cost of two different packages of rice
	
	try {
	Scanner sc = new Scanner(System.in);
		
	//Prompt user to enter the weight and price for first package 
	System.out.print("Enter weight and price for package 1:  ");
	double Weight_1 = sc.nextDouble(); 
	double Price_1 = sc.nextDouble();
	
	////Prompt user to enter the weight and price for second package
	System.out.print("Enter weight and price for package 2:  ");
	double Weight_2 = sc.nextDouble(); 
	double Price_2 = sc.nextDouble();
	
	if (Price_1 / Weight_1 < Price_2 / Weight_2) //first process
		System.out.println("Package 1 has a better price.");
	else if (Price_1 / Weight_1 > Price_2 / Weight_2) // second process
		System.out.println("Package 2 has a better price.");
	else //third process
		System.out.println("Two packages have the same price.");
	
	sc.close();
	}
	catch (InputMismatchException e){
		System.out.println("Input is mismtach, please enter correct number");
		
		}
	}
}
