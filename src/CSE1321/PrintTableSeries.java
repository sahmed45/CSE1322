package CSE1321;
import java.util.*;
public class PrintTableSeries {   
   public static void main(String[ ] args) {
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter an integer");
   int n = scan.nextInt();
   displaySums(n);
        }
         public static double displaySums(int n){

        double s = 0;
        System.out.println("i" + "\t" + "Sum(i)");
        for(int i= 1; i<= n; i++) {
            s += (i * 1.0) / (i + 1.0);
         System.out.println(i + "\t" + s);
            
        }
        return s;
    }
    }