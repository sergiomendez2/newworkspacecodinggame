package executablegames.utils.games.players;

public class Result {

    private int win;
    private int lose;
    private int tie;
    private Player Player;

    public Result(int win, int lose, int tie, Player player) {
        this.win = win;
        this.lose = lose;
        this.tie = tie;
        Player = player;
    }


}
