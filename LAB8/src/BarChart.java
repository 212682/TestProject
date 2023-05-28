//Author's name:TIEW KAI RUO
//Matrix number:212682
//Lab No:8

import java.util.Scanner;

public class BarChart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int numStores = 5;
		    int[] sales = new int[numStores];

		    // Get today's sales for each store
		    
		    for (int i = 0; i < numStores; i++) {
		        System.out.print("Enter today's sales for Store " + (i + 1) + ": RM");
		        sales[i] = sc.nextInt();
		    }
		    sc.close();

		    // Display bar chart
		    System.out.println("\nSALES BAR CHART");
		    for (int i = 0; i < numStores; i++) {
		        System.out.print("Store " + (i + 1) + ": RM ");
		        for (int j = 0; j < sales[i] / 100; j++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    }
		}
}