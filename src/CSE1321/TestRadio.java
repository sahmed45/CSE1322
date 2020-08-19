package CSE1321;
import java.util.*;
public class TestRadio
{
   public static void main (String[] args) 
   {
   Radio r1 = new Radio();
   r1.turnOn();
   System.out.println("Turn radio on:"  + "\n" + "\t" + r1);
   r1.stationUp();
   System.out.println("Turn station up"  + "\n" + "\t" + r1);
   r1.stationUp();
   System.out.println("Turn station up"  + "\n" + "\t" + r1);
      r1.stationDown();
   System.out.println("Turn station down"  + "\n" + "\t" + r1);   
      r1.stationDown();
   System.out.println("Turn station down"  + "\n" + "\t" + r1);   
         r1.volumeUp();
   System.out.println("Turn volume up"  + "\n" + "\t" + r1);   
         r1.volumeDown();
   System.out.println("Turn volume down"  + "\n" + "\t" + r1);   
            r1.turnOff();
   System.out.println("Turn radio off"+"\n" +"\t" + r1);
            r1.volumeDown();
   System.out.println("Turn volume down"  + "\n" + "\t" + r1);   
         r1.stationDown();
   System.out.println("Turn station down"  + "\n" + "\t" + r1);   

}
}