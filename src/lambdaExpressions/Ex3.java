package lambdaExpressions;

import java.util.Scanner;

@FunctionalInterface
interface Validation{
	boolean checkCredentials(String userName,String password);
}

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//;ambda function implementation of Validation inrerface
		Validation authenticate=(String x,String y)->
		{
			//Hard coded the username && password for validation
			if(x.equals("user@123") && y.equals("pass@123"))
				return true;
			else
				return false;
		};
		//Take user input for username && password
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username:");
		String userName=sc.nextLine();
		System.out.println("Enter password:");
		String password=sc.nextLine();
	//call the lambda function
		System.out.println(authenticate.checkCredentials(userName, password));
	}

}
