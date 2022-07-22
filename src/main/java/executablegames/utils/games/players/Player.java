package executablegames.utils.games.players;

import executablegames.utils.games.players.ListOfResults;
import executablegames.utils.games.HangManGame.game.GamePlayer;

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
