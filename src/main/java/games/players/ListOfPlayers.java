package games.players;
import games.gamePlayerList;
public class ListOfPlayers implements gamePlayerList{
    Player[] players;
    public void createPlayer() {}
    @Override
    public Player[] getPlayer(int totalPlayers) {
        players = new Player[totalPlayers];
        return players;
    }

}
