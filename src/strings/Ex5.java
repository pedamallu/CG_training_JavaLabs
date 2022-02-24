package strings;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int chars=line.length(),words=line.split(" ").length,lines=1;
		while (scanner.hasNextLine()) {
	      if(line.length()==0)
			break;
		  line = scanner.nextLine();
		  System.out.println(line.length());
		  // process the line
		  lines+=1;
		  chars+=line.length();
		  words+=line.split(" ").length;
		}
		System.out.println("Characters:"+chars);
		System.out.println("Words:"+words);
		System.out.println("Lines:"+lines);
		scanner.close();
	}

}
