package CSE1321;
import java.util.*; 
public class SandClock  
{ 
   public static void main(String args[]) {
   int rows = 9;

   for(int i=0; i < rows/2; i++ ) {
    for(int j = rows - i; j < rows; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j < rows - 2*i; j++) {
        System.out.print("*");
    }
    System.out.println();
   }
   
   for(int i=0; i < (rows+1)/2; i++ )
   {
    for(int j = 1; j <= rows/2 - i; j++)
        System.out.print(" ");
    for(int j = 0; j <= i*2; j++)
        System.out.print("*");
    System.out.println();
   }
   }
   }