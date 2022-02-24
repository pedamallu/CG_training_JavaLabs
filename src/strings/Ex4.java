package strings;

public class Ex4 {

	public static int modifyNumber (int number1)
	{
		String num=Integer.toString(number1);
		int ans=0;
		for(int i=0;i<num.length()-1;i++)
			ans=ans*10+Math.abs((num.charAt(i)-'0')-(num.charAt(i+1)-'0'));
		return ans*10+number1%10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(modifyNumber(45862));
	}

}
