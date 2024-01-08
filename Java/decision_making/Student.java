package decision_making;

public class Student {

	public static void main(String[] args) {
		int age = 16;
		if (age>18) {                                      // if-else
			System.out.println("You are in college");
		}
		else if (age>=15 && age<=18) {
		     System.out.println("You are in Junior college");
		}
		else if(age<=15 && age>=8) {
			System.out.println("You are in School");
		}
		else {
			System.out.println("You are in Kindergarden");
		}
		
//		String var = "Shrey";           //Switch-Case
//		switch (var) {
//            case "Shubham" -> {
//                System.out.println("You are going to be in A dept");
//            }
//            case "Shrey" -> {
//            	System.out.println("You are going to be in B dept");
//            }
//            case "Aria" -> {
//            	System.out.println("You are going to be in C dept");
//            }
//            default -> {
//            	System.out.println("You are not alloted in any dept");
//            }
//        }

	}

}
