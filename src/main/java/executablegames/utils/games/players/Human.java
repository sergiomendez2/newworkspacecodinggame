package executablegames.utils.games.players;

import executablegames.utils.games.HangManGame.game.Game;

public class Human extends Player {

    public Human(int id, String name) {
        super(id, name);
    }

    @Override
    public String giveWord() {
        System.out.println("Enter the secret word: ");
        Game.scanner.nextLine();
        String word = Game.scanner.nextLine();
        return word;
    }

    @Override
    public String guessSecretWord() {
        return giveWord();
    }

    @Override
    public char tryLetter() {
        System.out.println("Enter the letter: ");
        char letter = Game.scanner.nextLine().charAt(0);
        return letter;
    }

    @Override
    public void askForHint() {
        System.out.println("I need a Hint");
    }

    @Override
    public void result() {
        System.out.println("showing result from human Player");
        ResultTempo result = new ResultTempo();
        System.out.println(result.toString());
    }
}
