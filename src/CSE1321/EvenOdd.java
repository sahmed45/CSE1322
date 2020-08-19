package CSE1321;
import java.util.*; 
public class EvenOdd  
{ 
   public static void main (String[] args) 
   { 
   int e = 50;
   System.out.print ("Even numbers  ");
while (e <= 100) {
  if (e % 2 == 0)
    System.out.print(e+",");
  e++;
  }
  System.out.println();
  int o = 50;
  System.out.print ("Odd numbers  ");
  while (o<=100) {
 
  if (o % 2 != 0)
     System.out.print(o+",");
  o++;
}
}
}

     
    