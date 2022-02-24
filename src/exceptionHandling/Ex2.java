package exceptionHandling;

import java.util.Scanner;

class NameException extends Exception //Custom exception, arises when Name is blank
{
	public NameException(String msg)
	{
		super(msg);
	}
}
public class Ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name");
		String firstName=sc.nextLine()+" ";
		System.out.println("Enter Last name");
		String lastName=sc.nextLine();
		try {
			if(firstName=="" && lastName=="")
				throw new NameException("Both first name and last name can't be blank.");
			System.out.println("Name is "+firstName+lastName);
		}catch (NameException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
