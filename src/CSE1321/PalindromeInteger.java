package CSE1321;
import java.util.*;
public class PalindromeInteger
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter an integer");
   int num = scan.nextInt();
   System.out.println("Judgement is " +isPalindrome(num));
   }
   public static int reverse(int num)
   {int numberR=0;
      while (num != 0)
      {
      int rem = num% 10;
      numberR = numberR *10 + rem;
      num = num/10;
        }
      return numberR;
      }
      
   public static boolean isPalindrome(int num)
   {  
   if (num ==reverse(num)){
         return true;
         }

      else {
      
      return false;
      }
      }
      }
      