package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int i = 0;
		for (String string : eggs) {
			if(string.equals("cracked")) {
			i++;
			}
		}
		return i;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int i=0;
		for (Boolean b : oysters) {
			if(b) {
				i++;
			}
		}
		return i;
	}

	public static Object containsSOS(List<String> message2) {
		for (String s : message2) {
			if(())
		}
		return null;
	}

	public static List<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		return null;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		return null;
	}
}
