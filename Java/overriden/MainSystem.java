package overriden;

class MsgNotification {
	   public void notification(){
	      System.out.println("This is notification given by message text");
	   }
	}

class EmailNotification extends MsgNotification {
	   public void notification(){
	      System.out.println("This is notification given by email");
	   }
	}

public class MainSystem {

	public static void main(String[] args) {
		 MsgNotification user_1 = new MsgNotification();   
		 EmailNotification user_2 = new EmailNotification();   

	      user_1.notification();   
	      user_2.notification(); 
	}
}
