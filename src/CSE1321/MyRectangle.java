package CSE1321;
import java.util.*;
public class MyRectangle
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter a height");
   int height = scan.nextInt();
   System.out.println ("Enter a width");
   int width = scan.nextInt();   
   System.out.println("Entered height is " +height);
   System.out.println("Entered width is " +width);
   System.out.println("Valid Rectange:  " +isValid(height, width));   
   Area(height,width);
   Perimeter(height,width);
   }

      
   public static boolean isValid(int height, int width)
   {  
   int c = height + width;
   if ((height+width) >30){
         return true;
         }

      else {
      
      return false;
      }
      }
      public static int Area(int height, int width)
      {
  
      int area = height * width;
      System.out.println ("The Area is  " +area);
      return area;
      }
      public static int Perimeter(int height, int width)
      {
  
      int perimeter = height + height+ width + width;
      System.out.println ("The Perimiter is  " +perimeter);
      return perimeter;
      }
      }
      