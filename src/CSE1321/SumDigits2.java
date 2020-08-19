package CSE1321;
import java.util.*;
public class SumDigits2
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter an integer");
   int num1 = scan.nextInt();
   System.out.println("You entered  " +num1 );
   System.out.println("Sum of Digits  " + sumDigits(num1));

   
   }
   public static int sumDigits(int num1)
   {
   int sum = 0 ;
   int rem = 0;
   while (num1 !=0)
   {
   
   rem =  num1 % 10;
   sum = sum + rem;
   num1 = num1 / 10;
 
   }
   return sum;

}
}