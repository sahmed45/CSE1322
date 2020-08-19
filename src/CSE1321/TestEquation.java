package CSE1321;
import java.util.*;
public class TestEquation
{
   public static void main (String[] args) 
   {
   QuadraticEquation q1 = new QuadraticEquation(3,8,4);
   
   System.out.println("a = " + q1.getA());   
   System.out.println("b = " + q1.getB()); 
   System.out.println("c = " + q1.getC()); 
   System.out.println("Root 1 = " + q1.getRoot1()); 
   System.out.println("Root 2 = " + q1.getRoot2());
   
      QuadraticEquation q2 = new QuadraticEquation(3,4,8);
   
   System.out.println("a = " + q2.getA());   
   System.out.println("b = " + q2.getB()); 
   System.out.println("c = " + q2.getC()); 
   System.out.println("Root 1 = " + q2.getRoot1()); 
   System.out.println("Root 2 = " + q2.getRoot2());
   
      QuadraticEquation q3 = new QuadraticEquation(2,8,2);
   
   System.out.println("a = " + q3.getA());   
   System.out.println("b = " + q3.getB()); 
   System.out.println("c = " + q3.getC()); 
   System.out.println("Root 1 = " + q3.getRoot1()); 
   System.out.println("Root 2 = " + q3.getRoot2());
}
}