package CSE1321;
import java.util.*;

public class Circle
{
   private double radius = 1.0;
   public Circle()
   {
   }
   public Circle(double newRadius)
   {
   radius = newRadius;
   }
   public double getRadius()
   {
   return radius;
   }
   public double getArea()
   {
   return ((radius*radius)*3.14);
   }
   public double getPerimeter()
   {
   return (2 * 3.14 * radius);
   }
   public String toString()
   {
   String a = ("The circle has radius   " +radius);
   return a;
   }
}