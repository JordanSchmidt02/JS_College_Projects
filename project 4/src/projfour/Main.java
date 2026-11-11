//name: Jordan Schmidt
//date: 12/17/21
//cids 161
//this project contains: tax rates

package projfour;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//variables
		Scanner scanner = new Scanner (System.in);
		String name;
		double proptax;
		double propval;
		double taxableamt;
		final double taxrate = 1.05;
		final double taxperc = .92;
		//variables end
		
		System.out.println("What is your name?");
		name = scanner.nextLine();
		System.out.println("What is the value of your property?");
		propval = scanner.nextDouble();
		taxableamt = propval * taxperc;
		proptax = Math.floor(taxableamt/100 * taxrate);
		System.out.printf("Property Tax Report For:%15s", name);
		System.out.println();
		System.out.printf("Assessed Value:%14s$", "");
		System.out.printf("%12s0", propval);
		System.out.println();
		System.out.printf("Taxable Amount:%14s$", "");
		System.out.printf("%11s0", taxableamt);
		System.out.println();
		System.out.printf("Tax Rate for each $100.00:%3s$", "");
		System.out.printf("%8s", taxrate);
		System.out.println();
		System.out.printf("Property Tax:%16s$", "");
		System.out.printf("%9s0", proptax);
		
	}
}
