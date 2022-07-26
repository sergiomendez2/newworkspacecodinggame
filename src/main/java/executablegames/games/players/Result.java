package executablegames.games.players;

import executablegames.games.TypeGame;

public class Result {

    private int win;
    private int lose;
    private int tie;
    private Player Player;
    private TypeGame typeGame;

    public Result(int win, int lose, int tie, executablegames.games.players.Player player, TypeGame typeGame) {
        this.win = win;
        this.lose = lose;
        this.tie = tie;
        Player = player;
        this.typeGame = typeGame;
    }
}
