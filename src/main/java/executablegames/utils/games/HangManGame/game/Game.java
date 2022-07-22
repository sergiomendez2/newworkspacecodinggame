package executablegames.utils.games.HangManGame.game;

import java.util.Scanner;

public class Game {
    public GamePlayer [] players;
    public static  Scanner scanner = new Scanner(System.in);
    public void resume() {
        // TODO implement here
    }
    public void play() {
        System.out.println("select Players");


    }

    public void getPlayer(GamePlayerListProvider getplayers) {
        players = getplayers.getPlayer(10);

    }

}
