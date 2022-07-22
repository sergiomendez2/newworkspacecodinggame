package games.game.players;

import games.game.Game;

import java.util.Random;

public class Boot extends Player {
    private final  String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public Boot(int id, String name) {
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
        Random random = new Random();
        char randomIndex =ABC.charAt(random.nextInt(ABC.length()));
        return randomIndex;
    }

    @Override
    public void askForHint() {
        System.out.println("I need a Hint");
    }

    @Override
    public void result() {

    }
}
