package collection;
import java.util.*; 
class Student_set implements Comparable<Student_set> {
	   
    Integer marks;
 
    Student_set(Integer marks) { this.marks = marks; }
 
   
    public String toString() { return (" " + this.marks); }
 

    public int compareTo(Student_set stu)
    {
        return this.marks.compareTo(stu.marks);
    }
}
public class SetOperations {
	public static void main(String args[]){
	    HashSet<Student_set> set=new HashSet<>();
	   
	    set.add(new Student_set(500));
        set.add(new Student_set(300));
        set.add(new Student_set(400));
        set.add(new Student_set(100));
        set.add(new Student_set(200));
        System.out.println(set);
        TreeSet<Student_set> tree_set = new TreeSet<>(set);
        System.out.println(tree_set);
	    
	    LinkedHashSet<String> setobj=new LinkedHashSet<>();
	    setobj.add("Pasta");
	    setobj.add("Pizza");
	    setobj.add("Sushi");
	    setobj.add("Pan");
	    setobj.add("ice");

	    Iterator<String> itr=setobj.iterator();
	    while(itr.hasNext()){
	      System.out.println(itr.next());
	    }
	  }
}
