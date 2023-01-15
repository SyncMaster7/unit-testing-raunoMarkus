public class LetterCountClass {

//    public static int[] letterCount(String word) {
//        int[] letterCount = new int[26];
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//            if (Character.isLetter(c)) {
//                c = Character.toLowerCase(c);
//                int index = c - 'a';
//                letterCount[index]++;
//            }
//        }
//        return letterCount;
//    }

    public String givenWord;

    public LetterCountClass (String givenWord) {
        this.givenWord = givenWord;
    }

    public int countLetter() {

//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter a word(s) to count letters: ");
//        String word = scanner.nextLine();
        String editedWord = givenWord.replaceAll("\\W", "");

        int letterCount = 0;

        for (int i = 0; i < editedWord.length(); i++) {
            letterCount++; }

        System.out.println("There are " + letterCount + " letters in '" + this.givenWord + "'.");
//        System.out.println(letterCount);
        return letterCount;
    }
}

