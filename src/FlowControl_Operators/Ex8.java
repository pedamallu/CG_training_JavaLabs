package FlowControl_Operators;

public class Ex8 {
	
	public static boolean checkNumber (int n)
	{
		if((n&(n-1))!=0)
			return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkNumber(4));
	}

}
