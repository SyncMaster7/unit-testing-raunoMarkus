import java.util.Scanner;


public class letterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        int[] letterCounts = letterCount(word);
        for (int i = 0; i < letterCounts.length; i++) {
            char letter = (char) (i + 'a');
            int count = letterCounts[i];
            System.out.println(letter + ": " + count);
            for(int j = 0; j < count;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }

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

