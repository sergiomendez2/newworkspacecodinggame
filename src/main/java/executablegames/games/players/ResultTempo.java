package executablegames.games.players;

import executablegames.games.TypeGame;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ResultTempo {
    private int win;
    private int lose;
    private int tie;
    private  TypeGame typeGame;

    public ResultTempo(int win, int lose, int tie, TypeGame typeGame) {
        this.win = win;
        this.lose = lose;
        this.tie = tie;
        this.typeGame = typeGame;
    }

    @Override
    public String toString() {
        return "Result{" +
                "win=" + win +
                ", lose=" + lose +
                ", tie=" + tie +
                ", TypeGame=" + typeGame +
                '}';
    }
}
