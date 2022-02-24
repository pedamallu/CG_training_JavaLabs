package exceptionHandling;

import java.util.Scanner;

import exceptionHandling.eis.EmployeeException;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary: ");
		int salary=sc.nextInt();
		try {
			if(salary<3000)// throws exception if salary is less than 3000
				throw new EmployeeException("Salary should not be less than 3000");
			System.out.println("Salary is not less than 3000");
		}catch (EmployeeException e) {// handles only Employee exception
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
