package exception;
import java.io.*;

class RemoteException extends Exception {
	   private double amount;
	   
	   public RemoteException(double amount) {
	      this.amount = amount;
	   }
	   
	   public double getAmount() {
	      return amount;
	   }
	}
public class ErrorCode {
	
	 public void deposit(double amount) throws RemoteException {
	      throw new RemoteException(amount);
	   }

	public static void main(String[] args) {
		int num[] = {9, 5, 23, 66};
	      System.out.println(num[6]);
	      int a[] = new int[4];
	      try {
	          
	          System.out.println("Access element :" + a[7]);
	       } catch (ArrayIndexOutOfBoundsException e) {
	          System.out.println("Exception:" + e);
	       }finally {
	          a[0] = 6;
	          System.out.println("First element value: " + a[0]);
	          System.out.println("The finally statement is executed");
	       }
	       System.out.println("Out of the block");

	}

}
