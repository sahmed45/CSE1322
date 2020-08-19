package CSE1321;
import java.util.*; 
public class IncomeTax  
{ 
   public static void main (String[] args) 
   { 
     Scanner input = new Scanner (System.in); 
     System.out.println ("Enter Income "); 
     double i = input.nextInt();
      
     if (i<=50000){
     double t = (i*0.05);
     System.out.println ("Tax due is   " +t); 
     }
     
     else if (i<=200000){
     double t = (2500+((i-50000)*0.10));
     System.out.println ("Tax due is   " +t); 

     }
     else if (i<=400000){
     double t = (17500+(((i-200000)*0.15)));
     System.out.println ("Tax due is   " +t); 
     }
     else if (i<=900000){
     double t = (47500+(((i-400000)*0.25)));
     System.out.println ("Tax due is  " +t); 
     }
     else if (i>900000){
     double t = (172500+(((i-900000)*0.35)));
     System.out.println ("Tax due is  " +t); 
     }     
}     
}       