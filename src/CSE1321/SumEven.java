package CSE1321;
import java.util.*; 
public class SumEven  
{ 
   public static void main (String[] args) 
   { 
   
     Scanner input = new Scanner (System.in); 
     System.out.println ("Enter integer between 20 and 60 "); 
     int a = input.nextInt();
     int sum = 0;
     int counter = 0;
     while ( a<20 || a>60 ){
     System.out.println ("Invalid, input a valid number:");
     a = input.nextInt();
     }
     while ( counter<a){
     counter= counter +2;
     sum = sum + counter;
     }
     System.out.println("Sum of values   " +sum);
}
}


