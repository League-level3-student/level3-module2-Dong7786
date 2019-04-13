package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		int current = 0;
		int x;
		int y;
		boolean complete = false;
		while(complete == false) {
			current = 0;
			complete = true;
			for(int i = 0 ; i < arr.length; i ++) {
				display.updateDisplay();
				if(arr[current] > arr[i]) {
					x = arr[i];
					y = arr[current];
					arr[i] = y;
					arr[current] = x;
					complete = false;
					
					
				}
					current = i;
					
			
				
			}
			
		}
		
	}
	
}
