import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
	
		List<String> sports = new ArrayList<String>();
		sports.add("Wresting");
		sports.add("Soccer");
		sports.add("Football");
		
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		

	}

}
