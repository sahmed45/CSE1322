package CSE1321;
import java.util.*;

public class QuadraticEquation
{
   private double a = 1.0;
   private double b = 1.0;
   private double c = 1.0;
   private double d = (Math.pow(b, 2) -( 4 * a * c));   
   
   public QuadraticEquation()
   {
   }
   
   public QuadraticEquation(int newA, int newB, int newC)
   {
   a = newA;
   b = newB;
   c = newC;
   d = (Math.pow(newB, 2) - (4 * newA * newC));   
   
   }

   public double getA() {
	return a;
}

public void setA(double a) {
	this.a = a;
}

public double getB()
   {
   return b;
   }
   public double getC()
   {
   return c;
   }
   public double getDiscriminant()
   {
   return d;
   }
   public double getRoot1()
   {
   double r1= 0;
   if (d > 0){
   r1 = ((-b + Math.sqrt(d)) / (2 * a));
   }
   return r1;
   
  
   }
   public double getRoot2()
   {
   double r2 = 0;
   if (d > 0){
   r2 = ((-b - Math.sqrt(d)) / (2 * a));   }
   return r2;
   
   }
}

