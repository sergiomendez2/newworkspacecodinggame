package executablegames.games.HangManGame.game;

import executablegames.games.players.Player;

public interface GamePlayerListProvider {
    public Player[] getPlayer(int totalPlayers);
}

