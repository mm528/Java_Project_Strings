import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;

public class RegEx_Strings {
	public static void main(String[] args) {
		String character = "M";
		String characeter2 = "N";
		String name = "TesTMichalisNike";
		
		
		String name2 = groupingM(character, name);// Send the N
		groupingN(characeter2, name2);

	}

	public static String groupingM(String chare, String name) {

		ArrayList<Integer> getNum = new ArrayList<Integer>();
		
		StringBuffer newWord = new StringBuffer(name.length());
		Pattern pattern = Pattern.compile(chare);

		Matcher matcher = pattern.matcher(name);

		newWord.append(name);

		while (matcher.find()) {
			getNum.add(matcher.start());
			
		}

		for (int i = getNum.size() - 1; i >= 0; i--) {
			newWord.deleteCharAt(getNum.get(i));
			for (int j = 2; j > 0; j--) {
				if (getNum.get(i) > 0) {

					newWord.insert(getNum.get(i).intValue(), newWord.charAt(getNum.get(i) - 1));

				}
			}

		}

		System.out.println(newWord.toString());

		return newWord.toString();
	}

	public static String groupingN(String chare, String name) {

		ArrayList<Integer> getNum = new ArrayList<Integer>();
		
		StringBuffer newWord = new StringBuffer(name.length());
		Pattern pattern = Pattern.compile(chare);

		Matcher matcher = pattern.matcher(name);

		newWord.append(name);

		while (matcher.find()) {
			getNum.add(matcher.start());
			System.out.println(matcher.start());
			

		}

		for (int i = getNum.size() - 1; i >= 0; i--) {
			newWord.deleteCharAt(getNum.get(i));

			for (int j = 0; j < 2; j++) {
				if (getNum.get(i) >= 0) {
					if (!(getNum.get(i).intValue() + j > newWord.length()))
						if (((getNum.get(i).intValue() + j) != 0)) {
							
							newWord.deleteCharAt(getNum.get(i).intValue());
						}else {
							newWord.deleteCharAt(getNum.get(i).intValue()+j);
						}
				}

			}
		}

		System.out.println(newWord.toString());
		return "";
	}

}