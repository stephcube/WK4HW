import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenClassAndQuiz {

	public static void main(String[] args) {
		  List<String> sports = new ArrayList<String>();
          sports.add("Wresting");
          sports.add("Soccer");
          sports.add("Football");
          sports.add("Hockey");
          sports.add("Basketball");
     
      List<String> newList = new ArrayList<>();
      for(int i = 0; i < sports.size(); i++) {
          if ( i % 2 == 1 ) {
              newList.add(sports.get(i).toString());
          }
      }
      System.out.println("The old list is: " + sports);
      System.out.println("The new list is: " + newList);

      List<String> names = new ArrayList<String>();

      names.add("Stephanie");

      names.add("Lucas");

      names.add("Pete");
      
      System.out.println(names);
      
      Map<String, String> dictionary = new HashMap<String, String>();

      dictionary.put("Apple", "Round fruit with thin red or green skin and crisp flesh");
      dictionary.put("Avocado", "Pear-shaped fruit with a rough leathery skin, smooth oily edible flesh, and a large stone.");
      dictionary.put("Apricot", "A juicy, soft fruit, resembling a small peach, of an orange-yellow color.");

 
      System.out.println(dictionary);
    }
	}


