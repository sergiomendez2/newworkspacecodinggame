package games;

import games.game.players.Player;

public interface gamePlayerListProvider  {
    Player[] getPlayer(int totalPlayers);
}
