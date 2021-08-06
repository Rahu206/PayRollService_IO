package com.bridgelabz.FileIO.employee_payrole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	private List<EmployeePayrollData> employeePayrollList;

	public EmployeePayrollService() {
		this.employeePayrollList = new ArrayList<>();
	}

	/**
	 * This is the main method which is use to call reading and writing data
	 * method
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.readingData();
		employeePayrollService.writingData();
	}

	/**
	 * This method is use to take employee details from console
	 * and add to the employee payroll list.
	 */
	private void readingData() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int id = input.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = input.next();
		input.nextLine();
		System.out.println("Enter Employee Salary: ");
		int salary = input.nextInt();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
		input.close();
	}
	
	/**
	 * This method prints Employee details on the console
	 */
	private void writingData() {
		System.out.println(employeePayrollList);

	}
}