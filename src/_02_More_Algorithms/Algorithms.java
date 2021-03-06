package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;

			}

		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				pearls++;

			}

		}

		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		// boolean run = true;
		// int current = 0;
		// while(run) {
		// run = false;
		// for(int i = 0; i < peeps.size(); i ++) {
		// if(peeps.get(current) > peeps.get(i)) {
		// Double swap = peeps.get(current);
		// peeps.set(current, peeps.get(i));
		// peeps.set(i, swap);
		// run = true;
		// }
		// current = i;
		// }
		//
		// }
		// return peeps.size();
		double highest = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (highest < peeps.get(i)) {
				highest = peeps.get(i);

			}

		}

		return highest;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longest = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			if (longest.length() < words.get(i).length()) {
				longest = words.get(i);

			}

		}

		return longest;
	}

	public static Boolean containsSOS(List<String> message2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < message2.size(); i++) {
			if (message2.get(i).contains("... --- ...")) {
				return true;

			}

		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		boolean run = true;
		int current = 0;
		
		while (run) {
			

			run = false;
			current = 0;
			for (int i = 0; i < results.size(); i++) {
System.out.println(results.get(i) + ", " +results.get(current));
				if (results.get(i) < results.get(current)) {
					Double swap = results.get(i);
					results.set(i, results.get(current));
					results.set(current, swap);
					run = true;

				}
				current = i;
			}

		}
		
	

		return results;

	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		boolean run = true;
		int current = 0;
		
		while(run) {
			run = false;
			current = 0;
			for(int i = 0; i < unsortedSequences.size(); i ++) {
				if(unsortedSequences.get(current).length() > unsortedSequences.get(i).length() ) {
					String swap = unsortedSequences.get(i); 
					unsortedSequences.set(i, unsortedSequences.get(current));
					unsortedSequences.set(current, swap);
					
					run = true;
				}
					current = i;
				
			}
			
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		boolean run = true;
		int current = 0;
		
		while(run) {
			run = false;
			current = 0;
			for(int i = 0; i < words.size(); i ++) {
				if(words.get(i).compareToIgnoreCase(words.get(current)) < 0) {
					String swap = words.get(i);
					words.set(i, words.get(current));
					words.set(current, swap);
					
					run = true;
				}
				current = i;
			}
		}
		return words;
	}
	

}
