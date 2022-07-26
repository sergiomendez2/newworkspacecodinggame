package executablegames.games.ttt.game;

import executablegames.games.players.Player;

public interface gamePlayerListProvider  {
    Player[] getPlayer(int totalPlayers);
}
