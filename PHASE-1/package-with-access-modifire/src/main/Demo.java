package main;

import abc.Developer;
import abc.Employee;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		
		System.out.println("Employee");
		emp1.displayEmpInfo();
		
		System.out.println("Devloper");
		Developer emp2 = new Developer();
		emp2.disMgrInfo();

	}

}
