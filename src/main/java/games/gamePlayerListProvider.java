package games;

import games.players.Player;

public interface gamePlayerListProvider  {

    Player[] getPlayer(int totalPlayers);
}
