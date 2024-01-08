package javaBasics;

class Employee{
    int id; //instance variable-1
    int salary; //instance variable-2
    String name; //instance variable-3
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){   //Method
        return salary;
    }
}

public class Java_Basics_1{

	public static void main(String[] args) {
		Employee shrey = new Employee(); // Instantiating a new Employee Object
        Employee aju = new Employee(); // Instantiating a new Employee Object
        
        // Setting Attributes for Shrey
        shrey.id = 12;
        shrey.salary = 34;
        shrey.name = "Shrey";

        // Setting Attributes for Aju
        aju.id = 17;
        aju.salary = 12;
        aju.name = "Aju Joshi";

        // Printing the Attributes
        shrey.printDetails();
        aju.printDetails();
        int salary = shrey.getSalary();
        System.out.println(salary);

	}

}
