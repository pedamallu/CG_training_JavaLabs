package exceptionHandling;
import java.util.Scanner;
class AgeException extends Exception
{
	public AgeException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		try {
		if(age<16)
			throw new AgeException("should be above 15");
		System.out.println("Age is valid");
		}catch(AgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
