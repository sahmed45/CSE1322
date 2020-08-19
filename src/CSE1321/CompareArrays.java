package CSE1321;
import java.util.*;
public class CompareArrays
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter Array Size");
   int size = scan.nextInt();
  
   
   int mArr1[] = new int[size];
   for(int j=0; j<mArr1.length; j++){
   System.out.println ("Enter Values Array 1");
      int value = scan.nextInt();
      mArr1[j] = value;
      }
    
    
    
   int mArr2[] = new int[size];
   for(int i=0; i<mArr2.length; i++){
   System.out.println ("Enter Values Array 2");
      int value2 = scan.nextInt();
      mArr2[i] = value2;
      }
    System.out.println("Array size " +size );
    System.out.println("First Array: ");
    for(int i=0; i<mArr1.length; i++){
    System.out.print(mArr1[i]+",");
    }
    System.out.println();
    System.out.println("Second Array: ");
    for(int i=0; i<mArr2.length; i++){
    System.out.print(mArr2[i]+",");
    }
    System.out.println("The arrays are identical " +"(" +compare(mArr1,mArr2)+ ")");
    
    }
    public static boolean compare(int[]mArr1 , int[]mArr2){
    for(int i=0; i<mArr1.length; i++){
      if (mArr1[i] != mArr2[i]){
     return false;
      }
      } 
      return true;
  }
}


