package games.game;

import games.game.players.Player;

import java.util.Scanner;

public class Game {
    public static  Scanner scanner = new Scanner(System.in);
    public void resume() {
        // TODO implement here
    }
    public void play() {
        // TODO implement here
    }

    public void getPlayer(GamePlayerListProvider getplayers) {
        Player [] players = getplayers.getPlayer(10);
    }

}
