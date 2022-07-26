package executablegames.games.players;
import executablegames.games.HangManGame.game.Game;
import executablegames.games.ttt.Board;
import lombok.NoArgsConstructor;
import java.util.Random;
import java.util.Scanner;
@NoArgsConstructor
public class Boot extends Player {
    Board board;
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
        System.out.println("showing result from Boot Player first");
        ResultTempo result = new ResultTempo();
        System.out.println(result.toString());
    }
    public boolean placePiece0(String pieceType){
        Scanner userInputReader = new Scanner(System.in);
        System.out.println("Please enter a position for 0:");
        int position = userInputReader.nextInt();
        int row = (position-1)/3;
        int col = (position - (row*3))-1;
        boolean wasPiecePlace = false;
        while(!wasPiecePlace && !board.isFull()) {
            if(board.getBoard()[row][col]==0) {
                wasPiecePlace=true;
                if (pieceType.equals("X")) board.getBoard()[row][col] = 1;
                if (pieceType.equals("O")) board.getBoard()[row][col] = 2;
            }else{
                row = new Random().nextInt(3);
                col = new Random().nextInt(3);
            }
        }
        return wasPiecePlace;
    }
}
