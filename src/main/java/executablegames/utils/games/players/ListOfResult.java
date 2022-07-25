package executablegames.utils.games.players;

import java.util.ArrayList;
import java.util.List;

public class ListOfResult extends Result {
    public List<Result> results = new ArrayList<>();

    public ListOfResult(int win, int lose, int tie, Player player) {
        super(win, lose, tie, player);
    }

    public void add(Result result) {
        results.add(result);
    }
}
