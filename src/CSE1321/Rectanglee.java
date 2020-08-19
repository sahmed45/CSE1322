package CSE1321;
import java.util.*;

public class Rectanglee
{
   private double height = 1.0;
   private double width = 1.0;
   public Rectanglee()
   {
   }
   public Rectanglee(double newHeight, double newWidth)
   {
   height = newHeight;
   width = newWidth;
   }
   public double getArea()
   {
   return (height * width);
   }
   public double getPerimeter()
   {
   return (height + height + width + width);
   }
   public double getHeight()
   {
   return height;
   }
   public double getWidth()
   {
   return width;
   }
}