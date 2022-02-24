package collections;
import java.util.HashMap;
import java.util.Map;

public class Ex4 {
	/**
	 * school offers medals to the students of tenth based on the following criteria 
		If(Marks>=90) : Gold 
		If(Marks between 80 and 90) : Silver 
		If(Marks between 70 and 80) : Bronze 
		Note: Marks between 80 and 90 means marks>=80 and marks<90 
	 * @param args
	 */
	public static HashMap<String, String> getStudents(HashMap<String,Integer> hm)
	{
		HashMap<String, String> ans=new HashMap<String, String>();
		for(Map.Entry<String, Integer> entry:hm.entrySet())
		{
			String regNo=entry.getKey();
			if(entry.getValue()>=90)
				ans.put(regNo, "Gold");
			else if(entry.getValue()>=80 && entry.getValue()<90)
				ans.put(regNo, "Silver");
			else if(entry.getValue()>=70 && entry.getValue()<80)
				ans.put(regNo, "Bronze");
			else
				ans.put(regNo, "No medal");
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("101",45);
		hm.put("102",95);
		hm.put("103",49);
		hm.put("104",75);
		hm.put("105",85);
		System.out.println(getStudents(hm));
	}

}
