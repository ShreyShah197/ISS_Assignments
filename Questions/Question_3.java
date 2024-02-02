package questions;
import java.util.*;



class Subject{
	String subject_name;
	int marks;
	
	 Subject(String subject_name, int marks){
		this.subject_name = subject_name;
		this.marks = marks;
	}
}

class Students implements Comparable<Students>{
	int Id;
	Subject[] AllSubjects= new Subject[3];
	
	Students(int Id,int maths,int science,int english) {
		this.Id = Id;
		AllSubjects[0] = new Subject("Maths",maths);
		
		AllSubjects[1] = new Subject("Science",science);
		
		AllSubjects[2] = new Subject("English",english);
		
		
		
	}
	@Override public int compareTo(Students s)
    {
        if (AllSubjects[0].marks > s.AllSubjects[0].marks) {
            return 1;
        }
        else if (AllSubjects[0].marks == s.AllSubjects[0].marks) {
            return 0;
        }
        else {
            return -1;
        }
    }
}

public class Question_3 {

	public static void main(String[] args) {
		 List<Students> studentInfo = new ArrayList<>();
		 studentInfo.add(new Students(1,66,78,45));
		 studentInfo.add(new Students(2,56,38,54));
		 studentInfo.add(new Students(3,93,54,65));
		 studentInfo.add(new Students(4,87,68,43));
		 studentInfo.add(new Students(5,45,48,68));
//		 Collections.sort(studentInfo);
		 Collections.sort(studentInfo, (s1, s2) -> s1.AllSubjects[0].marks - s2.AllSubjects[0].marks);
	      for (Students s : studentInfo) {
	            System.out.println("Id:"+ s.Id);
	            for(int i = 0;i<3;i++) {
	            	System.out.println(s.AllSubjects[i].subject_name + " Marks: " + s.AllSubjects[i].marks);
	            }
	        }

	}

}
