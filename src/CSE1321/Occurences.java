package CSE1321;
import java.util.*;
public class Occurences
{
   public static void main (String[] args) 
   {
   Scanner scan = new Scanner (System.in);

  
   
   int mArr1[] = new int[10];
   for(int j=0; j<mArr1.length; j++){
   System.out.println ("Enter Values Array 1");
      int value = scan.nextInt();
      mArr1[j] = value;
      }
      
    Count(mArr1);
    }
    public static int Count(int mArr1[])
    {
    int count =0;
        for (int i = 0, length = mArr1.length; i < length; i++) {
        if (i < length - 1) {
            if (mArr1[i] == mArr1[i + 1]) {
                count++;
            }
        } else {
            System.out.println(mArr1[i] + " occured " + count
                    + " times"); 
        }

        if (i < length - 1 && mArr1[i] != mArr1[i + 1]) {
            System.out.println(mArr1[i] + " occured " + count
                    + " times"); 
            count = 1;
        }
        }
        return count;

    }
    
    
    
    
    }
    