package executablegames.games.HangManGame.game;

import executablegames.games.HangManGame.HangMan;
import executablegames.games.HangManGame.Round;
import executablegames.games.HangManGame.Turn;
import executablegames.games.players.Human;
import executablegames.games.players.Player;

import java.util.Scanner;

public class Game {
    public GamePlayer [] players;
    HangMan hangMan;
    GamePlayerListProvider gameProvider;
    Turn turn;
    Round round;
    public static  Scanner scanner = new Scanner(System.in);
    public void resume() {
        // TODO implement here
    }
    public void play() {

        System.out.println(" available Players:");
        for (int i = 0; i < players.length; i++) {
            System.out.println( players[i].toString());
        }
        int option = 0;
        System.out.println("Player 1: ");
        option = scanner.nextInt();
        Player player1 = (Human) players[option];
        System.out.println("Player 2: ");
        option = scanner.nextInt();
        Player player2 = (Human) players[option];
        int rounds =0;
        do{
            turn = new Turn(hangMan.MAX_ATTEMPTS, player1, player2);
            round.reservePlayerTurn(player1, player2);
            rounds++;
        }while(rounds!=2);

    }

    public void getPlayer() {
        players = gameProvider.getPlayer(hangMan.getAmountOfPlayers());
    }

}
