package CSE1321;
import java.util.*;
public class DrivingCost
{
   public static void main (String[] args)
   {
   Scanner input = new Scanner(System.in);
   System.out.println ("Enter Distance travelled");
   double xa = input.nextInt();
   
   System.out.println ("Enter Miles per gallon");
   double ya = input.nextInt();
   input.nextLine();
   
   System.out.println ("Enter Price per gallon");
   double xb = input.nextInt();
   
   double yb = ((xa/ya)*(xb));   
   System.out.println ("Distance travelled (miles)   " +xa);   
   System.out.println ("Miles per gallon  " +ya);   
   System.out.println ("Price per gallon (dollars)  " +xb);   
   System.out.println ("Trip Cost (dollars)  " +yb);   
   }
}