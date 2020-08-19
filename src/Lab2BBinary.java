//Syed Ahmed
import java.util.*;
public class Lab2BBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
				System.out.println("enter a target value");
		int target = scan.nextInt();

	
	
	
	int nums[]=  {1,4,4,22,-5,10,21,-47,23};
	Arrays.parallelSort(nums);
	for(int i =0; i<nums.length;i++){
		
		System.out.print(nums[i]+"," );
	}
	System.out.println();

	Random ran = new Random();
	int nums2[]= new int[20];
	for(int i =0; i<nums2.length;i++){
		nums2[i] = ran.nextInt(201)-100;	
	}
	Arrays.parallelSort(nums2);
	for(int i =0; i<nums2.length;i++){
	System.out.print(nums2[i]+"," );
	}
	
	
	System.out.println();
	if (binarySearch(nums,target)>-1) {
	System.out.println("Searching for "+ target+" ,found at index "+binarySearch(nums,target));
	}
	else if(binarySearch(nums,target)<=-1) {
		System.out.println(binarySearch(nums,target));
	}
	
	
	if (binarySearch(nums2,target)>-1) {
	System.out.println("Searching for "+ target+" ,found at index "+binarySearch(nums2,target));
	}
	//else if(binarySearch(nums2,target)==-1) {
	System.out.println(binarySearch(nums2,target));
	//}
	
	}
public static int binarySearch(int nums[], int target) {
	int low =0;
	int high= nums.length-1;
	
	int index=-1;
	while(low<=high) {
		int mid = (low+high)/2;
		
		if (nums[mid]<target) {
			low = mid+1;
		}
		else if (nums[mid]>target) {
			high=mid-1;
	
		}
		else if (nums[mid]==target) {
			index = mid;
			break;
			
		}

	}
	if(index == -1) {
		int i=0;
		while(nums[i]<target) {
			i++;
			
		}
		i++;
		return -(i);
	

	}
	return index;
}
}

// Selection Sort Algorithm
/*for (int i = 0; i < B.length; i++){
	int minPos = i;for (int j = i + 1; j < B.length; j++)
	{if (B[j] < B[minPos])
		minPos = j;
	}
	if (i != minPos && minPos < B.length){
		int temp = B[minPos];
		B[minPos] = B[i];
		B[i] = temp;}
	}
*/
