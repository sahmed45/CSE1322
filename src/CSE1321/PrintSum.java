package CSE1321;
import java.util.*; 
public class PrintSum  
{ 
   public static void main (String[] args) 
   { 
     Scanner input = new Scanner (System.in); 
     System.out.println ("Enter integer between 1 and 100 "); 
     int a = input.nextInt();
     int sum = 0;
     
    
      for (int i = 1; i <= a; i++){ 
         sum +=i;
      }
      {
      if (a>100 | a<0){
         System.out.println("You entered   " +a);
         System.out.println("Invalid input");
         }

      else {
         System.out.println("You entered   " +a);
         System.out.println("Sum of values   " +sum);
      }
}
}
}

     
    