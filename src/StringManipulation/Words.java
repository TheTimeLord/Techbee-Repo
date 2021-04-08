package StringManipulation;

public class Words {
	public static int countWords(String str) {
		int numWords = 0;
		if(str.length() > 0)
			numWords++;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ')
				numWords++;
		}
		return numWords;
	}
}
