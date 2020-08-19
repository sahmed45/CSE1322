package CSE1321;
import java.util.*;
public class FeetMeters {
 public static void main (String[] args){
 feetToMeter ();
 meterToFeet ();

}

public static double feetToMeter(){
   double feet = 1;
	double meter = 0.305;
   System.out.println("Feet" + "\t" + "Meter");
	for (feet=1;feet<=20;feet++){
		System.out.println(feet + "\t" + meter*feet);
   
	}
   return meter;
}

public static double meterToFeet(){
   double meter = 1;
	double feet = 0.305;
	System.out.println("Meter" + "\t" + "Feet");
	for (meter=1;meter<=20;meter++){
		System.out.println(meter + "\t" + meter/feet);
      
	}
   return feet;
}
}
