//Author's name:TIEW KAI RUO
//Matrix number:212682
//Lab No:8

import java.util.Scanner;
public class SumUntilInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		//Prompt user to enter an integer
		System.out.println("Enter a positive non-zero integer:");
		int Integer = sc.nextInt();
	    
	    while (Integer <= 0) {
	    	System.out.println("Invalid input. The integer must be positive and non-zero.");
	    	Integer = sc.nextInt();
	    }
	    
	    sc.close();
	    
	    //Calculate the sum 
	    int sum = 0;
        for (int i = 1; i <= Integer; i++) {
            sum += i;
        }

        {
        // Display the result
        System.out.println("The sum of all integers from 1 to " + Integer + " is: " + sum);
        }
	}
}
