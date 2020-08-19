package CSE1321;
import java.util.*; 
public class ProcessGrades  
{ 
   public static void main (String[] args) 
   { 
     int num1, num2, num3, num4, min, max;
     Scanner input = new Scanner (System.in); 
     System.out.println ("Enter four grades "); 
     num1 = input.nextInt();
     min = num1;
     max = num1;
     num2 = input.nextInt();
     if (num2<min){
      min = num2;
      }
     if (num2>max){
      max = num2;
     }
     num3 = input.nextInt();
     if (num3<min){
      min = num3;
      }
     if (num3>max){
      max = num3;
     }
     num4 = input.nextInt();
     if (num4<min){
      min = num4;
      }
     if (num4>max){
      max = num4;
     }
     double average = ((num1+num2+num3+num4)/4.0);
     
     System.out.println ("Lowest Grade:   " +min);
     System.out.println ("Highest Grade:    " +max);
     System.out.println ("Average:    " +average);

      
     }
      
     }
  
   