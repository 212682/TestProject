//Author's name:Tiew Kai Ruo
//Matric number:212682
//Lab No:2
		
package topic1;
import java.util.Scanner;
public class RetailSale {
	
	public static void main(String[] args) {
		// Calculate the retail price and sales tax for the purchase
		
		Scanner input = new Scanner(System.in);
		
		// prompt user to put in the retail price 
		System.out.print("Retail Price(RM): ");
		double RetailPrice = input.nextDouble();
		
		// prompt user to put in the Sales Tax Rate
		System.out.print("Sales Tax Rate(%): ");
		double SaleTaxRate = input.nextDouble();
		

		double SaleTax = RetailPrice * SaleTaxRate/100;
		double TotalSale = RetailPrice + RetailPrice * SaleTaxRate/100;
			
		System.out.println("Sales Tax is RM" + String.format("%.2f",SaleTax ));
		
		System.out.println("Total Sale is RM" + String.format("%.2f",TotalSale));	
		
	}

}
