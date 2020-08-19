package CSE1321;
import java.util.*;
public class WeeklyHours
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);

   int arr1[][] = new int[3][7];
   for(int j=0; j<arr1.length; j++){
      for(int y=0; y<arr1[0].length;y++){
      int random = (int)(Math.random() * 11);
      
      arr1[j][y] = random;
      
      }
     
      }
        System.out.println("Employee Data: " );
        System.out.println("              Mon   Tue   Wed   Thu   Fri   Sat   Sun");
        System.out.println("Employee 1"+ "     "+ arr1[0][0]+"     "+ arr1[0][1]+"     "+ arr1[0][2]+"     "+ arr1[0][3]+"     "+ arr1[0][4]+"     "+ arr1[0][5]+"     "+ arr1[0][6]);
        System.out.println("Employee 2"+ "     "+ arr1[1][0]+"     "+ arr1[1][1]+"     "+ arr1[1][2]+"     "+ arr1[1][3]+"     "+ arr1[1][4]+"     "+ arr1[1][5]+"     "+ arr1[1][6]);
        System.out.println("Employee 3"+ "     "+ arr1[2][0]+"     "+ arr1[2][1]+"     "+ arr1[2][2]+"     "+ arr1[2][3]+"     "+ arr1[2][4]+"     "+ arr1[2][5]+"     "+ arr1[2][6]);
        
        System.out.println("Employee Weekly Hours: " );
        int emp1= (arr1[0][0]+arr1[0][1]+arr1[0][2]+arr1[0][3]+arr1[0][4]+arr1[0][5]+arr1[0][6]);
        int emp2= (arr1[1][1]+arr1[1][1]+arr1[1][2]+arr1[1][3]+arr1[1][4]+arr1[1][5]+arr1[1][6]);
        int emp3= (arr1[2][2]+arr1[2][1]+arr1[2][2]+arr1[2][3]+arr1[2][4]+arr1[2][5]+arr1[2][6]);
         System.out.println("Employee 1  "+ emp1);
         System.out.println("Employee 2  "+ emp2);
         System.out.println("Employee 3  "+ emp3);
      
      
      }
      }
      
