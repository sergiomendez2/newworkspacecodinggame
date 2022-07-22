package games.game.players;

import executableGames.players.ListOfResults;
import games.game.GamePlayer;

public abstract class Player implements GamePlayer {
    private int id;
    private String name;
    private Player[] players;
    ListOfResults listOfResults;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
