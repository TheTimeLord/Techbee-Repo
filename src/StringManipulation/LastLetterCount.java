package StringManipulation;
import java.lang.StringBuilder;

public class LastLetterCount {
	public static void lastLetter(String str) {
		String strTemp = str.toLowerCase();
		int numS = 0;
		int numY = 0;
		int endS = strTemp.indexOf("s ");
		int endY = strTemp.indexOf("y ");
		int startS = 0;
		int startY = 0;
		StringBuilder sb = new StringBuilder();
		
		// count the number of words that end with s
		int lastSIndex = 0;
		while(lastSIndex != -1) {
			lastSIndex = strTemp.indexOf("s ", lastSIndex);
			if(lastSIndex != -1) {
				numS++;
				lastSIndex += 2;
			}
		}
		// count the number of words that end with y
		int lastYIndex = 0;
		while(lastYIndex != -1) {
			lastYIndex = strTemp.indexOf("y ", lastYIndex);
			if(lastYIndex != -1) {
				numY++;
				lastYIndex += 2;
			}
		}
		
		
		
		// get the last index of the first words that end with s and y
		if(endS == -1 && strTemp.charAt(str.length()-1) == 's') {
			endS = strTemp.length() - 1;
			numS++;
		}
		else if(endY == -1 && strTemp.charAt(str.length()-1) == 'y') {
			endY = strTemp.length() - 1;
			numY++;
		}
		
		// Find the start of the first word ends with S
		for(int i=endS; i>=0; i--) {
			if(strTemp.charAt(i) == ' ') {
				startS = i;
				break;
			}
		}
		
		// Find the start of the first word ends with Y
				for(int i=endY; i>=0; i--) {
					if(strTemp.charAt(i) == ' ') {
						startY = i;
						break;
					}
				}
		
		// Start building the new sentence
		if(startY < startS) {
			sb.append(str.substring(0, startY+1));
			sb.append(str.substring(startS+1, endS+1));
			sb.append(str.substring(endY+1, startS+1));
			sb.append(str.substring(startY+1, endY+1));
		}
		else {
			sb.append(str.substring(0, startS+1));
			sb.append(str.substring(startY+1, endY+1));
			sb.append(str.substring(endS+1, startY+1));
			sb.append(str.substring(startS+1, endS+1));
		}
		System.out.println("# of words that end with s: " + numS);
		System.out.println("# of words that end with y: " + numY);
		System.out.println(sb.toString());
	}
}
