package executablegames.utils.games.players;


import executablegames.utils.games.HangManGame.game.GamePlayer;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Player implements GamePlayer {
    private int id;
    private String name;
    ListOfPlayers listOfResults;
    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
