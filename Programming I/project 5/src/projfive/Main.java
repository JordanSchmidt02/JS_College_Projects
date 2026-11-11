//Name: Jordan Schmidt
//Date: 12/17/21
//CIDS 161
//This project contains: phone bill project

package projfive;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//variables
		int accountnum;
		String servicetype;
		int daymins = 0;
		int nightmins = 0;
		int mins = 0;
		double totalcost = 0;
		Scanner scanner = new Scanner (System.in);
		//variables end
		
		
		System.out.println("Enter the account number:");
		accountnum = scanner.nextInt();
		System.out.println();
		System.out.println("Enter the service type: regular or premium:");
		servicetype = scanner.next();
		if(!servicetype.equalsIgnoreCase("premium") && !(servicetype.equalsIgnoreCase("regular"))) {
			System.out.println("INVALID SERVICE TYPE"); 
			return;
		}
		


		
		if (servicetype.equalsIgnoreCase("premium")){
			System.out.println("Enter the daytime minutes used:");
			daymins = scanner.nextInt();
		
				
			System.out.println();
			System.out.println("Enter the nighttime minutes used:");
			nightmins = scanner.nextInt();
			totalcost += 25;
			if(daymins > 75) {
				totalcost +=  (daymins - 75) * 0.1;
				
			}
			if(nightmins > 100) {
				totalcost +=  (nightmins - 100) * 0.05;
			}
			System.out.println("Account Number: " + accountnum);
			System.out.println("Service Type: " + servicetype);
			System.out.println("Minutes Service Used (Day): " + daymins);
			System.out.println("Minutes Service Used (Night): " + nightmins);
			System.out.printf("Amount Due: $%.2f", totalcost);
			
		}
		else if (servicetype.equalsIgnoreCase("regular")) {
			System.out.println("Enter the number of minutes service used:");
			mins = scanner.nextInt();
			totalcost += 10;
			if(mins > 50) {
				totalcost += (mins - 50) * 0.2;
			}
			System.out.println("Account Number: " + accountnum);
			System.out.println("Service Type: " + servicetype);
			System.out.println("Minutes Service Used: " + mins);
			System.out.printf("Amount Due: $%.2f", totalcost);
			
		}
		
	scanner.close();
		
		
		
		
		
		
		
		
	}

}
