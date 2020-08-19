package CSE1321;
import java.util.*;
public class ArrayMethods
{
   public static void main (String[] args) 
   {

   System.out.println ("Original Array: ");
   
   int mArr1[] = new int[5];
   for(int j=0; j<mArr1.length; j++){
  
      int value = (int )(Math.random() * 100 + 1);
      mArr1[j] = value;  
     
      System.out.print ("," + mArr1[j]);
      }
      
      System.out.println ();
      System.out.println("Max is: " + arrayMax(mArr1));
      System.out.println("Min is: " + arrayMin(mArr1));
      System.out.println ("Squared values: ");
      arraySquared(mArr1);
      System.out.println ();
      System.out.println ("Reversed values: ");
      arrayReversed(mArr1);
      }
    public static int arrayMax(int[]mArr1 )
    {
         
    int max = mArr1[0];
   
    for (int j = 0; j < mArr1.length; j++) {

        if (mArr1[j] > max) {
            max = mArr1[j];
      }           
      }
      return max;
      }
    public static int arrayMin(int[]mArr1 )
    {
         
    int min = mArr1[0];
   
    for (int j = 0; j < mArr1.length; j++) {

        if (mArr1[j] < min) {
            min = mArr1[j];
      }           
      }
      return min;
      }
           public static void arrayReversed(int[]mArr1 )
      {
      for (int j = 0, end = mArr1.length - 1; j < end; j++, end--) {
      int beg = mArr1[j];
       mArr1[j]=mArr1[end];
       mArr1[end]=beg;
       
       System.out.print ( " " +mArr1[j]);
       }
      }
       public static void arraySquared(int[]mArr1 )
      {
      for (int j = 0; j < mArr1.length; j++) {

       mArr1[j]= (int)Math.pow(mArr1[j], 2);
       
       System.out.print ( " " +mArr1[j]);
       }
       }
 
}
