package CSE1321;
import java.util.*;
public class DistinctValues
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);

  
   
   int mArr1[] = new int[10];
   for(int j=0; j<mArr1.length; j++){
   System.out.println ("Enter Values Array 1");
      int value = scan.nextInt();
      mArr1[j] = value;

      }
          System.out.println("First Array: ");
    for(int i=0; i<mArr1.length; i++){
    System.out.print(mArr1[i]+",");
      }
      System.out.println();
      System.out.println("Distinct Values");
      getValues(mArr1);
      }
      
      public static void getValues(int[] mArr1)
      {
         for ( int i = 0; i < mArr1.length; i++ )
         
         {
         for ( int j =i+1 ; j<i; j++ )
         {
         if ( mArr1[i] == mArr1[j] ) 
         break;
         if (i==j)
         System.out.print( mArr1[i] + " ");
         
         
   }
      }
      
      
      }
      }
