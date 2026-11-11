/****************************************************************
* Title: CS 161 PA1
* Author: Jordan Schmidt
* jordan.schmidt@my.uwrf.edu
* Created: 12/16/21
* Modified: 12/16/21
* Description: declaring variables and printing lines
****************************************************************/
package pa1;

public class PrintInfo {
	public static void main(String[] args) {
		
		//variables
		String state = "Wisconsin"; //name of the state
		String country = "United States";
		int population = 5813568;
		int y2018 = 2018;
		int y2010 = 2010;
		int y1996 = 1996;
		int y1936 = 1936;
		double p223 = 2.23;
		double p4 = 4;
		double p765 = 7.65;
		double p5 = 5;
		String capital = "Madison";
		String city = "Milwaukee";
		String village = "Couderay";
		int county = 72;
		int t114 = 114;
		int t55 = -55;
		//variables
		
		 System.out.println( state + " is a U.S. state located in the north-central "+ country + ". The state is known as 'America's  " );
		 System.out.println( "Dairyland' because it is one of the nation's leading dairy producers. The United States Census");
		 System.out.println( "Bureau estimates that the population of Wisconsin was " + population + " on July 1, " + y2018 + " a " + p223 + "% increase since");
		 System.out.println( "the " + y2010 + " United States Census. \n ");
		 System.out.println("The state capital is " + capital + ", and its largest city is " + city + ", which is located on the western shore of");
		 System.out.println("Lake Michigan. The state is divided into " + county + " counties \n");
		 System.out.println( state + "  experiences temperature extremes characteristic of its continental climate, with cold winters \n"
		 		+ "and hot summers. The highest temperature ever recorded in the state was in the Wisconsin Dells, on July " );
		 System.out.println("13, " + y1936 + ", where it reached " + t114 + " F. The lowest temperature ever recorded in Wisconsin was in the village" );
		 System.out.println("of " + village + ", where it reached " + t55 + " F on both February 2 and 4, " + y1996 + ".\n" );
		 System.out.println( state + " collects personal income taxes (based on five income brackets) which range from " + p4 + "% to" );
		 System.out.println( p765 + "%. The state sales and use tax rate is " + p5 + "%.");
	// ...etc
	}//end of main
}//end of class