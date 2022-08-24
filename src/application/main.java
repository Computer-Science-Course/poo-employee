package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Employee employee = new Employee();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Name:");
		employee.setName(scanner.nextLine());
		
		System.out.print("Gross salary:");
		employee.setGrossSalary(scanner.nextDouble());
		
		System.out.print("Tax:");
		employee.setTax(scanner.nextDouble());
		
		employee.printStatus();
		System.out.print("Which percentage to increase salary?");
		employee.increaseSalary(scanner.nextDouble());
		
		employee.printStatus();
		scanner.close();
		

	}

}
