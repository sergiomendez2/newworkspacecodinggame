package executablegames.games.HangManGame.game;

import executablegames.games.HangManGame.HangMan;
import executablegames.games.HangManGame.Round;
import executablegames.games.HangManGame.Turn;
import executablegames.games.players.Human;
import executablegames.games.players.ListOfPlayers;
import executablegames.games.players.Player;

import java.util.Scanner;

public class HangManGame {
    public ListOfPlayers players = new ListOfPlayers();
    HangMan hangMan = new HangMan();
    Player [] gamePlayers = new Player[10];

    Turn turn;
    Round round = new Round();
    public static  Scanner scanner = new Scanner(System.in);
    public void resume() {
        // TODO implement here
    }
    public void play() {
        getPlayer();
        System.out.println(" available Players:");

        for (int i = 0; i < gamePlayers.length; i++) {
            gamePlayers[i] = players.getPlayer(10)[i];
        }

        for(Player p : gamePlayers) {
            System.out.println("name: "+p.getId() + " ID: " + p.getName());
        }

        int option = 0;
        System.out.println("Player 1: ");
        option = scanner.nextInt();
        Player player1 = new Human(option, gamePlayers[option-1].getName());
        System.out.println("Player 2: ");
        option = scanner.nextInt();
        Player player2 = new Human(option, gamePlayers[option-1].getName());

            System.out.println("Round 1: " + player1.getName() + " vs " + player2.getName());
            turn = new Turn(hangMan.MAX_ATTEMPTS, player1, player2);
            round.reservePlayerTurn(player1, player2);
    }
    public void getPlayer() {}

}
