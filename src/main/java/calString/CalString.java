package calString;

public class CalString {
	public int add(String input) throws Exception {
		int i = 0, result = 0;

		if (input == null)
			return 0;

		if (input.contains("-"))
			throw new Exception("negatives not allowed");

		for (i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				result = result + Integer.parseInt(input.substring(i, i + 1));
			}
		}

		return result;

	}
}
