package CSE1321;
import java.util.*; 
public class FiveDigitPalindrome  
{ 
   public static void main (String[] args) 
   { 
     Scanner input = new Scanner (System.in); 
     System.out.println ("Enter 5 digit number "); 
     int i = input.nextInt();
     
      int rv=0, r;
      {

      r = i % 10; 
      rv = (rv * 10) + r; 
      i = i / 10; 
     }
     if (rv==i)
     System.out.println("Valid 5-digit palindrome");
     else
     System.out.println("Invalid 5-digit palindrome");
     }
    
}