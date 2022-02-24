package strings;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp="1 2 22 11";
		String[]list=inp.split(" ");
		int sum=0;
		for(String item:list)
		{
			sum+=Integer.parseInt(item);
			//System.out.println(item);
		}
		System.out.println(sum);
	}

}
