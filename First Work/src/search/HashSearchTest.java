package search;

import java.util.HashMap;

public class HashSearchTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Park", "cool");
		map.put("Jeon", "good");
		map.put("Na", "power");
		map.put("Lee", "good");
	
		System.out.println(map.get("Park"));
		System.out.println(map.get("Jeon"));
		System.out.println(map.get("Na"));
		System.out.println(map.get("Lee"));
		
	}

}
