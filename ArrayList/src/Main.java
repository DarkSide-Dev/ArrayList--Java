import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hot-Dog");
		
		food.set(0, "Popcorn");
//		food.remove(0);
//		food.clear();
		
		for(int i = 0; i<food.size(); i++) {
			
				System.out.println(food.get(i));
			
		}

	}

}
