
import java.util.Scanner;

public class q2 {
    
    public static void main(String[]args){
        
        int years,days,seconds;
      
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your age (years): ");
        years = scan.nextInt();
        
        System.out.println("Age in years : " + years + "years");
        
        days = years*365;
        
        System.out.println("Age in days : " + days + "days");
        
        seconds = days*60*60*24;
        
        System.out.println("Age in seconds : " + seconds + "seconds");
         
        
    }
}
