package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	static boolean intArraySorted(int[] a) {
		
		int num = a[0];
		for(int i = 0 ; i < a.length; i ++) {
			if(num <= a[i]) {
				num = a[i];
			}else {
				return false;
			}
		}
		return true;
		
	}
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise

	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
static boolean doubleArraySorted(double[] d) {
	double num = d[0];
	for(int i = 0 ; i < d.length; i ++) {
		if(num <= d[i]) {
			num = d[i];
		}else {
			return false;
		}
	}
	return true;
	
	
}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
static boolean charArraySorted(char[] c) {
	char num = c[0];
	for(int i = 1 ; i < c.length; i ++) {
		if(num <= c[i]) {
			num = c[i];
		}else {
			return false;
		}
	}
	return false;
}

	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
static boolean stringArraySorted(String[] s) {
	int small;
	String num = s[0];
	for(int i = 0; i < s.length; i ++) {
		if(num.length() < s[i].length()) {
			small = num.length();
		}else {
			small = s[i].length();
		}
			for(int n = 0; n < small; n ++) {
				if(num.charAt(n) > s[i].charAt(n)){
					return false;
				}
			}
			num = s[i];
		}
	
	return true;
}

}
