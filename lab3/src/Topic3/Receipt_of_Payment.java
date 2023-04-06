//Author's name:Tiew Kai Ruo
//Matrix number:212682
//Lab No:3

package Topic3;
import java.util.Scanner;
public class Receipt_of_Payment {
	
	public static void main(String[] args) {
		//Print a receipt of payment 
		
	Scanner sc = new Scanner(System.in);
	
	String Item1 = "";

  
    String Item2 = "";
	
    
    
	//prompt user to put in the Name of Item 1 
	System.out.print("Item 1: ");
	Item1 = sc.nextLine();
	
	//prompt user to put in the Quantity of Item 1
	System.out.print("Quantity: ");
	double Quantity1 = sc.nextDouble();
	
	//prompt user to put in the Unit Price of Item 1
	System.out.print("Unit Price:RM ");
	double UnitPrice1 = sc.nextDouble();
	
	sc.nextLine();
	
	//prompt user to put in the Name of Item 2 
		System.out.print("Item 2: ");
		Item2 = sc.nextLine();
		
		//prompt user to put in the Quantity of Item 2
		System.out.print("Quantity: ");
		double Quantity2 = sc.nextDouble();
		
		//prompt user to put in the Unit Price of Item 2
		System.out.print("Unit Price:RM ");
		double UnitPrice2 = sc.nextDouble();
		
		double GovernmentTax = 0.06;
		double ServiceCharge = 0.1;
		double Amount1 = UnitPrice1*Quantity1;
		double Amount2 = UnitPrice2*Quantity2;
		double Subtotal = Amount1 + Amount2;
		double Total = Subtotal + Subtotal*GovernmentTax + Subtotal*ServiceCharge;
	
	System.out.println();
		
	System.out.println("Item 1: " + Item1);
    System.out.println("Quantity: " + Quantity1);
    System.out.println("Unit Price: " + String.format("%.2f",UnitPrice1));
    System.out.println("Amount:RM " + String.format("%.2f",Amount1));
    System.out.println();
    
	System.out.println("*****************************");
	
	System.out.println();
	
	System.out.println("Item 2: " + Item2);
    System.out.println("Quantity: " + Quantity2);
    System.out.println("Unit Price:RM " + String.format("%.2f",UnitPrice2));
    System.out.println("Amount:RM " + String.format("%.2f",Amount2));

    System.out.println();
    
    System.out.println("Subtotal:RM " + Subtotal);
    System.out.println("Goverment Tax:RM " + String.format("%.2f",Subtotal*GovernmentTax));
    System.out.println("ServiceCharge:RM " + String.format("%.2f",Subtotal*ServiceCharge));
    
    System.out.println();
    
    System.out.println("Total:RM " + String.format("%.2f",Total));
    
    sc.close();

	}

}
