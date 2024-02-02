package questions;

class ParentClass {
   void parentMethod() {
        System.out.println("This is parent class method");
    }
}

class BaseClass extends ParentClass {
	
    void baseMethod() {
        System.out.println("this is base class method");
    }
}

public class Question_1 {

	public static void main(String[] args) {
		 BaseClass obj = new BaseClass();
	        obj.parentMethod();
	        obj.baseMethod();

	}

}
