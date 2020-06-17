
import java.util.Scanner;

public class dialog {
    
    public static void main(String[]args){
        
        String name;
        int year;
        float gpa;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        name = scan.nextLine(); 
        
        System.out.print("Enter your year of study: ");
        year = scan.nextInt();
        
        System.out.print("What is your target GPA for this semester? ");
        gpa = scan.nextFloat();
        
        System.out.print("Welcome " + name + "!\n");
        System.out.print("Work hard to achieve your target GPA of " + gpa + " this semester of your Year " + gpa + ".\n");
    }
}
