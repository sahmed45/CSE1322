//Syed Ahmed
import java.util.*;
public class Lab2ALinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
				System.out.println("enter a target value");
		int target = scan.nextInt();
		
	int nums[]= new int[] {1,4,4,22,-5,10,21,-47,23};
	for(int i =0; i<nums.length;i++){
		
		System.out.print(nums[i]+"," );
	}
	System.out.println();

	Random ran = new Random();
	int nums2[]= new int[20];
	for(int i =0; i<nums2.length;i++){
		nums2[i] = ran.nextInt(201)-100;
		
		System.out.print(nums2[i]+"," );
	
	}
	System.out.println();
	if (linearSearch(nums,target)>-1) {
	System.out.println("Searching for "+ target+" ,found at index "+linearSearch(nums,target));
	}
	else if(linearSearch(nums,target)==-1) {
	System.out.println("Value not found");
	}
	
	
	if (linearSearch(nums2,target)>-1) {
	System.out.println("Searching for "+ target+" ,found at index "+linearSearch(nums,target));
	}
	else if(linearSearch(nums2,target)==-1) {
	System.out.println("Value not found");
	}
	
	}
public static int linearSearch(int nums[], int target) {
	for(int j=0; j<nums.length;j++) {
		if(nums[j]==target) 
		return j;	
		
	}
	return -1;
}
}
