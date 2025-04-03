import java.util.ArrayList;
public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(perms("happy"));
	}

	public static ArrayList<String> perms(String str1) {
		ArrayList<String> perms1 = new ArrayList<String>();
		permsHelper("", str1, perms1);
		return perms1;
	}

	public static void permsHelper(String usedLetters, String unusedLetters, ArrayList<String> perms1) {
		if (unusedLetters.equals("")) {
			perms1.add(usedLetters);
			return;
		}

		for (int i = 0; i < unusedLetters.length(); i++) {
			String usedLetters0 = usedLetters + unusedLetters.charAt(i);
			String unusedLetters0 = unusedLetters.substring(0, i) + unusedLetters.substring(i + 1);
			permsHelper(usedLetters0, unusedLetters0, perms1);

		}
		

	}


	public static ArrayList<String> permsUnique(String str2) {
		ArrayList<String> perms2 = new ArrayList<String>();
		permsUniqueHelper("", str2, perms2);
		return perms2;
	}

	public static void permsUniqueHelper(String usedLetters, String unusedLetters, ArrayList<String> perms2) {
		if (unusedLetters.equals("")) {
			if (!perms2.contains(usedLetters)) {
				perms2.add(usedLetters);
			}
			return;
		}

		for (int i = 0; i < unusedLetters.length(); i++) {
			String usedLetters0 = usedLetters + unusedLetters.charAt(i);
			String unusedLetters0 = unusedLetters.substring(0, i) + unusedLetters.substring(i + 1);
			permsUniqueHelper(usedLetters0, unusedLetters0, perms2);

		}
		
		
	}

	

}
