package egPackage;
import egPackage.Employee;
public class Company {
	
	public void payEmployee(Employee e) {
	      e.mailCheck();
	   }

	public static void main(String[] args) {
		Company iss = new Company();
		Employee e = new Employee();
	    iss.payEmployee(e);

	}

}
