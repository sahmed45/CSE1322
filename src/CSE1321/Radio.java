package CSE1321;
import java.util.*;

public class Radio
{
   private int station = 1;
   private int volume = 1;
   private boolean on = false;
   public Radio()
   {
   }

   public int getStation()
   {
   return station;
   }
   public int getVolume()
   {
   return volume;
   }
   public void turnOn()
   {
   on = true;
   }
   public void turnOff()
   {
   on = false;
   }
   public int stationUp()
   {
   if (on){ 
   station++;
   }   
   return station;
   }
   public int stationDown()
   {
   if (on) { 
   station--;
   }   
   return station;
   }
   public int volumeUp()
   {
   if (on=true){ 
   volume++;
   }   
   return volume;
   }
   public int volumeDown()
   {
   if (on){ 
   volume--;
   }   
   return volume;
   }
   public String toString()
   {
   String a = ("The radio station is:   " +station + "   The volume is   " + volume);
   String b = ("The radio station is off");
   if (on){
   return a;
   }
   else 
    return b;

}
}
