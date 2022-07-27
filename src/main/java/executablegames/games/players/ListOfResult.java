package executablegames.games.players;

import executablegames.games.TypeGame;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class ListOfResult extends Result {
    public static  List<Result> results = new ArrayList<>();

    public ListOfResult(int win, int lose, int tie, Player player, TypeGame typeGame) {
        super(win, lose, tie, player, typeGame);
    }

    public static void add(Result result) {
        results.add(result);
    }
}
