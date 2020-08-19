package CSE1321;
import java.util.*;

public class LargestOccurenceCount
{

   public static void main(String [] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter positive integers (0 to quit): ");
   int a = scan.nextInt();
   int max=a;
   while (a != 0){
     if ( a > max) {
              max = a;
 
}  

              System.out.println("Enter positive integers (0 to quit): ");
                a = scan.nextInt();
             }
            System.out.println("The max is: "+max);

    }

}
