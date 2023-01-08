import java.util.Scanner;

public class letterCountMain {

    letterCountClass Main = new letterCountClass();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        int[] letterCounts = letterCountClass.letterCount(word);
        for (int i = 0; i < letterCounts.length; i++) {
            char letter = (char) (i + 'a');
            int count = letterCounts[i];
            System.out.println(letter + ": " + count);
            for (int j = 0; j < count; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}



