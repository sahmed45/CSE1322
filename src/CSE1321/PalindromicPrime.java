package CSE1321;
import java.util.*;
public class PalindromicPrime {   
   public static void main(String[ ] args) {
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter an integer");
   int num = scan.nextInt();
   System.out.println("Number is Palindrome:   " +isPalindrome(num));
   System.out.println("Number is Prime:   " +isPrime(num));
 
   }
   public static int reverse(int num)
   {int numberR=0;
      while (num != 0)
      {
      numberR = numberR * 10;
      numberR = numberR + num%10;
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
      public static boolean isPrime(int num)
      {

      for(int d = 2; d < num; d++) 
        if(num % d ==0) 
                          
        return false;
   
        return true; 
      }
      }