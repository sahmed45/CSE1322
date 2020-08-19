package CSE1321;
import java.util.*;
public class LocateLargestElement
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);

   int arr1[][] = new int[3][4];
   for(int j=0; j<arr1.length; j++){
      for(int y=0; y<arr1[0].length;y++){
   
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
      locateLargest(arr1);
      }
          public static void locateLargest(int[][] arr1) {
        int max = arr1[0][0];
        int row =0;
        int column = 0;
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1[j].length; i++) {
                if (arr1[j][i] > max) {
                    max = arr1[j][i];
                    row = j;
                    column = i;
                }
                
            }
           
        }
        System.out.print("Largest value is at row  " +  row + "  column " +column);
        }
        }