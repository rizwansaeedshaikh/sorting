
public class AlgoCheckIfStringHasUniqueChars {

	public static void main(String[] args) {

		String lInput = "abcdefghizz";
		boolean lAllUnique = true;
		for (int i = 97; i <= 122; i++) {
			if (lInput.indexOf((char) i) != lInput.lastIndexOf((char) i)) {
				lAllUnique = false;
				break;
			}
		}
		if (!lAllUnique)
			System.out.println("String has duplicate characters");
		else
			System.out.println("String has unique characters");

		lAllUnique = true;
		boolean[] lCharsetArray = new boolean[256];
		for (int i = 0; i < lInput.length(); i++) {
			if (lCharsetArray[lInput.charAt(i)]) {
				lAllUnique = false;
				break;
			}
			lCharsetArray[lInput.charAt(i)] = true;
		}
		if (!lAllUnique)
			System.out.println("String has duplicate characters");
		else
			System.out.println("String has unique characters");

		System.out.println(1 << 3);
		System.out.println(0 & 2);
		System.out.println(1 | 1);

		System.out.println(hasUnique(lInput));
		System.out.println(Integer.MAX_VALUE);
	}

	public static boolean hasUnique(String aStr) {

		int checker = 0;
		for (int i = 0; i < aStr.length(); ++i) {
			int val = aStr.charAt(i) - 'a';
			System.out.println("checker: " + checker + " aStr.charAt(i): " + aStr.charAt(i) + " (1 << val): " + (1 << val)
					+ " (checker & (1 << val): " + (checker & (1 << val)) + " checker | (1 << val): " + (checker | (1 << val)));
			if ((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;

	}
}
