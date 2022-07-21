package games.HangManGame.hangman;

public interface WordGuesserable {
    public String guessSecretWord();
    public char tryLetter();
    public void askForHint();

}
