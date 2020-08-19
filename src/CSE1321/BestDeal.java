package CSE1321;
import java.util.*; 
public class BestDeal  
{ 
   public static void main (String[] args) 
   { 
     Scanner input = new Scanner (System.in); 
     System.out.println ("Small Box Weight "); 
     int sw = input.nextInt();
     System.out.println ("Small Box Price"); 
     int sp = input.nextInt();     
     System.out.println ("Enter Large Box Weight"); 
     int lw = input.nextInt();    
     System.out.println ("Enter Large Box Price"); 
     int lp = input.nextInt();
     
     double st = (sw / sp);
     double lt = (lw / lp);

     
     if (st>lt){
         System.out.println ("The small box is a better deal");
         }
      else {
         System.out.println ("The large box is a better deal");

      }
      
}
}      