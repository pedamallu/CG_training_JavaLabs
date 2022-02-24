package FlowControl_Operators;

public class Ex7 {

	public static boolean checkNumber(int n) {
		int unit_digit=n%10;
		n=n/10;
		while(n!=0)
		{
			if(unit_digit<n%10)
				return false;
			unit_digit=n%10;
			n=n/10;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkNumber(134468));
	}

}
