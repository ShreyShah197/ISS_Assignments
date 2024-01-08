package polymorphism;

class MainClient{
	   private String name;
	   private String address;
	   private int number;

	   public MainClient(String name, String address, int number) {
	      System.out.println("Employee Constructor");
	      this.name = name;
	      this.address = address;
	      this.number = number;
	   }

	   public void mailCheck() {
	      System.out.println("Mailing a check to " + this.name + " " + this.address);
	   }

	   public String getAddress() {
	      return address;
	   }

	   public void setAddress(String newAddress) {
	      address = newAddress;
	   }

	}
class MicroClient extends MainClient {
	   private double salary; // Annual salary
	   
	   public MicroClient(String name, String address, int number, double salary) {
	      super(name, address, number);
	      setSalary(salary);
	   }
	   
	   public void mailCheck() {
	      System.out.println("Within mailCheck of Salary class ");
	      System.out.println("Mailing check to "+ " with salary " + salary);
	   }
	   
	   public double getSalary() {
	      return salary;
	   }
	   
	   public void setSalary(double newSalary) {
	      if(newSalary >= 0.0) {
	         salary = newSalary;
	      }
	   }
	 
	}

public class Server{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClient s = new MainClient("Shrey Shah", "Mumbai, MH", 3);
	    MicroClient e = new MicroClient("Vanita Shah", "Surat, GUJ", 2, 2400);
	    System.out.println("Call mailCheck using Salary reference --");   
	    s.mailCheck();
	    System.out.println("Call mailCheck using Employee reference--");
	    e.mailCheck();
	}

}
