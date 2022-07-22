package games.game;

import games.game.players.Player;

public interface GamePlayerListProvider {
    public Player[] getPlayer(int totalPlayers);
}

