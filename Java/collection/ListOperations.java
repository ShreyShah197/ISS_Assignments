package collection;
import java.util.*;
class Students implements Comparable<Students>{
	int Id;
	String name;
	Students(int i,String n) {
		Id = i;
		name = n;
	}
	@Override public int compareTo(Students s)
    {
        if (Id > s.Id) {
            return 1;
        }
        else if (Id == s.Id) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
public class ListOperations {
	
	public static void main(String[] args) {
		  List<Integer> Id = new ArrayList<>();
	      Id.add(1);
	      Id.add(2);
	      Id.add(3);      
	      System.out.println(" ArrayList Elements");
	      System.out.println(Id);
	      List<String> names = new LinkedList<>();
	      names.add("Shrey");
	      names.add("Aju");
	      names.add("Aryan");      
	      System.out.println(" LinkedList Elements");
	      System.out.println(names);
	      Collections.sort(names);
	      System.out.println(names);
	      
	      Id.remove(1);
	      
	      System.out.println(Id);
	      names.add(0, "Adi");
	      System.out.println(names);
	      Students s1 = new Students(3,"Shrey");
	      Students s2 = new Students(4,"Ketan");
	      Students s3 = new Students(1,"Anya");
	      Students s4 = new Students(2,"Aira");
	      Students s5 = new Students(5,"aju");
	      Students[] studs = new Students[] { s1,s2,s3,s4,s5 };
	      System.out.println(studs[0].Id);
	      List<Students> studentInfo = new LinkedList<>();
	      studentInfo.add(s1);	
	      studentInfo.add(s2);
	      studentInfo.add(s3);
	      studentInfo.add(s4);
	      studentInfo.add(s5);
	      Collections.sort(studentInfo);
	      for (Students s : studentInfo) {
	            System.out.println(s.Id + " " + s.name);
	        }
	}

}
