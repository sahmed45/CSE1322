package CSE1321;
import java.util.*;
public class SumArrayColumns
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);

   int arr1[][] = new int[3][4];
   for(int j=0; j<arr1.length; j++){
      for(int y=0; y<arr1[j].length;y++){
   
      System.out.println ("Enter Values Array 1");
      int value = scan.nextInt();
      arr1[j][y] = value;
      
      }
      }
      System.out.println("the entered matrix: " );
      for(int j=0; j<arr1.length; j++){
      for(int y=0; y<arr1[0].length;y++){
   
      System.out.print(arr1[j][y] + " ");
      
      }
      System.out.println();
      }

      
     
      int arr2[]= sumColumn(arr1);
      for(int x=0; x<arr2.length;x++)
      {
      System.out.println ("Sum of Column " + x + " is " +arr2[x] );
      }
      }
      public static int[] sumColumn(int arr1[][]){
      int []newarr= new int[arr1[0].length];

      for(int i=0; i<arr1[0].length;i++){
      int sum =0;
         for (int j=0; j<arr1.length; j++)
         {
         sum+=arr1[j][i];
         }
         newarr[i]= sum;
 
      }
      
      return newarr;
      }
      }