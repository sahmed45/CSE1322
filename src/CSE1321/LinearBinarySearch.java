package CSE1321;
import java.util.*;
public class LinearBinarySearch
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter Search value");
   int search = scan.nextInt();
  float b = 3.6f;
  
   int arr1[] = new int[4];
   for(int j=0; j<arr1.length; j++){
   System.out.println ("Enter Values Array 1");
      int value = scan.nextInt();
      arr1[j] = value;
      }
            System.out.println("Target Value");  
      System.out.println(search);  
      System.out.println("Linear search comparisons");  
      LinearSearch(arr1,search);  
      System.out.println("Binary search comparisons");  
      BinarySearch(arr1,search);  
      }
      
      public static void LinearSearch (int [] arr1, int search)
      { 
      int counter = 0;
      for (int i=0; i<arr1.length; i++)
       {
       counter++;
       if (arr1[i] == search){
             System.out.println(counter + " searches");
        }
        }
      
      }


    public static void  BinarySearch(int[] arr1, int search)
    {
    boolean found = false;
    int low = 0;
    int high = arr1.length;
    int mid = 0;
    int counter =0;
    while (!found)
    {
        counter++;
        mid = (low + high) / 2;
        if (search == arr1[mid]) 
           System.out.println(counter + " searches");
        else if (search < arr1[mid])
                 high = mid;
             else
                 low = mid;
        if (low >= high - 1)
            System.out.println(counter + " searches");
        break;
            
    }
}

}