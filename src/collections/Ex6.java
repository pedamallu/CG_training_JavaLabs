package collections;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex6 {
	/**
	 * Create a method which accepts the id and the age of people as a Map and 
	 * decide if they are eligible for vote. A person is eligible for vote 
	 * if his age is greater than 18. Add the IDs of all the eligible persons 
	 * to list and return the list. 
	 * @param args
	 */
	public static List votersList (Map<Integer,Integer> map)
	{
		List<Integer> ans=new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> entry: map.entrySet())
		{
			if(LocalDate.now().getYear()-entry.getValue()>18)
				ans.add(entry.getKey());
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		hm.put(1, 2001);
		hm.put(2, 2005);
		hm.put(3, 2000);
		System.out.println(votersList(hm));
	}

}
