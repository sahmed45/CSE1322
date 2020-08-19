package CSE1321;
import java.util.*;
public class PrintCharacters
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter start char");
   char a = scan.next().charAt(0);
   System.out.println ("Enter end char");
   char b = scan.next().charAt(0);
   System.out.println ("Start char:   " +a );
   System.out.println ("End char:   " +b );
   printChars(a, b);
   }
   public static void printChars(char a, char b )
   {
   int counter = 0;
   
   for ( int x = a; x <= b; x++){
   if (counter % 5 == 0 && counter != 0)
   {
   System.out.println();
   }
   System.out.print ((char)x+ " ");
   counter++;
   }
   }
}

//
//int z = (int) z
//for (int x = b; x<= z; x++)
//int b = (int) 'b';
//