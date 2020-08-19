package CSE1321;
import java.util.*;
public class AssignGrades
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter Class Size");
   int size = scan.nextInt();
  
   
   int classScore[] = new int[size];
   for(int j=0; j<classScore.length; j++){
   System.out.println ("Enter Score");
      int score = scan.nextInt();
         while(score>100||score<0){
         System.out.println ("Invalid, enter valid score");
         score = scan.nextInt();

      }

   classScore[j] = score;


  }
  printGrades(classScore);
  }
  
   public static void printGrades(int[]classScore ){

   for (int i =0; i<classScore.length;i++) {
             if (classScore[i]>=90 && classScore[i]<=100){
               System.out.println("Student " + i + " score is " +classScore[i] + " and grade is A");
               }
               else if (classScore[i]>=80 && classScore[i]<=89){
               System.out.println("Student " + i + " score is " +classScore[i] + " and grade is B");
               }
               else if (classScore[i]>=70 && classScore[i]<=79){
               System.out.println("Student " + i + " score is " +classScore[i] + " and grade is C");
               }               
               else if (classScore[i]>=60 && classScore[i]<=69){
               System.out.println("Student " + i + " score is " +classScore[i] + " and grade is D");
               }
               else {
               System.out.println("Student " + i + " score is " +classScore[i] + " and grade is F");
               }               
               }
            
  }

}
