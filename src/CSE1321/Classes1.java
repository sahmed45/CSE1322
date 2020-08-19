package CSE1321;
import java.util.*;
public class Classes1
{
   public static void main (String[] args) 
   {
   Rectanglee r1 = new Rectanglee();
   
   System.out.println("The Height is:   "  + r1.getHeight());
   System.out.println("The Width is:   "  + r1.getWidth());
   System.out.println("The area is:   "  + r1.getArea());
   System.out.println("The perimeter is:   "  + r1.getPerimeter());
   
   Rectanglee r2 = new Rectanglee(5,6);
   System.out.println("The Height is:   "  + r2.getHeight());
   System.out.println("The Width is:   "  + r2.getWidth());
   System.out.println("The area is:   "  + r2.getArea());
   System.out.println("The perimeter is:   "  + r2.getPerimeter());

}
}