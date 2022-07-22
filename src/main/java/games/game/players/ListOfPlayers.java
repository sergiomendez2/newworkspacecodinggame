package games.game.players;
import games.game.Game;
import games.gamePlayerListProvider;
public class ListOfPlayers implements gamePlayerListProvider{
    Player[] players = new Player[10];
    public void createPlayer() {
        players[0] = new Boot(1, "Boot 1");
        players[1] = new Boot(2, "Boot 2");

        for (int i = 2; i <= 10; i++) {
            System.out.println("Enter the name of player ");
            String name = Game.scanner.nextLine();
            int id = players.length + 1;
            players[i] = new Human(id, name);
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