package CSE1321;
import java.util.*;
public class TestCircle
{
   public static void main (String[] args) 
   {
   Circle c1 = new Circle();
   
   System.out.println("Print radius:" + "\n" + "\t" + c1.toString());   
   System.out.println("Print area:" + "\n" + "\t" + "The area is:   "  + c1.getArea());
   System.out.println("Print perimeter:" + "\n" + "\t" + "The area is:   "  + c1.getPerimeter());
   
   Circle c2 = new Circle(10);
   System.out.println("Print radius:" + "\n" + "\t" + c2.toString());  
   System.out.println("Print area:" + "\n" + "\t" + "The area is:   "  + c2.getArea());
   System.out.println("Print perimeter:" + "\n" + "\t" + "The area is:   "  + c2.getPerimeter());
}
}