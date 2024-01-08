package synchronization;

class Call {
	   public void CallCount() {
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter"  + i );
	         }
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	   }
	}

class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   Call  c;

	   ThreadDemo( String name,  Call c) {
	      threadName = name;
	      this.c = c;
	   }
	   
	   public void run() {
	      synchronized(this.c) {
	         c.CallCount();
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

	public class Test {

	   public static void main(String args[]) {
	      Call PD = new Call();

	      ThreadDemo T1 = new ThreadDemo( "Thread-1 ", PD );
	      ThreadDemo T2 = new ThreadDemo( "Thread-2 ", PD );

	      T1.start();
	      T2.start();

	      try {
	         T1.join();
	         T2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
	}
