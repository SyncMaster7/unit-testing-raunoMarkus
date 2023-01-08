public class letterCountClass {

    public static int[] letterCount(String word) {
        int[] letterCount = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                int index = c - 'a';
                letterCount[index]++;
            }
        }
        return letterCount;
    }
}

