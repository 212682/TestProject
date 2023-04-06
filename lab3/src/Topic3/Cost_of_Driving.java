//Author's name:Tiew Kai Ruo
//Matrix number:212682
//Lab No:3


package Topic3;
import java.util.Scanner;
public class Cost_of_Driving {

	public static void main(String[] args) {
	//Print the cost of driving
		
	Scanner sc = new Scanner(System.in);
	
	//Prompt user to enter the driving distance, miles per gallon and price per gallon
	System.out.print("Enter the driving distance:   ");
	double DrivingDistance = sc.nextDouble();
	
	System.out.print("Enter miles per gallon:   ");
	double MilesPerGallon = sc.nextDouble();
	
	System.out.print("Enter price per gallon:   ");
	double PricePerGallon = sc.nextDouble();
	
	double Cost_of_Driving = DrivingDistance/MilesPerGallon*PricePerGallon;
	System.out.println("The cost of driving is    RM" + String.format("%.2f",Cost_of_Driving));
	}
}
