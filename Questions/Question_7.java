package questions;
import java.util.*;
import java.util.stream.Collectors;
class A {
    int id;
    int marks;
    String subject;

     A(int id, int marks, String subject) {
        this.id = id;
        this.marks = marks;
        this.subject = subject;
    }
}

public class Question_7 {

	public static void main(String[] args) {
		List<A> list_A = new ArrayList<>();
		list_A.add(new A(1, 70, "Math"));
		list_A.add(new A(2, 55, "Science"));
		list_A.add(new A(3, 80, "English"));
		list_A.add(new A(4, 65, "Arts"));
		list_A.add(new A(5, 45, "Geography"));
		 List<A> filtered_list = list_A.stream().filter(a -> a.marks > 60).collect(Collectors.toList());
		 for(A obj : filtered_list) {
			 System.out.println("Id: " + obj.id + ", Marks: " + obj.marks + ", Subject: " + obj.subject);
		 }
		
	}

}
