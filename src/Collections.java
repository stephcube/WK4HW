import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		List<String> students = new ArrayList<String>();
		
		students.add("Rob");
		students.add("Rob");
		
		for (String student : students) {
		System.out.println(student);
		}
		
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alabama");
		states.add("Alaska");
		states.add("Oklahoma");
		states.add("Arizona");
		
		for (String state: states) {
		System.out.println(state); }
	{
	
	Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
	racerPlacements.put(1, "Tommy");
	racerPlacements.put(2, "Sally");
	racerPlacements.put(3, "John");
	
	System.out.println(racerPlacements.get(1));
	
	racerPlacements.remove(1);
	
	Set<Integer> racerKeys = racerPlacements.keySet();
	for (Integer key : racerKeys) {
		System.out.println(key + " : " + racerPlacements.get(key));
		
			}
		}
	}
}

	





