//Author's name:TIEW KAI RUO
//Matrix number:212682
//Lab No:7

import java.util.InputMismatchException;
import java.util.Scanner;
public class StringManipulationSystem {

	public static void main(String[]args) {
	//TODO Auto-generated method stub
	program();

	}
	

public static void program() {	
try {

			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a string:");
			String str = sc.nextLine();
			System.out.println("1.A character at a specified index");
			System.out.println("2.Compare the string with a new string");
			System.out.println("3.Identify how many characters in the string.");
			System.out.println("4.Count the number of letters in the string.");
			System.out.println("5.Count the number of digits in the string.");
			System.out.println("6.Change any lowercase letter into uppercase letter and vice versa.");
			System.out.println("7.Replace any character in the string with a new character.");
			System.out.println("8.Delete any character or substring in the string.");
			System.out.println("9.Insert any character or string into the string.");
			
			System.out.print("Enter a choice:");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter and index:");
				int index = sc.nextInt();
				
				if(index>=0 && index <str.length()) {
					System.out.println("Character at index" + index + ":" + str.charAt(index));
				}
				else {
					System.out.println("Invalid index.");
				}
				break;
				
			case 2:
				System.out.print("Enter a new String:");
				String newStr = sc.nextLine();
				boolean isEqual = str.equals(newStr);
				System.out.print(isEqual);
				break;
				
			case 3:
				System.out.println("Length of the string:" + str.length());
				break;
				
			case 4:
				int letterCount = 0;
				for (int i= 0; i<str.length();i++) {
					char c = str.charAt(i);
					if (Character.isLetter(c)) {
						letterCount++;	
					}
				}
				System.out.println("Number of letters in the string:" + letterCount);
				break;
				
			case 5:
				int digitCount = 0;
				for (int i=0; i< str.length();i++) {
					char c = str.charAt(i);
					if (Character.isDigit(c)) {
	                digitCount++;
	                    }
	                }
	                System.out.println("Number of digits in the string: " + digitCount);
	                break;
	                
	            case 6:
	                StringBuilder sb = new StringBuilder(str);
	                for (int i = 0; i < sb.length(); i++) {
	                    char c = sb.charAt(i);
	                    if (Character.isUpperCase(c)) {
	                    sb.setCharAt(i, Character.toLowerCase(c));
	                        
	                  } else if (Character.isLowerCase(c)) {
	                    sb.setCharAt(i, Character.toUpperCase(c));
	                    }
	                 }
	                    System.out.println("String after case change: " + sb.toString());
	                    break;

	            case 7:
	            	System.out.print("Enter the character to replace: ");
	                char oldChar = sc.next().charAt(0);
	                System.out.print("Enter the new character: ");
	                char newChar = sc.next().charAt(0);
	                str = str.replace(oldChar, newChar);
	                System.out.println("String after replacement: " + str);
	                break;
	             
	            case 8:
	            	System.out.print("Enter the substring to delete: ");
	                String substringToDelete = sc.next();
	                str = str.replace(substringToDelete, "");
	                System.out.println("String after deletion: " + str);
	                break;

	            case 9:
		            System.out.println("Enter the character or string to insert");
		            String originalString = sc.next();
		            System.out.println("Enter a character or substring to delete: ");
		            String deleteString = sc.next();
		            str = str.replace(deleteString, "");
		            System.out.println(" "+ str);
		            break;
		            
		            default:System.out.println("Please choose option 1 unitl 9 after enter string:");
		            break;
			}
            }catch(InputMismatchException e) {
	        System.out.println("You enter wrong");
	        program();

			}
					
}
			
}

