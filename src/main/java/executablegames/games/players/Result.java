package executablegames.games.players;

import executablegames.games.TypeGame;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Result {

    private int win;
    private int lose;
    private int tie;
    private Player Player;
    private TypeGame typeGame;

    public Result(int win, int lose, int tie, Player player, TypeGame typeGame) {
        this.win = win;
        this.lose = lose;
        this.tie = tie;
        Player = player;
        this.typeGame = typeGame;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getTie() {
        return tie;
    }

    public void setTie(int tie) {
        this.tie = tie;
    }

    public executablegames.games.players.Player getPlayer() {
        return Player;
    }

    public void setPlayer(executablegames.games.players.Player player) {
        Player = player;
    }

    public TypeGame getTypeGame() {
        return typeGame;
    }

    public void setTypeGame(TypeGame typeGame) {
        this.typeGame = typeGame;
    }
}
