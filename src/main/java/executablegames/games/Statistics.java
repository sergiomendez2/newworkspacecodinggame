package executablegames.games;

import executablegames.games.players.ListOfResult;
import executablegames.games.players.Result;

import java.util.stream.Collectors;

public class Statistics {


    public void showStatistics(){
        for(Result result : ListOfResult.results){
            System.out.println("Player's name: "
                    +result.getPlayer().getName()
                    + " TypeGame: " + result.getTypeGame()
                    + " Win: " + result.getWin()
                    + " Lose: " + result.getLose());
        }
    }

    public void showStatisticsByPlayer(String playerName){
        Result player =(Result) ListOfResult.results.stream()
                .filter(result -> result.getPlayer().getName().equalsIgnoreCase(playerName))
                .collect(Collectors.toList());

        if(player != null){
            System.out.print("Player's name: "
                    +player.getPlayer().getName()
                    + " TypeGame: " + player.getTypeGame()
                    + " Win: " + player.getWin()
                    + " Lose" + player.getLose());
        }else{
            System.out.println("Player not found or didn't play any game yet");
        }

    }
}
