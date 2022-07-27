package executablegames.games.HangManGame;

import executablegames.games.players.Human;
import executablegames.games.players.Player;

public class Round {
    Turn turn;
    HangMan hangMan = new HangMan();
    public void reservePlayerTurn(Player player1, Player player2) {
         Player TempPlayer = player1;
         player1 = player2;
         player2 = TempPlayer;
         System.out.println("Round 2: " + player1.getName() + " vs " + player2.getName());
         turn = new Turn(hangMan.MAX_ATTEMPTS, player1, player2);
    }
}
