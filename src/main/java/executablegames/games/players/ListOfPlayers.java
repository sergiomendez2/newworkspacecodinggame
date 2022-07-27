package executablegames.games.players;
import executablegames.games.ttt.game.gamePlayerListProvider;
import executablegames.games.HangManGame.game.HangManGame;

public class ListOfPlayers implements gamePlayerListProvider {
     public static Player[] players = new Player[10];
    public void createPlayer() {
        players[0] = new Boot(1, "Boot 1");
        players[1] = new Boot(2, "Boot 2");
        int idPlayer = 2;
        for (int i = 2; i <= 9; i++) {
            System.out.println("Enter the name of player:  "+ " "+(1+i));
            String name = HangManGame.scanner.nextLine();
            idPlayer++;
            players[i] = new Human(idPlayer, name);
        }
        System.out.println("Players are created");
    }



    @Override
    public Player[] getPlayer(int totalPlayers) {
        if (players.length == 0) {
            System.out.println("No players available");
            return null;
        }
        Player[] playersListTempo = new Player[totalPlayers];
        for (int i = 0; i < totalPlayers; i++) {
            playersListTempo[i] = players[i];
        }
        return playersListTempo;
    }

}
