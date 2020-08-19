package CSE1321;
import java.util.*;
public class MinMaxAvgII
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);

   int arr1[][] = new int[4][4];
   for(int j=0; j<arr1.length; j++){
      for(int y=0; y<arr1[0].length;y++){
      int random = (int)(Math.random() * 100);
      
      arr1[j][y] = random;
      
      }
     
      }
        System.out.println("Array Grades: " );
      for(int j=0; j<arr1.length; j++){
      for(int y=0; y<arr1[0].length;y++){
   
      System.out.print(arr1[j][y] + " ");
      
      }
      
      }
      System.out.println();
      minMaxAvg(arr1);
      }
      public static void minMaxAvg(int arr1[][])
      {
      int max = arr1[0][0];
      int avg = 0;
      int sum = 0;
      int min =arr1[0][0];
         for(int j=0; j<arr1.length; j++){
         for(int y=0; y<arr1[j].length;y++){
         sum= sum +arr1[j][y];
         avg = sum/16;
         if (arr1[j][y]>max)
         { 
         max = arr1[j][y];
         }
                  if (arr1[j][y]<min)
         { 
         min = arr1[j][y];
         }
         
         
      }
      
      }
          System.out.println("The max value is: " +max);
      System.out.println("The min value is: " +min);
      System.out.println("The avg value is: " +avg);
      }
  
      }
      
      