package main.java.games.ttt;
import main.java.games.ttt.Board;
public class Human{
    public boolean placePiece(int position, String pieceType){
        // numero dela posicion de la matriz, caracter a ingresar ^
        int row = (position-1)/3;
        int col = (position - (row*3))-1;
        //fila y columna en base a posicion
        if(Board.board[row][col] == 0) {
            if (pieceType.equals("X")) Board.board[row][col] = 1;
            if (pieceType.equals("O")) Board.board[row][col] = 2;
            return true;
        }
        return false;
    }
}