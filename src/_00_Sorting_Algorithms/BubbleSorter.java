package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		int current = 0;
		int x;
		int y;
		boolean complete = false;
		while(complete == false) {
			complete = true;
			for(int i = 0; i < array.length; i ++) {
				display.updateDisplay();
			if(array[i] < array[current]) {
			x = array[i];
			y = array[current];
			array[current] = x;
			array[i] = y;
			complete = false;
			
			}
			current = i - 1;
			
		}
		}
		
	}
	
}
