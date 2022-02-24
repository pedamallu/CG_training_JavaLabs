package Arrays;
import java.util.Arrays;
public class Ex2 {

	public static String[] sortStrings(String[] strings)
	{
		Arrays.sort(strings);
		for(int i=0;i<strings.length;i++)
		{
			if(i+1<=Math.ceil(strings.length/2.0))
				strings[i]=strings[i].toUpperCase();
			else
				strings[i]=strings[i].toLowerCase();
		}
		return strings;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings= {"Ant","Animal","Bat","Baloon","Aeroplane"};
		System.out.println(Arrays.toString(sortStrings(strings)));
	}

}
