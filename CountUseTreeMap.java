package testthu;

import java.util.TreeMap;

public class CountUseTreeMap {
	public static void main(String[] args) {
		String paragraph ="Lorem sit dolor sit amet consectetur amet sit";
		String[] array = paragraph.toUpperCase().split("\\s");
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		for(int i=0; i<array.length; i++) {
			if (map.containsKey(array[i])) {
				int value = map.get(array[i])+1;
				map.put(array[i], value);
			} else {
				map.put(array[i], 1);
			}
		}
		
		System.out.println(map);
		
		for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
	}
}


