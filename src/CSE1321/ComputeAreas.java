package CSE1321;
import java.util.*;
public class ComputeAreas
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter square side");
   double side = scan.nextDouble();
   System.out.println ("Enter rectangle width, then length");
   double width = scan.nextDouble();
   double length = scan.nextDouble();
   System.out.println ("Enter circle radius");
   double radius = scan.nextDouble();
   System.out.println ("Enter triangle base");
   double base = scan.nextDouble();
   System.out.println ("Enter triangle height");
   double height = scan.nextDouble();
   
   System.out.println("Square Side:  " +side);
   System.out.println("Square area  " + squareArea(side));
   System.out.println("Rectangle length  " + length);
   System.out.println("Rectangle width  " + width);
   System.out.println("Rectangle area  " + rectArea(length, width));
   System.out.println("Circle Radius  " + radius);
   System.out.println("Circle area  " + circleArea(radius));
   System.out.println("Triangle Base  " + base);
   System.out.println("Triangle Height  " + height);
   System.out.println("Triangle Area  " + triangleArea(base,height));
   }
   public static double squareArea(double side)
   {
   double sqArea = (side * side);
   return sqArea;
   }
   public static double rectArea(double length, double width)
   {
   double trArea = (length * width);
   return trArea;
   }
   public static double circleArea(double radius)
   {
   double cirArea = (3.14 * (radius * radius));
   return cirArea;
   }
   public static double triangleArea(double base, double height)
   {
   double triArea = ((base*height)/2);
   return triArea;
   }
}