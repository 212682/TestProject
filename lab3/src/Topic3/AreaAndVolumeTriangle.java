//Author's name:Tiew Kai Ruo
//Matrix number:212682
//Lab No:3

package Topic3;
import java.util.Scanner;
public class AreaAndVolumeTriangle {
	
	//print area and volume of the triangle
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the base value:");
	int BaseValue = sc.nextInt();
	System.out.print("Enter the height value:");
	int HeightValue = sc.nextInt();
	
	System.out.println();
	
	double Area = 0.5*BaseValue*HeightValue;
	System.out.println("The area of a triangle is " + Area + " cm^2");
	
	System.out.println();
	
	System.out.print("Enter the length value:");
	int LengthValue = sc.nextInt();
	
	System.out.println();

	double Volume = Area*LengthValue;
	System.out.println("The volume of a triangle is " + Volume +" cm^2");
	
	}
}
