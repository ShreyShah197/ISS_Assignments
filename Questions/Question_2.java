package questions;
class MainClass {
    private void parentMethod() {
        System.out.println("This is parent class private method which cannot be override by base class");
    }
    public void ovveridefunction() {
    	parentMethod();
    }
}

class ChildClass extends MainClass {
//	@Override
//	private void parentMethod() {}
    void baseMethod() {
        System.out.println("this is base class method");
    }
}
public class Question_2 {
	public static void main(String[] args) {
		MainClass obj = new MainClass();
		obj.ovveridefunction();
	}
}
