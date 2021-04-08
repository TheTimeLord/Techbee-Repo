package StringManipulation;

public class Vowels {
	
	public static int countVowels(String str) {
		int numVowels = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				numVowels++;
		}
		return numVowels;
	}
}
