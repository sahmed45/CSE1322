package CSE1321;
import java.util.*; 
public class Shape  
{ 
   public static void main (String[] args) 
   { 
        for(int a = 1; a <= 8; a++){

            for(int b = 1; b <= (8-a); b++){

                System.out.print(" ");

            }

            for(int c = 0; c < (a + (a-1)); c++){

                System.out.print("*");

            }

            for(int d = 1; d <= (8-a); d++){

                System.out.print(" ");

            }

            System.out.println();

        }

    }

}