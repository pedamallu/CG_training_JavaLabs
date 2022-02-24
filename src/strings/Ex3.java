package strings;

public class Ex3 {

	public static String alterString(String input)
	{
		String ans="";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='A'|| input.charAt(i)=='E'|| input.charAt(i)=='I' || input.charAt(i)=='O' || input.charAt(i)=='U')
				ans+=input.charAt(i);
			else
				ans+=(char)( (int)input.charAt(i)+1);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(alterString("JAVA"));
	}

}
