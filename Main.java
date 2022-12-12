/* Alex Taylor
 * ICS3UR
 * Delay
 */
import java.util.concurrent.*;

    /* All commented code is unimportant, I just used it when testing    
    
    public void delay(int seconds)
    {
        // Converting time into milliseconds
        int milliseconds = 1000 * seconds;
    
        // Storing start time
        Duration startTime = new Duration(){

        }
    
        // looping till required time is not achieved
        while(Duration() < startTime + milliseconds) {

          */  public class Main {

                public static void main(String[] args) {
                
                    System.out.println("This message will continue in 4 seconds. please stand by.");
            
          /*   for (int i = 0; i < 4; i++) {
                // delay of 4 secs
                delay(4); */
            try{
                TimeUnit.SECONDS.sleep(4);
// NOTE: seconds can be changed to minutes if need be.
                System.out.println("Thank you for your patience. This message has been continued successfully.");
            } catch (InterruptedException e) {
                System.out.println("Error: This message could not continue. " + e);
            }
        
        }
            
    }

// trying to create a delay using some of my old C code. trying to work through the syntax
// UPDATE: seems to work.
