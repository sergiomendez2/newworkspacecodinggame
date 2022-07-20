public abstract class TicTacToe(){
    public static main() {
        Scanner userInputReader = new Scanner(System.in);

        Board board = new Board();
        board.instructionBoard();
        System.out.println("Please enter a position:");
        int position = userInputReader.nextInt();
        board.placePiece(position, "X");

        boolean isGameInProgress = true;

        while( isGameInProgress && !board.isFull()){

            board.placePieceRandomly("O");
            board.displayBoard();
            System.out.println("Please enter a position:");
            position = userInputReader.nextInt();
            board.placePiece(position, "X");

            isGameInProgress = GameResolver.resolve(board.getBoard())==GameResolver.GameState.IN_PROGRESS;

        }
        if(!isGameInProgress) {
            board.displayBoard();
            System.out.print(" GAME OVER!!!");
        }
        else board.displayBoard();
    }
}