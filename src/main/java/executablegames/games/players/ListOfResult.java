package executablegames.games.players;

import executablegames.games.TypeGame;

import java.util.ArrayList;
import java.util.List;

public class ListOfResult extends Result {
    public List<Result> results = new ArrayList<>();

    public ListOfResult(int win, int lose, int tie, Player player, TypeGame typeGame) {
        super(win, lose, tie, player, typeGame);
    }


    public void add(Result result) {
        results.add(result);
    }
}
