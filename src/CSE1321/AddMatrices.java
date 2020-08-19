package CSE1321;


import java.util.*;
public class AddMatrices
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);

   int arr1[][] = new int[3][3];
   for(int j=0; j<arr1.length; j++){
      for(int y=0; y<arr1[0].length;y++){
   
      System.out.println ("Enter Values Array 1");
      int value = scan.nextInt();
      arr1[j][y] = value;
      }
      }
 
      
      int arr2[][] = new int[3][3];
      for(int j=0; j<arr2.length; j++){
      for(int y=0; y<arr2[0].length;y++){
   
      System.out.println ("Enter Values Array 2");
      int value = scan.nextInt();
      arr2[j][y] = value;
      }
      }     

           System.out.println("Matrix 1: " );
      for(int j=0; j<arr1.length; j++){
      for(int y=0; y<arr1[0].length;y++){
   
      System.out.print(arr1[j][y] + " ");
      }
      
      System.out.println();
      }
             System.out.println("Matrix 2: " );
      for(int j=0; j<arr2.length; j++){
      for(int y=0; y<arr2[0].length;y++){
   
      System.out.print(arr2[j][y] + " ");
      }
      System.out.println();
      }
      
      System.out.println("Matrix 1+2");
      Addition(arr1, arr2);
      }
        public static int Addition(int[][] arr1, int[][] arr2) {
        int sum =0;
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1[j].length; i++) {
                sum = arr1[j][i] + arr2[j][i];
                System.out.print(sum + " ");
                }
                System.out.println();
   
                
            }
            return sum;
      }
      }