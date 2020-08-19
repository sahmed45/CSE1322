package CSE1321;
import java.util.*;
public class testMinMaxAvgII
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);

   int arr1[][] = new int[4][4];
   for(int j=0; j<arr1.length; j++){
      for(int y=0; y<arr1[0].length;y++){
      
      Random gb = new Random();
      int random = gb.nextInt(100);
      arr1[j][y] = random;
      
      }
     
      }
        System.out.println("Array Grades: " );
      for(int j=0; j<arr1.length; j++){
      for(int y=0; y<arr1[0].length;y++){
   
      System.out.print(arr1[j][y] + " ");
      }
      System.out.println();
      }}}