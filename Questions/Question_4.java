package questions;

import java.util.*;

class Subjects{
	String subject_name;
	int marks;
	
	 Subjects(String subject_name, int marks){
		this.subject_name = subject_name;
		this.marks = marks;
	}
}
class Student{
	int Id;
	int age;
	String name;
	Student(int Id,int age,String name){
		this.Id = Id;
		this.age = age;
		this.name = name;
	}
}

public class Question_4 {

	public static void main(String[] args) {
		Map<Student,List<Subject>> mp = new HashMap<>();
		Student s1 = new Student(1,23,"Shrey");
		List<Subject> lists1 = new ArrayList<>();
		lists1.add(new Subject("Maths",22));
		lists1.add(new Subject("Science",28));
		lists1.add(new Subject("English",21));
		Student s2 = new Student(2,24,"Aditya");
		List<Subject> lists2 = new ArrayList<>();
		lists2.add(new Subject("Maths",24));
		lists2.add(new Subject("Science",21));
		lists2.add(new Subject("English",26));
		Student s3 = new Student(1,22,"Ankush");
		List<Subject> lists3 = new ArrayList<>();
		lists3.add(new Subject("Maths",18));
		lists3.add(new Subject("Science",22));
		lists3.add(new Subject("English",17));
		mp.put(s1,lists1);
		mp.put(s2,lists2);
		mp.put(s3,lists3);
		for (Map.Entry<Student,List<Subject>> me : 
            mp.entrySet()) {
			System.out.println("ID:" + me.getKey().Id + ", Age:" +me.getKey().age + ", Name:" +me.getKey().name);
			for(int i = 0;i<me.getValue().size();i++) {
				System.out.println("Subject name: "+me.getValue().get(i).subject_name+", Marks: "+me.getValue().get(i).marks);
			}
		}
		

	}

}
