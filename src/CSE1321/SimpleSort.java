package CSE1321;
import java.util.*;
public class SimpleSort
{
   public static void main (String[] args) 
   {

  
   int arr1[] = new int[50];
   for(int j=0; j<arr1.length; j++){
      int random = (int)(Math.random() * 100 + 0);
 
      arr1[j] = random;
      }
   int arr2[] = new int[50];
   for(int j=0; j<arr2.length; j++){
      int random = (int)(Math.random() * 100 + 0);
 
      arr2[j] = random;
      }      
   int arr3[] = new int[50];
   for(int j=0; j<arr3.length; j++){
      int random = (int)(Math.random() * 100 + 0);
 
      arr3[j] = random;
      }    
      System.out.println("Bubble Sorted Values:");  
      BubbleSort(arr1);
      System.out.println("Selection Sorted Values:");  
      SelectionSort(arr2);      
      System.out.println("Insertion Sorted Values:");  
      InsertionSort(arr3);      
      }
      
      public static void BubbleSort(int arr1[]){
       int swap = 0;
       for (int i = 0; i < arr1.length ; i++){
                for (int j = i; j < arr1.length; j++)
                {
                    if (arr1[j] < arr1[i])
                    {
                        int temp = arr1[j];
                        arr1[j] = arr1[i];
                        arr1[i] = temp;
                        swap++;
                    }
                    
                    
                }
                System.out.print(arr1[i] + " ");
                } 
                System.out.println();
                System.out.println( "Swaps:" +swap);
                }
      public static void SelectionSort(int arr2[]){
            int i = 0;
            int j = 0;
            int swap = 0;
            for (i = 0; i < arr2.length - 1; i++)
            {
                int minPos = i;
                for (j = i + 1; j < arr2.length; j++)
                {
                    if (arr2[j] < arr2[minPos])
                        minPos = j;
                }
                if (i != minPos && minPos < arr2.length)
                {
                    int temp = arr2[minPos];
                    arr2[minPos] = arr2[i];
                    arr2[i] = temp;
                    swap++;
                }
                        
               System.out.print(arr2[i] + " "); 
  
    
            }
            System.out.println( "Swaps:" +swap);
            }
      public static void InsertionSort (int arr3[])
{
      int swap = 0;
      for (int index=1; index < arr3.length; index++)
   {
      int key = arr3 [index];
      int position = index;
      while (position > 0 && key < arr3[position-1]) 
      {
         arr3 [position] = arr3 [position - 1];
         position--;
      }
      arr3 [position] = key;
        System.out.print(arr3[index] + " "); 
        swap++;
   }
   System.out.println( "Swaps:" +swap);
}

          
       
       
    }             

         
