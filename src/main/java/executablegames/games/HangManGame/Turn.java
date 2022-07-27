package executablegames.games.HangManGame;

import executablegames.games.players.Player;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class Turn{
    Scanner sc = new Scanner(System.in);
    private WordGiverable wordGiverable;
    private WordGuesserable wordGuesserable;
    private HangedMan hangedman = new HangedMan();

   public Turn(int maxAttempts, Player player1, Player player2) {
       wordGiverable = (WordGiverable) player1;
       wordGuesserable =(WordGuesserable) player2;
       boolean isGameOver = false;
       boolean isLetterGuessed = false;
       String word = wordGiverable.giveWord();
       System.out.println(hangedman.separateSecretWordInLine(word));
       do {
           System.out.println("tries left: " +maxAttempts);
           System.out.println(hangedman.secretWordSeparatedByLine);
           char letter = wordGuesserable.tryLetter();
           for (int i = 0; i < word.length(); i++) {
               if (word.charAt(i) == letter) {
                   hangedman.secretWordSeparatedByLine[i] = letter;
                   isLetterGuessed = true;
               }

           } //if letter is not in word, decrease attempts
               if (!isLetterGuessed) {
                   --maxAttempts;
                   if (maxAttempts == 0) {
                       System.out.println("You lost");
                       isGameOver = true;
                   }
               }else{
                isGameOver = !hangedman.isSecretWordSeparatedByLine();
               if (isGameOver) {
                   System.out.println("You won");
                    isGameOver = true;
               }
               }
           }while (!isGameOver);
       }
   }
































 /*   @Override
    public String secreteWord() {
        System.out.println("Enter the secret word: ");
        String secretWordEntered = sc.nextLine();
        return secretWordEntered;
    }

    @Override
    public String guessSecretWord() {
        return secreteWord();
    }

    @Override
    public char tryLetter() {
        System.out.println("Enter a letter: ");
        String letter = sc.nextLine();
        return letter.charAt(0);
    }

    @Override
    public void askForHint() {
        secretWordHidden = separateSecretWordInLine(guessSecretWord());
        char letter = guessSecretWord().charAt(0);
        for(int i = 0; i <guessSecretWord().length(); i++){
            secretWordHidden[i] = letter;
        }
    }

    private char[] separateSecretWordInLine(String secretWord) {
        int lengthOfSecretWord = secretWord.length();
        char[] secretWordHyphenate = new char[lengthOfSecretWord];
        for (int i = 0; i < secretWordHyphenate.length; i++) {
            secretWordHyphenate[i] = '_';
        }
        return secretWordHyphenate;
    }*/

    /*       player1 =
        hangedman.giveHint(wordGiverable.secreteWord());
        int attempts = 0;
        while(attempts < maxAttempts){
            String guess = sc.nextLine();
            if(wordGuesserable.guessWord(guess)){
                System.out.println("you won");
                break;
            }
            else{
                hangedman.drawHangedMan(attempts);
                attempts++;
            }
        }
        if(attempts == maxAttempts){
            System.out.println("you lost");
        }*/
