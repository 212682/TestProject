//Author's name:TIEW KAI RUO
//Matrix number:212682
//Lab No:9

import java.util.Scanner;
public class InchesToMeter {

	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Inches\tCentimeters");
      
		 for (int i=1; i<=11; i++) {
			 double centimeters = i*2.54;
			 System.out.println(i+ "\t" + centimeters);
		 }
	 }

}
