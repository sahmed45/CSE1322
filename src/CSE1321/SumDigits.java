package CSE1321;
import java.util.*;
public class SumDigits
{
   public static void main (String[] args)
   {
   Scanner input = new Scanner(System.in);
   System.out.println ("Enter an integer between 0 and 1000");
   int userinput = input.nextInt();
   
   int r0 = (userinput%10);       
   int r1 = (userinput/10) %10;
   int r2 = (userinput/100) %100;
   int sum = (r0+r1+r2);
      
   System.out.println ("The entered number is   " +userinput);   
   System.out.println ("Sum of digits is  " +sum);   
 
   }
}