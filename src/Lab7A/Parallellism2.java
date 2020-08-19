package Lab7A;

import java.util.*;


class bubble extends Thread{
	int size=10000;
		public  void run() {

			int arr[] = new int[size];
			long total = 0;
			long timeElapsed = 0;
			long endTime = 0;

			for (int o = 0; o < 1000; o++) {
				for (int l = 0; l < arr.length; l++) {
					arr[l] = (int) (Math.random() * (1000)) + 1;
				}
					long startTime = System.currentTimeMillis();
					for (int i = 0; i < arr.length; i++) {
						for (int j = i + 1; j < arr.length; j++)
							if (arr[j] < arr[i]) {
								int temp = arr[j];
								arr[j] = arr[i];
								arr[i] = temp;
					
							}
			
						endTime = System.currentTimeMillis();
						timeElapsed = endTime - startTime;
					}
					total = total + timeElapsed;

				}
			System.out.println("Bubble Sorting time for array size of " +size+ " with parallism is " +total+ " milliseconds");

		}
}
public class Parallellism2  {
		public static void main(String args[]) {
			bubble Th= new bubble();
			Th.start();
			
			


		}
	}
