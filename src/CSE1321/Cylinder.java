package CSE1321;
import java.util.*;
public class Cylinder
{
   public static void main (String[] args)
   {
   Scanner input = new Scanner(System.in);
   System.out.println ("Enter Radius");
   double userinput = input.nextInt();
   
   System.out.println ("Enter Length");
   double userinput2 = input.nextInt();
   input.nextLine();
      
   double A = (userinput*userinput*3.14);
   double V = (A*userinput2);   
   
   System.out.println ("Entered radius   " +userinput);   
   System.out.println ("Entered length  " +userinput2);   
   System.out.println ("The volume is:    " +V);   
 
   }
}