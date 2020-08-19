package CSE1321;
import java.util.*;
public class TestCounter
{
   public static void main (String[] args) 
   {
   Counter t1 = new Counter(50);
   
   System.out.println("Heads appeared " + t1.getValue()+ " times");   
   System.out.println("Tails appeared " + t1.getValue()+ " times");   
   
}
}