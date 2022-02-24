package strings;

public class Ex2 {

	public static String getImage(String input)
	{
		StringBuffer stb=new StringBuffer(input);
		stb=stb.reverse();
		String rev=new String(stb);
		return input+"|"+rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getImage("EARTH"));
	}

}
