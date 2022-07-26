package executablegames.games;

import executablegames.games.players.ListOfResult;

public class Statistics {
    ListOfResult results;

    public void showStatistics(){
        for(int i=0; i< results.results.size(); i++){
            //System.out.println("Name: " + results.results.get(i).getPlayer().getClass());
            //System.out.println("Total wins: " + results.results.get(i).getWin());
            //System.out.println("Total loses: " + results.results.get(i).getLose());
            //System.out.println("Total ties: " + results.results.get(i).getTie());
        }
    }
}
