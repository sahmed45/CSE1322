package CSE1321;
import java.util.*; 
public class PhoneBill  
{ 
   public static void main (String[] args) 
   { 
     Scanner input = new Scanner (System.in); 
     System.out.println ("Enter Account Number "); 
     int acc = input.nextInt();
     System.out.println ("Enter Service code r or p"); 
     char s = input.next().charAt(0);     
     System.out.println ("Enter Daytime Minutes "); 
     int day = input.nextInt();    
     System.out.println ("Enter Nighttime Minutes"); 
     int night = input.nextInt();
     
      if (s == ('r')){
         double cost = (15+((day-50)*0.50));
            if (cost<15){
            cost = 15;
         System.out.println ("Your Total is" +cost); 
    }     
    }
      if (s == ('p')){
         double cost = (25+((day-50)*0.20)+((night-100)*0.10));
            if (cost<25){
            cost = 25;       
         System.out.println ("Your Total is   " +cost);     }
    }
    }
}