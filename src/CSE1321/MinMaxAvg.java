package CSE1321;
import java.util.*;
public class MinMaxAvg
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter three integers");
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();
   int num3 = scan.nextInt();
   double average = ((num1+num2+num3)/3);
   System.out.println("You entered  " +num1  + "," +num2 +"," +num3);
   System.out.println("Max is  " + max(num1,num2,num3));
   System.out.println("Min is  " + min(num1,num2,num3));
   System.out.println("Average is  " +average);
   
   }
   public static int max(int num1, int num2, int num3)
   {
   int myMax = Math.max(num1, Math.max(num2,num3));
   return myMax;
   }
   public static int min(int num1, int num2, int num3)
   {
   int myMin = Math.min(num1, Math.min(num2,num3));
   return myMin;
   }

}