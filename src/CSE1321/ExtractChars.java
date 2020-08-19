package CSE1321;
import java.util.*; 
public class ExtractChars  
{ 
   public static void main (String[] args) 
   { 
    Scanner scan = new Scanner (System.in); 
    System.out.println("Enter a string");
    String a = scan.nextLine();
    for (int i=0; i<a.length(); i++)
    {
      System.out.println("character at #" + (i+1)+": "+a.charAt(i));
    }
}
}