package topic1;
import java.util.Scanner;

public class Integer {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int product = 1;
        product*=number%10;
        number/=10;
        product*=number%10;
        number/=10;
        product*=number%10;
        System.out.println("The multiplication of all digits is:" + (product));
        
        //Author's name:Tiew Kai Ruo
		//Matric number:212682
		//Lab No:2
		

	}

}
