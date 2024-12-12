/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		
		Employee emin = new Employee(6942, "Emin", "Gharibian", 54987);
		emin.employeeToString();
		
		michael.raiseSalary(5);
		jim.raiseSalary(4);
		dwight.raiseSalary(3);
		pam.raiseSalary(4);
		emin.raiseSalary(7);
		
		System.out.println("------------------------------");
		System.out.println("Michael makes "+michael.getSalary()+" a month after their raise. \nJim makes "+jim.getSalary()+" a month after their raise. \nDwight makes "+dwight.getSalary()+" a month after their raise. \nPam makes "+pam.getSalary()+" a month after their raise. \nEmin makes "+emin.getSalary()+" a month after their raise.");
		System.out.println("------------------------------");
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("Michael makes "+michael.getAnnualSalary()+" a year after their raise. \nJim makes "+jim.getAnnualSalary()+" a year after their raise. \nDwight makes "+dwight.getAnnualSalary()+" a year after their raise. \nPam makes "+pam.getAnnualSalary()+" a year after their raise. \nEmin makes "+emin.getAnnualSalary()+" a year after their raise.");
		System.out.println("------------------------------");
	}
}
