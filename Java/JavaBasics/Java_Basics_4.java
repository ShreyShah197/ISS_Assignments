package javaBasics;

class MyEmployee{
    private int salary;
    private String name;
    public int id;
    String dept;  //Default modifier
    protected int manId; //protected modifier
    
    MyEmployee(int s,String n,int i,String d,int m){   //constructor
    	salary = s;
    	name = n;
    	id = i;
    	dept = d;
    	manId = m;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
    public void setSalary(int x){
        this.salary = x;
    }
    public int getSalary(){
        return salary;
    }
    public int getManId(){
        return manId;
    }
    public String getDept(){
        return dept;
    }
}

public class Java_Basics_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmployee shrey = new MyEmployee(500,"Atharva",2,"Development",1234);
		System.out.println(shrey.getName());
		System.out.println(shrey.getSalary());
		System.out.println(shrey.getId());
		System.out.println(shrey.getDept());
		System.out.println(shrey.getManId());
        // shrey.name = "Shrey"; --> Throws an error due to private access modifier
        shrey.setName("Shrey");
        shrey.setSalary(100000);
        System.out.println(shrey.getName());
        shrey.id = 1;
        System.out.println(shrey.getId());
        System.out.println(shrey.getSalary());
        
        final int MAX_VALUE = 100;     // final keyword
        System.out.println(MAX_VALUE);

	}

}
