package termproject;

import java.util.*;

public class code2 {
	public static void selectionSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int min_idx = i;
			for (int j = i + 1; j < a.length; j++)
				if (a[j] < a[min_idx])
					min_idx = j;

			int temp = a[min_idx];
			a[min_idx] = a[i];
			a[i] = temp;
		}

	}

	public static void main(String args[]) {

		System.out.println("Enter length of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}
		System.out.println("Unsorted array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		selectionSort(arr);
		System.out.println("Sorted array");

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}