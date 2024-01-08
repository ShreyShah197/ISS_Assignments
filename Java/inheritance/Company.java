package inheritance;

class Department {                     //parent class
    private String name;
    private int employeeCount;

    public Department(String name, int employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    public void displayDetails() {
        System.out.println("Department Name: " + name);
        System.out.println("Number of Employees: " + employeeCount);
    }
}

class HRDepartment extends Department {          // base class
    public HRDepartment(int employeeCount) {
        super("HR", employeeCount);
    }

    public void conductInterviews() {
        System.out.println("Conducting interviews for new candidates.");
    }
}

class ITDepartment extends Department {             //base class
    public ITDepartment(int employeeCount) {
        super("IT", employeeCount);
    }

    public void setCred() {
        System.out.println("Setting Credentials for new employee.");
    }
}

public class Company {
	
	public static void main(String[] args) {
		HRDepartment hr = new HRDepartment(5);
        ITDepartment it = new ITDepartment(10);
        hr.displayDetails();
        hr.conductInterviews();

        it.displayDetails();
        it.setCred();
	}

}
