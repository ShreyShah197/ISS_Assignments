package questions;
import java.util.concurrent.*;

public class Question_8 {
    public static void main(String[] args) {
        ExecutorService Service = Executors.newFixedThreadPool(2);
        
        Runnable task1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 1");
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task2 = () -> {
            for (int i =1; i<=5; i++) {
                System.out.println("Task 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Service.submit(task1); 
        Service.submit(task2);

        Service.shutdown();
    }
}

