Here I will Write All Java Method logic.




private static String[] finalString(String str1[], String str2[]) {
		String result[] = new String[str1.length + str2.length];
		for (int i = 0; i < str1.length; i++) {
			result[i] = str1[i];
		}
		for (int j = 0; j < str2.length; j++) {
			result[str1.length+j] = str2[j];
		}
		return result;
	}
private static String subString(String str, int startFrom, int endBefore) {
		String newStr = "";
		for (int i = startFrom; i < endBefore; i++) {
			char charValue = str.charAt(i);
			newStr += charValue;
//			newStr += String.valueOf(str.charAt(i));
		}

		return newStr;
	}