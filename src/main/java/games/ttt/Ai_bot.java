package main.java.games.ttt;
import main.java.games.ttt.Board;
import java.util.Random;
public class Ai_bot{
    public boolean placePieceRandomly(String pieceType){
        int row = new Random().nextInt(3);
        int col = new Random().nextInt(3);
        boolean wasPiecePlace = false;
        while(!wasPiecePlace && !isFull()) {
            if(Board.board[row][col]==0) {
                wasPiecePlace=true;
                if (pieceType.equals("X")) Board.board[row][col] = 1;
                if (pieceType.equals("O")) Board.board[row][col] = 2;
            }else{
                row = new Random().nextInt(3);
                col = new Random().nextInt(3);
            }
        }
        return wasPiecePlace;
    }
}