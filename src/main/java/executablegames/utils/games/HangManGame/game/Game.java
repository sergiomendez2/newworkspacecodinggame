package executablegames.utils.games.HangManGame.game;

import java.util.Scanner;

public class Game {
    public GamePlayer [] players;
    public static  Scanner scanner = new Scanner(System.in);
    public void resume() {
        // TODO implement here
    }
    public void play() {
        // TODO implement here
    }

    public void getPlayer(GamePlayerListProvider getplayers) {
        players = getplayers.getPlayer(10);
    }

}
