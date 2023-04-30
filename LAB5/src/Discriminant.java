//Author's name:TIEW KAI RUO
//Matrix number:212682
//Lab No:5

import java.util.Scanner;
public class Discriminant {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner (System.in);
		
		//Prompt user to enter the values of a, b, and c
		System.out.println("Enter the value of a, b, c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//Calculate Discriminant
		double Discriminant = Math.pow(b, 2) - 4 * a * c;
		
		if (Discriminant > 0) {
			double root1 = (-b + Math.pow(Discriminant, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(Discriminant, 0.5)) / (2 * a);
			System.out.printf("The equation has two roots  %.5f and %.5f%n", root1, root2);
		
		 } else if (Discriminant == 0) {
			  double root = -b / (2*a);
			  System.out.printf("The equation has one root %.5f%n", root);
			  
	      }else {
			System.out.printf("The equation has no real root.");
				
	      }
	
	}

}
