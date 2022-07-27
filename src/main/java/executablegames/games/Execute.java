package executablegames.games;

import com.sun.tools.javac.Main;
import executablegames.games.HangManGame.game.HangManGame;
import executablegames.games.players.ListOfPlayers;
import executablegames.games.players.ListOfResult;

public class Execute {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       MainGames mainGames = new MainGames();
        ListOfPlayers listOfPlayers = new ListOfPlayers();
        listOfPlayers.createPlayer();
        HangManGame hangManGame = new HangManGame();
        hangManGame.getPlayer();
        hangManGame.play();
        mainGames.executeOption();
    }
}
