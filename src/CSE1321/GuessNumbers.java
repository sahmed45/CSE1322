package CSE1321;
import java.util.*;
public class GuessNumbers
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);
  
   
   checker();
   
   }
   public static int randomint()
   {
   int random =(int)( Math.random()*20)+1;
   return random;
   
   }
   public static void guess()
   {
   System.out.println ("Enter number between 1 and 20");
   }
   
   public static void checker()
   {
   guess();
   Scanner scan = new Scanner (System.in);
   int guess = scan.nextInt();
   int secret = randomint();
   while (guess != secret)
   {
   if(guess> secret)
   {
   System.out.println ("Guess is too High");
   }
   else 
   {
   System.out.println ("Guess is too Low");
   }
   guess();
   guess = scan.nextInt();
   }
   System.out.println(" Congratulations the secret number was correct"  );
  
   }
   }