package CSE1321;
import java.util.*; 
public class Circles  
{ 
   public static void main (String[] args) 
   { 
     Scanner input = new Scanner (System.in); 
     System.out.println ("Enter X1 "); 
     int x1 = input.nextInt();
     System.out.println ("Enter Y1 "); 
     int y1 = input.nextInt();
     System.out.println ("Enter R1 "); 
     int r1 = input.nextInt();
     System.out.println ("Enter X2 "); 
     int x2 = input.nextInt();
     System.out.println ("Enter Y2 "); 
     int y2 = input.nextInt();
     System.out.println ("Enter R2 "); 
     int r2 = input.nextInt();
     double d = Math.pow((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2), 0.5);
    
    if (r2 >= r1 && d <= (r2 - r1)){
        System.out.println("Circle 1 is completely inside Circle 2.");
    }
    else if (r1 >= r2 && d <= (r1 - r2) ) {
        System.out.println("Circle 2 is completely inside Circle 1.");
    }
    else if (d > (r1 + r2)){
        System.out.println("Circle 2 is completely outside Circle 1.");
    }
    else {
        System.out.println("Circle 2 is overlapping with Circle 1.");}
    }
}