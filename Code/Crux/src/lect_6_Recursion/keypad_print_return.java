package lect_6_Recursion;

public class keypad_print_return {

	public static void main(String[] args) {
		String[] s = returnkeypad("239");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println();
       printkeypad("234","");
	}

	public static String[] keypad_ref(char c) {
		if (c == '1') {
			return new String[] { "a", "b", "c" };
		} else if (c == '2') {
			return new String[] { "d", "e", "f" };
		} else if (c == '3') {
			return new String[] { "g", "h", "i" };
		} else if (c == '4') {
			return new String[] { "j", "k", "l" };
		} else if (c == '5') {
			return new String[] { "m", "n", "o" };
		} else if (c == '6') {
			return new String[] { "p", "q", "r" };
		} else if (c == '7') {
			return new String[] { "s", "t", "u" };
		} else if (c == '8') {
			return new String[] { "v", "w", "x" };
		} else if (c == '9') {
			return new String[] { "y", "z" };
		} else {
			return new String[] { "" };
		}

	}

	public static String[] returnkeypad(String s) {
	if (s.length() == 1) {

		return keypad_ref(s.charAt(0));
		}
		String small = s.substring(1);
		String[] k = returnkeypad(small);
		char current = s.charAt(0);
		String[] t = keypad_ref(current);
		String[] big = new String[k.length * t.length];
		int c = 0;
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < k.length; j++) {
				big[c] = t[i] + k[j];
				c++;
			}
		}
		return big;
	}

	public static void printkeypad(String s, String opsofar) {
		if (s.length() == 0) {
			System.out.println(opsofar);
			return;
		}
		char c = s.charAt(0);
		String[] t = keypad_ref(c);
		for (int i = 0; i < t.length; i++) {
			printkeypad(s.substring(1), opsofar + t[i]);
		}
	}

}
