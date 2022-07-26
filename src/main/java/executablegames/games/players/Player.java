package executablegames.games.players;


import executablegames.games.HangManGame.game.GamePlayer;
import lombok.NoArgsConstructor;


@NoArgsConstructor
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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
