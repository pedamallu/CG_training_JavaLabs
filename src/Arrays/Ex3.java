package Arrays;
import java.util.Arrays;
public class Ex3 {

	public static int[] getSorted(int[] arr)
	{
		String []tempArr=new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			StringBuilder str=new StringBuilder();
			str.append(arr[i]);
			tempArr[i]=str.reverse().toString();
			arr[i]=Integer.parseInt(tempArr[i]);
		}
		Arrays.sort(arr);
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {123,354,545,222};
		System.out.println(Arrays.toString(getSorted(arr)));
	}

}
