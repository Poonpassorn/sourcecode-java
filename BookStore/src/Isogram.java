import java.util.HashSet;
import java.util.Set;

public class Isogram {

	public boolean check(String input) {
		int length = input.length();
		input = input.replaceAll(" ", "");
		input = input.replaceAll("-", "");

		Set<Character> uniqString = new HashSet<Character>();
		for (int i = 0; i < length; i++) {
			char charAt = input.charAt(i);
			if (!uniqString.add(charAt)) {
				return false;
			}
		}

		return true;
	}

}
