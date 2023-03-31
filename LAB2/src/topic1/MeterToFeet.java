
//Author's name:Tiew Kai Ruo
//Matric number:212682
//Lab No:2



package topic1;
import java.util.Scanner;
public class MeterToFeet{
		public static void main(String[]args){
			// TODO Auto-generated method stub
			
			double meter = 3.2786 ;
			
			Scanner sc= new Scanner(System.in);
			System.out.print("meter: ");
			int feet= sc.nextInt();
			
			
			
			double total = meter*feet ;
			System.out.println(total);
			System.out.println("Total= " + String.format("%.3f", total));
			
			
			
		
		}
		
	
}

