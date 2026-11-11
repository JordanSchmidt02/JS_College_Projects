package myMathPackage;

import java.util.Scanner;

/*  
Name: Jordan Schmidt
Course: CSIS 161 Programming  I 
Date: 12/16/21  

This program calculates the area of many math shapes including...etc  
*/  
 
public class myMath  {  
	public static void main(String[] arg) {  
		
		//variables
		Scanner scanner = new Scanner (System.in);
		int sides;
		float radius;
		float tbase;
		float theight;
		float tside2;
		float tside;
		float shortside;
		float longside;
		
		//variables end
		
		//ask the user to enter values to these variables  
		//do the calculation //output the result  
		
		while(true) {
			System.out.println("How many sides does this shape have? ");
			sides = scanner.nextInt();
			if(sides == 1) {
				System.out.println("What is the radius?");
				radius = scanner.nextFloat();
				System.out.println( "a=" + Math.PI * radius * radius);
				System.out.println( "p=" + Math.PI * 2 * radius);
			} else if(sides == 3) {
				System.out.println("What are the base, height, and two other sides?");
				tbase = scanner.nextFloat();
				theight = scanner.nextFloat();
				tside2 = scanner.nextFloat();
				tside = scanner.nextFloat();
				System.out.println( "a=" + (tbase * theight) / 2  );
				System.out.println( "p=" + tbase + tside + tside2);
			} else if(sides == 4) {
				System.out.println( "What are the lengths of the short and long sides?");
				shortside = scanner.nextFloat();
				longside = scanner.nextFloat();
				System.out.println("a=" + shortside * longside);
				System.out.println("p=" + (shortside + shortside + longside + longside));
			}
			
		scanner.close();	
			
		}
		
	} //end of main method  
 
}//end of the class myMath  