package questions;
import java.util.*;
class Subjecta{
	String name;
	int Id;
	
	 Subjecta(String name, int Id){
		this.name = name;
		this.Id = Id;
	}
}
class Studenta{
	int Id;
	int age;
	String name;
	Studenta(int Id,int age,String name){
		this.Id = Id;
		this.age = age;
		this.name = name;
	}
}
public class Question_6 {

	public static void main(String[] args) {
		Map<Studenta,List<Subject>> mp = new HashMap<>();
		Studenta s1 = new Studenta(1,23,"Shrey");
//		Studenta s2 = new Studenta(2,"Shrey","Pune");
		

	}

}
