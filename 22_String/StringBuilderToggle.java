import java.util.Scanner;

public class StringBuilderToggle {

	public static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);

			if (Character.isUpperCase(ch)) {
				sb.setCharAt(i, Character.toLowerCase(ch));
			} else  {
				sb.setCharAt(i, Character.toUpperCase(ch));
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(toggleCase(input));
		sc.close();
	}
}

class StringToggle {
	
	public static String toggle(String str) {
		char[] chars = str.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if (Character.isUpperCase(chars[i])) {
				chars[i] = Character.toLowerCase(chars[i]);
			} else if (Character.isLowerCase(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
			}
		}
		
		return new String(chars);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(toggle(input));
		sc.close();
	}
}
