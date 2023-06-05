//Author's name:TIEW KAI RUO
//Matrix number:212682
//Lab No:9

import java.util.Scanner;
public class CelciusAndFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Celcius\tFahreheit\t|\tFahrenheit\tCelcius");
		
		
		for(int celcius=0, fahrenheit=0; celcius<= 100 && fahrenheit<=270; celcius++, fahrenheit++) {
		double Fahrenheit = (celcius*1.8) + 32;
	    double Celcius = (fahrenheit-32)/ 1.8;
		
	    System.out.printf("%d\t%.3f\t\t|\t%d\t\t%.3f%n", celcius, Fahrenheit, fahrenheit, Celcius);
	}
  }
 }


