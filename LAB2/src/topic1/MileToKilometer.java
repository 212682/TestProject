//Author's name:Tiew Kai Ruo
//Matric number:212682
//Lab No:2


package topic1;

import java.util.Scanner;

public class MileToKilometer{
	public static void main(String[]args){
		// TODO Auto-generated method stub
		
		double kilo = 1.6;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("mile: ");
		int mile= sc.nextInt();
		
		
		
		double total = mile*kilo ;
		System.out.println(total);
		System.out.println("Total= " + String.format("%.2f", total));
		
			
	}

	
}
