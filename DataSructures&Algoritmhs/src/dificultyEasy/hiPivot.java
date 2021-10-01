package dificultyEasy;

import java.io.*;
import java.util.Scanner;

public class hiPivot {
	
	
	
	// Java implementation of QuickSort

		
	// A utility function to swap two elements
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/* This function takes last element as pivot, places
	the pivot element at its correct position in sorted
	array, and places all smaller (smaller than pivot)
	to left of pivot and all greater elements to right
	of pivot */
	static int partition(int[] arr, int low, int high)
	{
		
		// pivot
		int pivot = arr[high];
		
		// Index of smaller element and
		// indicates the right position
		// of pivot found so far
		int i = (low - 1);

		for(int j = low; j <= high - 1; j++)
		{
			
			// If current element is smaller
			// than the pivot
			if (arr[j] < pivot)
			{
				
				// Increment index of
				// smaller element
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	/* The main function that implements QuickSort
			arr[] --> Array to be sorted,
			low --> Starting index,
			high --> Ending index
	*/
	static void quickSort(int[] arr, int low, int high)
	{
		if (low < high)
		{
			
			// pi is partitioning index, arr[p]
			// is now at right place
			int pi = partition(arr, low, high);

			// Separately sort elements before
			// partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	// Function to print an array
	static void printArray(int[] arr, int size)
	{
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
			
		System.out.println();
	}
	
	private static int pivots(int[]arr , int[]arr2 ) {
	
		
		int i=arr.length-1;
		int ans=0;
		
		for (int j=0;j<=i;j++) {
			
			if (arr[j]==arr2[j]) {
				ans++;
			}
			
		}
		
		
		return ans;
		}

	// Driver Code
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
	//	int i=0;
	//	while (sc.hasNextInt()) {
		
		for (int i=0;i<n;i++)	{
			
			arr[i]=sc.nextInt();
		   
		   // solve test case and output answer
		}
		int[] arr2=arr.clone();
		
	//	int[] arr = { 10, 7, 8, 9, 1, 5 };
	//	int n = arr.length;
		
		quickSort(arr, 0, n - 1);
	//	System.out.println("Sorted array: ");
	//	printArray(arr, n);
	//	printArray(arr2,n);
		System.out.println(pivots(arr , arr2 ));
	}
	}



