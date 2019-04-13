package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		int current = 0;
		Random rand = new Random();
		int x;
		int y;
		boolean complete = false;
		while(complete == false) {
			current = 0;
			complete = true;
			for(int i = 0 ; i < arr.length; i ++) {
				display.updateDisplay();
				if(arr[current] > arr[i]) {
					x = rand.nextInt(arr.length);
					y = rand.nextInt(arr.length);
					int swap = arr[x];
					arr[x] = arr[y];
					arr[y] = swap;
 					complete = false;
					
					
				}
					current = i;
					
			
				
			}
			
		}
	}
}
