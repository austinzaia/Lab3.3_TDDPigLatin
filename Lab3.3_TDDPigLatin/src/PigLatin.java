
public class PigLatin {

	public static void main(String[] args) {
		String word = translate("SLOWLY");
		System.out.println(word);
	}

	public static boolean findVowel(char c) {
		return (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U'
				|| c == 'u');
	}
	public static int findVowelIndex (String word) {
		int length = word.length();
		for (int i = 0; i < length; i ++) {
			if (findVowel(word.charAt(i))) {
				return i;
			}
		}
		return -1;
	}
	public static String translate (String word) {
		String wordLower = word.toLowerCase();
		String wordTranslate = "";
		int i = findVowelIndex(wordLower);
		if (i > 0) {
			wordTranslate = wordLower.substring(i) + wordLower.substring(0, i) + "ay";
		} else if (i == 0) {
			wordTranslate = wordLower + "way";
			return wordTranslate;
		} else {
			wordTranslate = wordLower;
		}
		return wordTranslate;
	}
	
}
