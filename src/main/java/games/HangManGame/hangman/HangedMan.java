package games.HangManGame.hangman;

import java.util.Random;

public class HangedMan {

    private char[] secretWordSeparatedByLine;
    Random random = new Random();

    public void giveHint(String  SecretWord) {
        separateSecretWordInLine(SecretWord);
        int randomCharIndex = random.nextInt(SecretWord.length());
        char randomChar = SecretWord.charAt(randomCharIndex);
        System.out.println("the secrete word contains the letter " + randomChar);
    }
    private char[] separateSecretWordInLine(String secretWord) {
        int lengthOfSecretWord = secretWord.length();
        secretWordSeparatedByLine = new char[lengthOfSecretWord];
        for (int i = 0; i < secretWordSeparatedByLine.length; i++) {
            secretWordSeparatedByLine[i] = '_';
        }
        return secretWordSeparatedByLine;
    }
}
