import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String secretWord = "hangman";
        int maxWrongGuesses = 6;
        int wrongGuesses = 0;
        char[] displayWord = new char[secretWord.length()];
        boolean gameOver = false;

        // initialize displayWord to all blanks
        for (int i = 0; i < secretWord.length(); i++) {
            displayWord[i] = '_';
        }

        while (!gameOver) {
            // display the current hangman graphic
            displayHangman(wrongGuesses);

            // display the current displayWord
            System.out.println(displayWord);

            // take input from the player
            System.out.println("Enter a letter:");
            char guess = new Scanner(System.in).next().charAt(0);

            // check if the letter is in the secret word
            boolean found = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    displayWord[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                wrongGuesses++;
            }

            // check if the game is over
            if (wrongGuesses == maxWrongGuesses) {
                displayHangman(wrongGuesses);
                System.out.println("You lose! The word was " + secretWord);
                gameOver = true;
            } else if (new String(displayWord).equals(secretWord)) {
                System.out.println("You win! The word was " + secretWord);
                gameOver = true;
            }
        }
    }

    public static void displayHangman(int wrongGuesses) {
        System.out.println("  ____");
        System.out.println(" |    |");
        System.out.println(" |    " + (wrongGuesses > 0 ? "O" : ""));
        System.out.println(" |   " + (wrongGuesses > 1 ? "/" : "") + (wrongGuesses > 2 ? "|" : "") + (wrongGuesses > 3 ? "\\" : ""));
        System.out.println(" |   " + (wrongGuesses > 4 ? "/" : "") + " " + (wrongGuesses > 5 ? "\\" : ""));
        System.out.println("_|_");
        System.out.println();
    }
}
