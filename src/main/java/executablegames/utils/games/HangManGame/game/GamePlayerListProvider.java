package executablegames.utils.games.HangManGame.game;

import executablegames.utils.games.players.Player;

public interface GamePlayerListProvider {
    public Player[] getPlayer(int totalPlayers);
}

