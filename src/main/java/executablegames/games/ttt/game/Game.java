package executablegames.games.ttt.game;
import java.util.Scanner;
import executablegames.games.players.Boot;
import executablegames.games.players.Human;
import executablegames.games.ttt.Board;
import executablegames.games.ttt.Coordinate;

public class Game {
	public void play(){
		Scanner userInputReader = new Scanner(System.in);
		Board board = new Board();
		Human human = new Human();
		Boot boot = new Boot();
		board.getBoard();
		board.instructionBoard();
		System.out.println("Please enter a position: ");
		int position = userInputReader.nextInt();
		human.placePieceX(position, "X");
		boolean isGameInProgress = true;
		while( isGameInProgress && !board.isFull()){
			boot.placePiece0("O");
			board.displayBoard();
			System.out.println("Please enter a position:");
			position = userInputReader.nextInt();
			human.placePieceX(position, "X");
			isGameInProgress = Coordinate.resolve(board.getBoard())== Coordinate.GameState.IN_PROGRESS;
		}
		if(!isGameInProgress) {
			board.displayBoard();
			System.out.print(" GAME OVER!!!");
		}
		else board.displayBoard();
	}
}
