package Lab7A;


class arraySum extends Thread 
{
public void run() {
int arr[]= new int[100000];
int sum=0;
for(int i=0;i<arr.length;i++) {
	
	arr[i]= (int)(Math.random()*100)+1;
	 sum =arr[i]+sum;
	 
}
System.out.println("Sum is "+sum);

 }
}  

public class Parallelism {

		 public static void main(String args[])
		  {
		   arraySum  Th = new arraySum();
	
		   Th.start();	
		
		  }
		}  

	


