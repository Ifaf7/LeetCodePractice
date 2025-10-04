package StringProblems;

public class ReverseOnlyCharacters {

	public static void main(String[] args) {
		String s = "ab-cd";
		ReverseOnlyCharacters obj = new ReverseOnlyCharacters();
		String reverseString = obj.reverseOnlyLetters(s);
		System.out.println(reverseString);
	}

	public String reverseOnlyLetters(String s) {
		char[] ch = s.toCharArray();
		char temp = 0;
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			if (!Character.isLetter(ch[i])) {
				i++;
			} else if (!Character.isLetter(ch[j])) {
				j--;
			} else {
				temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
		}
		String str = new String(ch);
		return str;
	}
}
