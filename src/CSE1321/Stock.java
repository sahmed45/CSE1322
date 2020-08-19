package CSE1321;
import java.util.*;

public class Stock
{  
   String sym;
   String nam;
   double pcp;
   double cp;
   public Stock()
   {
   }
   public Stock(String Symbol, String Name, double previousClosingPrice, double currentPrice)
   {
   sym = Symbol;
   nam = Name;
   pcp = previousClosingPrice;
   cp = currentPrice;
   }
   public String getSymbol()
   {
   return sym;
   }
   public String getName()
   {
   return nam;
   }
   public double setClosingPrice()
   {
   return pcp;
   }
   public double setCurrentPrice()
   {
   return cp;
   }
   public double getChangePercent()
   {
   return (int)(((pcp - cp) / pcp) * 100);
   }
}