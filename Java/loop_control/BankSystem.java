package loop_control;

public class BankSystem {

	public static void main(String[] args) {
		System.out.println("While Loop:");
        int clientId = 100;
        while(clientId<=150){     //While Loop
            System.out.println("Client No:"+clientId+" in queue");
            clientId++;
        }
        
        int currentId = clientId;   //Do-While Loop
        do {
            System.out.println("Current No:"+currentId);
            currentId++;
        }while(currentId<200);
        
        for (int i=clientId; i<currentId; i++){   //for-loop
        	
        	if(i==175) {
        		continue;     // continue keyword
        	}
        	if(i==191) {
        		break;        // break keyword
        	}
            System.out.println("Id which has been done:"+i);

          }
        
        
        
        

	}

}
