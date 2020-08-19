package CSE1321;
import java.util.*; 
public class Symbol  
{ 
   public static void main (String[] args) 
   { 
    Scanner scan = new Scanner (System.in); 
    System.out.println("Enter a symbol");
    char a = scan.next().charAt(0);
    System.out.println (a);
    System.out.println("Enter a number");
    int b = scan.nextInt();
    
    for (int row = 1; row <=b; row++)
    {
      for (int star = 1; star <=b; star++)
      {
      System.out.print (a);
      }
   System.out.println();
}
}
}