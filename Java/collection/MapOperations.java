package collection;
import java.util.*;
class Student{
	int Id;
	String name;
	public Student(int i,String n) {
		Id = i;
		name = n;
	}
}

public class MapOperations {
	static Map<String, Integer> map = new HashMap<>();
	 public static void sortbykey()
	    {
	       
	        TreeMap<String, Integer> sorted = new TreeMap<>();
	        sorted.putAll(map);
	        for (Map.Entry<String, Integer> entry : sorted.entrySet()) 
	            System.out.println(entry.getKey() + ":"+ entry.getValue());        
	    }
	public static void main(String args[]){
		
		map.put("45", 80);
        map.put("32", 90);
        map.put("1", 80);
        map.put("12", 75);
        map.put("23", 40);
        sortbykey();
	    TreeMap<Integer, String> hmap = new TreeMap<>();

	    
	    hmap.put(101, "Chaitanya");
	    hmap.put(105, "Deven");
	    hmap.put(111, "Adi");
	    hmap.put(120, "Aju");
	    hmap.put(120, "Shrey");
	    System.out.println(hmap);
	    for (Map.Entry<Integer,String> me : 
            hmap.entrySet()) { 
 
           System.out.print(me.getKey() + ":"); 
           System.out.println(me.getValue()); 
       } 
	}
}
