package executablegames.utils.games.ttt.game;

import executablegames.utils.games.players.Player;

public interface gamePlayerListProvider  {
    Player[] getPlayer(int totalPlayers);
}
