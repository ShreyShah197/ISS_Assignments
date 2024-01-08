package javaBasics;

public class Java_Basics_3 {
	// local variable
    int myLocalVariable = 10;

    // static variable
    static int myStaticVariable = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myLocalVariable = 30;

	     // Access static variable
	     System.out.println(myStaticVariable);

	     // Access local variable within the same method
	     System.out.println(myLocalVariable);

	     // Access local variable from another method
	     Java_Basics_3 myObj = new Java_Basics_3();
	     System.out.println(myObj.myLocalVariable);

	}

}
