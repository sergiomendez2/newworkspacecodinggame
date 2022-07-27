package executablegames.games;

import com.sun.tools.javac.Main;
import executablegames.games.HangManGame.game.HangManGame;
import executablegames.games.players.ListOfPlayers;
import executablegames.games.players.ListOfResult;
import executablegames.games.players.Result;


public class Execute {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MainGames mainGames = new MainGames();
        ListOfPlayers listOfPlayers = new ListOfPlayers();
        ListOfResult listOfResult = new ListOfResult();
        listOfPlayers.createPlayer();
        HangManGame hangManGame = new HangManGame();
        hangManGame.play();

    }
}
