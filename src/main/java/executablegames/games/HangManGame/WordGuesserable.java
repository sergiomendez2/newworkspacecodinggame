package executablegames.games.HangManGame;

public interface WordGuesserable {
    public String guessSecretWord();
    public char tryLetter();
    public void askForHint();

}
