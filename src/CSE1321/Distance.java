package CSE1321;
import java.util.*;
public class Distance
{
   public static void main (String[] args)
   {
   Scanner input = new Scanner(System.in);
   System.out.println ("Enter X1");
   double xa = input.nextInt();
   
   System.out.println ("Enter Y1");
   double ya = input.nextInt();
   input.nextLine();
   
   System.out.println ("Enter X2");
   double xb = input.nextInt();
   
   System.out.println ("Enter Y2");
   double yb = input.nextInt();
      
   double D = (((xb-xa)*(xb-xa)) + ((yb-ya)*(yb-ya)));
   
   System.out.println ("Entered X1   " +xa);   
   System.out.println ("Entered Y1  " +ya);   
   System.out.println ("Entered X2  " +xb);   
   System.out.println ("Entered Y2  " +yb);   
   System.out.println ("Distance:   " +D);
   }
}