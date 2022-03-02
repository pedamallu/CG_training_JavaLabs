package lambdaExpressions;

import java.util.function.Function;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,String> stringFormatter=(x)->{
			String ans="";
			for(int i=0;i<x.length();i++)
				ans+=Character.toString(x.charAt(i));
			return ans;
		};
		System.out.println(stringFormatter.apply("CG"));
	}

}
