
/**
 * Write a description of class scanning here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class scanning
{
    public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the day of the week: ");
    String day = s.nextLine();
    
    System.out.print("Enter the date of the week: ");
    String date = s.nextLine();
    
    System.out.print("Enter the month: ");
    String month = s.nextLine();
    
    System.out.print("Enter the year: ");
    String year = s.nextLine ();
    
    System.out.println("American format: " + date + ", " + month + " " + day + ", " + year);
    System.out.println("European format: " + date + " " + day + " " + month + " " + year);
    

    
}//end of main method
}//end of main method
