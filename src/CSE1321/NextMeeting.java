package CSE1321;
import java.util.*; 
public class NextMeeting  
{ 
   public static void main (String[] args) 
   { 
     Scanner input = new Scanner (System.in); 
     System.out.println ("Enter Current day in integer form "); 
     int daytoday = input.nextInt();
     System.out.println ("Enter days to meeting "); 
     int meetday = input.nextInt();
     int days = (daytoday+meetday)%7;
     switch (days){
      case 0: System.out.println ("Your meeting is on Sunday");
         break;
      case 1: System.out.println ("Your meeting is on Monday");
         break;
      case 2: System.out.println ("Your meeting is on Tuesday");
         break;
      case 3: System.out.println ("Your meeting is on Wednesday");
         break;
      case 4: System.out.println ("Your meeting is on Thursday");
         break;
      case 5: System.out.println ("Your meeting is on Friday");
         break;
      case 6: System.out.println ("Your meeting is on Saturday");
         break;
      
     }
      switch (daytoday){
      case 0: System.out.println ("Today is Sunday");
         break;
      case 1: System.out.println ("Today is Monday");
         break;
      case 2: System.out.println ("Today is Tuesday");
         break;
      case 3: System.out.println ("Today is Wednesday");
         break;
      case 4: System.out.println ("Today is Thursday");
         break;
      case 5: System.out.println ("Today is Friday");
         break;
      case 6: System.out.println ("Today is Saturday");
         break;
     }
}
}