package executablegames.utils.games.HangManGame;

import executablegames.utils.games.players.Player;

public class Round {

    public void reservePlayerTurn(Player player1, Player player2) {
         Player TempPlayer = player1;
         player1 = player2;
         player2 = TempPlayer;
    }
}