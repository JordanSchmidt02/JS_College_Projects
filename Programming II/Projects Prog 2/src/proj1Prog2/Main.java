package proj1Prog2;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args)throws FileNotFoundException {
		
		
		//variables
		String firstName;
		String lastName;
		double payRate;
		int hoursWorked;
		double grossSalary = 0;
		double taxRate;
		double taxes;
		double netIncome;
		int numberOfEmployees;
		String employeeNumber;
		double checksTotal = 0;
		double taxesTotal = 0;
		double grossSalaryTotal = 0;
		//variables end
		
		
		
		//dialog box to read from the user the number of employees to process.
		//This number should be the same as the number of employees in the employees.txt file.
		employeeNumber = JOptionPane.showInputDialog("Enter the number of Employees:");
		numberOfEmployees = Integer.parseInt(employeeNumber);
		
		
		//read one employee at a time and compute their grossSalary(hoursWorked*payRate),
		//taxes (taxRate*grossSalary), and netIncome (grossSalary-taxes).
		//The programs should produce the payroll information to the output file named payroll.txt.
		//The program should use the following payRate table to compute taxes:
		Scanner inFile = new Scanner(new FileReader("Programming II\\Projects Prog 2\\src\\proj1Prog2\\employees.txt"));
		PrintWriter outFile = new PrintWriter("Programming II\\Projects Prog 2\\src\\proj1Prog2\\payroll.txt");
		//
		
		
		if (grossSalary <= 250) {
			taxRate = 0.18;
		}
		else if (grossSalary > 250 && grossSalary <= 550) {
			taxRate = 0.23;
		}
		else if (grossSalary > 550 && grossSalary <= 1100) {
			taxRate = 0.28;
		}
		else {
			taxRate = 0.33;
		}
		
		
		for (int i = 1; i <= 23; i++) {
			
		lastName = inFile.next();
		firstName = inFile.next();
		payRate = inFile.nextDouble();
		hoursWorked = inFile.nextInt();
		grossSalary = hoursWorked * payRate;
		taxes = taxRate * grossSalary;
		netIncome = grossSalary - taxes;
		
		checksTotal += netIncome;
		taxesTotal += taxes;
		grossSalaryTotal += grossSalary;
		
		outFile.println(String.format("First Name: %s", firstName));
		outFile.println(String.format("Last Name: %s", lastName));
		outFile.println(String.format("Pay Rate: $%,.2f", payRate));
		outFile.println(String.format("Hours Worked: ", hoursWorked));
		outFile.println(String.format("Gross Salary: $%,.2f", grossSalary));
		outFile.println(String.format("Taxes :$%,.2f", taxes));
		outFile.println(String.format("Net Income: $%,.2f", netIncome));
		outFile.println("---------------------------");
		}
		
		outFile.println("Number of Employees Processed: " + numberOfEmployees);
		outFile.println(String.format("Total Payroll: $%,.2f", grossSalaryTotal));
		outFile.println(String.format("Total Taxes: $%,.2f", taxesTotal));
		outFile.println(String.format("Payroll Checks Total: $%,.2f", checksTotal));
		
		outFile.flush();
		
		inFile.close();
		outFile.close();
		
	}
}
