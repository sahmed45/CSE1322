package CSE1321;
import java.util.*; 
public class CheckPoint  
{ 
   public static void main (String[] args) 
   { 
     Scanner input = new Scanner (System.in); 
     System.out.println ("Enter X coordinate "); 
     int x = input.nextInt();
     System.out.println ("Enter Y coordinate "); 
     int y = input.nextInt();
     
    
    if (x==0){
      if (y==0){
    System.out.println ("(0,0) is the origin point"); 
    }
      else{
      System.out.println ("("+x+","+y+") is on the y-axis"); 
    }
    }
      if (x>0){
         if (y>0){
    System.out.println ("("+x+" , "+y+") is First quadrant"); 
    }
    }
      if (x>0){
         if (y<0){
    System.out.println ("("+x+" , "+y+") is Fourth quadrant"); 
    }
    }
      if (x<0){
         if (y<0){
    System.out.println ("("+x+" , "+y+") is Third quadrant"); 
    }
    }
      if (x<0){
         if (y>0){
    System.out.println ("(+x , +y) is Second quadrant"); 
    }
   }
}
}