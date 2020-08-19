
//Syed Ahmed
import java.util.*;
public class Lab1Apart2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums= new int[] {1,4,13,43,-25,17,22,-37,29};
		Random x = new Random();
		int [] data = new int[20];
		System.out.println("data contents:");
		for(int i =0; i<data.length;i++){
			data[i] = x.nextInt(201)-100;
			
			System.out.print(data[i]+"," );
		}
		System.out.println();
		System.out.println("The max of array nums is "+ findLargest(nums) );
		System.out.println("The max of array data is "+ findLargest2(data) );
		System.out.println("Sum of maxes " + (findLargest(nums)+findLargest2(data)));
		System.out.println("Number of continuous positives "+ continuous(data));
		
		
		}
	
	public static int findLargest(int []nums) {
		int max = nums[0];
		
		for(int i =0; i<nums.length;i++){
			if (nums[i]>max) {
				max = nums[i];
			}
			
		}
		return max;
	}
	public static int findLargest2(int []data) {
		int max = data[0];
		
		for(int i =0; i<data.length;i++){
			if (data[i]>max) {
				max = data[i];
			}
			
		}
		return max;
	}
	public static int continuous(int[]data) {
		int counter=0;
		int max =0;
		for(int i =0; i<data.length;i++){
			if (data[i]>0) {
				counter++;
	
			}
			else  {
				if(counter>max) {
					max=counter;
					
					
			}
				counter=0;
			}
		
		}
		if(max<counter) {
			max=counter;
		}
		return max;
		
	}
	}

