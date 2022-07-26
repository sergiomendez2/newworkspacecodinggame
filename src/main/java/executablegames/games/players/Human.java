package executablegames.games.players;
import executablegames.games.HangManGame.game.Game;
import executablegames.games.ttt.Board;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Human extends Player {
    Board board;

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

    public boolean placePieceX(int position, String pieceType) {
        int row = (position - 1) / 3;
        int col = (position - (row * 3)) - 1;
        //fila y columna en base a posicion
        if (board.getBoard()[row][col] == 0) {
            if (pieceType.equals("X")) board.getBoard()[row][col] = 1;
            if (pieceType.equals("O")) board.getBoard()[row][col] = 2;
            return true;
        }
        return false;
    }
}
