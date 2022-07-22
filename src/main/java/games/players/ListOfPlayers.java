package games.players;
import games.gamePlayerListProvider;
public class ListOfPlayers implements gamePlayerListProvider{
    Player[] players;
    public void createPlayer() {}
    @Override
    public Player[] getPlayer(int totalPlayers) {
        players = new Player[totalPlayers];
        return players;
    }

}
