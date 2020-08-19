package CSE1321;
import java.util.*;
public class Classes2
{
   public static void main (String[] args) 
   {
   Stock s1 = new Stock("GOG", "Google", 131.98, 134.67);
   String name;
   System.out.println(s1.getName() + " Stock");
   System.out.println("Symbol:   "  + s1.getSymbol());
   System.out.println("Closing Price:   "  + s1.setClosingPrice());
   System.out.println("Current Price:   "  + s1.setCurrentPrice());
   System.out.println("Change Percent   "  + s1.getChangePercent ());
   
   Stock s2 = new Stock("MSF", "Microsoft", 162.22, 156.22);
   
   System.out.println(s2.getName() + " Stock");
   System.out.println("Symbol:   "  + s2.getSymbol());
   System.out.println("Closing Price:   "  + s2.setClosingPrice());
   System.out.println("Current Price:   "  + s2.setCurrentPrice());
   System.out.println("Change Percent   "  + s2.getChangePercent ());
   }
   }